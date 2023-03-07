package kr.co.javashop.service;

import kr.co.javashop.dto.PageRequestDTO;
import kr.co.javashop.dto.PageResponseDTO;
import kr.co.javashop.dto.ProductDTO;

public interface ProductService {

    Long register(ProductDTO productDTO);

    ProductDTO readOne(Long prodId);

    void modify(ProductDTO productDTO);
    
    void remove(Long prodId);
    
    PageResponseDTO<ProductDTO> list(PageRequestDTO pageRequestDTO);
}