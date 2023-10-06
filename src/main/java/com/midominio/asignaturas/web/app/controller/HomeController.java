package com.midominio.asignaturas.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping({"/", "/home", "/home/", ""})
	public String m1(Model model) {
		
		model.addAttribute("titulo", "titulo");
		model.addAttribute("parrafo","Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam a hendrerit erat. Praesent eleifend posuere turpis ut bibendum. Mauris nunc urna, ornare non venenatis id, lacinia ut odio. Etiam fringilla, felis eget dapibus sollicitudin, nulla metus porta augue, sed pretium lacus leo sit amet nibh. Phasellus sed facilisis lectus. Sed id tellus eget lacus ornare placerat ornare eu lectus. Mauris accumsan massa ligula, vel lacinia sapien dapibus venenatis. Nam aliquam semper quam eget egestas. Donec in volutpat tellus, eu efficitur nunc. ");
		model.addAttribute("parrafo2", "Donec ac risus ut augue volutpat malesuada eget in turpis. Duis vulputate est a enim lobortis, sed pretium dui pharetra. In scelerisque molestie magna, eget hendrerit lorem lobortis porttitor. Curabitur fringilla vitae elit tristique scelerisque. Aenean interdum enim non sapien bibendum maximus. Aenean ultrices urna at nisi tristique, quis imperdiet diam suscipit. Integer arcu lectus, feugiat vitae interdum a, rutrum sit amet nisl. Vestibulum justo lorem, finibus non neque sed, interdum varius nisl. Ut urna ipsum, malesuada at quam venenatis, fringilla accumsan massa. Proin efficitur eu odio id pretium. Curabitur vitae mauris blandit, mollis lorem consectetur, tincidunt elit. Etiam tellus risus, mollis nec velit vel, volutpat sollicitudin enim. Mauris efficitur imperdiet lorem nec efficitur. Maecenas pretium augue vitae ex varius, id eleifend erat ultrices. Morbi accumsan dignissim urna, vel commodo erat. Donec ultrices arcu vitae faucibus venenatis. ");
		model.addAttribute("parrafo3", " In ullamcorper quis erat eget tincidunt. Nunc posuere velit non semper porta. Pellentesque tristique, libero ac dictum sollicitudin, erat sem viverra ante, ut hendrerit neque lorem vel quam. Donec euismod leo leo, sit amet accumsan nulla malesuada vel. Aenean tortor lacus, viverra vitae felis quis, congue lobortis nibh. Maecenas non velit est. Pellentesque bibendum id ex quis laoreet. Pellentesque tempus turpis et odio elementum, ac luctus eros sagittis. Phasellus leo leo, consectetur eu venenatis sed, blandit a sem. ");
		return "home";
		
	}	
}


