package tu;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class osp1 {
	@GetMapping("/")
	public String index() {
		return "Open Source Program..";
		//commit.... 연습
		}
	@GetMapping("test")
	public String test() {
		return "Open....";
		
	}
}
