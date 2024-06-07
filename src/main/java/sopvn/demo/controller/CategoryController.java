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
import sopvn.demo.utils.AttributeNames;
import sopvn.demo.utils.Mappings;

@Controller
@RequestMapping("/admin/cate")
public class CategoryController {	
	@Autowired
	CategoryRepository rep;
	@GetMapping(Mappings.CATE_INDEX)
	public String viewMgr(Model model) {
		List<Category> lsc = rep.findAll();
		model.addAttribute(AttributeNames.CATES, lsc);
		return "ad_layout/cate_mgr";
	}
	@GetMapping("/detail")
	public String detail(@RequestParam("idc") int idc, Model model) {
		Category category = rep.findById(idc);
		model.addAttribute("category", category);
		return "ad_layout/cate_detail";
	}

	@GetMapping("/create")
	public String create(Model model) {
		return "ad_layout/cate_detail";
	}
	
}