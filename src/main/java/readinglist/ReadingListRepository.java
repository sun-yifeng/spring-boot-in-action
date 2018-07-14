package readinglist;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 仓库接口：
 * 1、扩展JpaRepository直接继承18个常用的持久化方法，sping data自动实现这18个继承的方法；
 * 2、泛型JpaRepository有两个参数，领域对象和id；
 * */
public interface ReadingListRepository extends JpaRepository<Book, Long> {
	//根据读者用户名查询阅读列表
	List<Book> findByReader(String reader);

}
