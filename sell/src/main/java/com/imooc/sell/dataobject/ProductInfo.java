package com.imooc.sell.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
public class ProductInfo {
/**Id随机的，不是自增啥的*/
    @Id
    private String productId;

    /**名字*/
    private String productName;

    /**名字*/
    private BigDecimal productPrice;

    /**库存*/
    private Integer productStock;

    /**描述*/
    private String  productDescription;

    /**小图*/
    private String productIcon;

    /**商品状态，0正常1下架*/
    private Integer productStatus;

    /**类目编号*/
    private Integer categoryType;

}
