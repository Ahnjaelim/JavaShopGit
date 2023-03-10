package kr.co.javashop.dto;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {
	
    private Long prodId;
    private String prodName;
    private String cateCode;
    private int prodPrice;
    private int prodStock;
    private String prodDesc;
    private int prodHit;
    private LocalDateTime regDate;
    private Timestamp modDate;
}
