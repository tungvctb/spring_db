package sopvn.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;
//import ch.qos.logback.core.model.Model;
import sopvn.demo.model.Category;
import sopvn.demo.repositories.CategoryRepository;

@Controller
@RequestMapping("/admin/cate")
public class CategoryController {	
	@Autowired
	CategoryRepository rep;
	@GetMapping("/view")
	public String viewMgr(Model model) {
		List<Category> lsc = rep.Instance().findAll();
		model.addAttribute("cates", lsc);
		return "ad_layout/cate_mgr";
	}
	@GetMapping("/detail")
	public String detail(@RequestParam("idc") int idc, Model model) {
		Category category = rep.Instance().findById(idc);
		model.addAttribute("category", category);
		return "ad_layout/cate_detail";
	}
}