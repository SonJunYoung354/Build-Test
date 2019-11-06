package tu;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
@RestController
public class osp1 {
	@GetMapping("/")
	public String index() {
		return "Open Source Program..";
	}
}
