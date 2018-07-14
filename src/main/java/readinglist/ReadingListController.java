package readinglist;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/readingList")
public class ReadingListController {

    private static final String reader = "craig";
  
	private ReadingListRepository readingListRepository;

	@Autowired
	public ReadingListController(ReadingListRepository readingListRepository) {
		//contorller的构造方法
		this.readingListRepository = readingListRepository;
	}
	
	@RequestMapping(method=RequestMethod.GET)
	public String readersBooks(Model model) {
		//读
		List<Book> readingList = readingListRepository.findByReader(reader);
		if (readingList != null) {
			model.addAttribute("books", readingList);
		}
		return "readingList";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String addToReadingList(Book book) {
		//写
		book.setReader(reader);
		readingListRepository.save(book);
		return "redirect:/readingList";
	}
	
}
