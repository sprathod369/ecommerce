package me.zhulin.shopapi.form;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

/**
 * Created By Zhu Lin on 3/11/2018.
 */
@Data
public class ItemForm {
    @NotNull
    @Min(value = 1, message = "Quantity must be at least 1")
    private Integer quantity;

    @NotEmpty(message = "Product ID cannot be empty")
    private String productId;
}
