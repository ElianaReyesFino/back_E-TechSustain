package com.ETechSustain.ETechSustain.Controllers;

import com.ETechSustain.ETechSustain.Repository.CategoriaRespository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")

public class CategoriaController {

        private CategoriaRespository categoriaRespository;

        public CategoriaController(CategoriaRespository categoriaRespository) {
            this.categoriaRespository = categoriaRespository;
        }

        public String createCategoria(){
            return "Categoria creada";
        }

        public String GetAllCategorias(){
            return "Categorias obtenidas";
        }

        public String UpdateCategoria(Long id) {
            return "Categoria actualizada";
        }

        public String deleteCategoria (Long id){
            return "Categoria eliminada";
        }
}
