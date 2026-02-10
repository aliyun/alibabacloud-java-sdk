// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20201210.models;

import com.aliyun.tea.*;

public class CategoryParam extends TeaModel {
    @NameInMap("CategoryId")
    public Long categoryId;

    @NameInMap("CategoryName")
    public String categoryName;

    @NameInMap("IsSelectFromDialog")
    public Boolean isSelectFromDialog;

    @NameInMap("ProductId")
    public Long productId;

    @NameInMap("ProductName")
    public String productName;

    public static CategoryParam build(java.util.Map<String, ?> map) throws Exception {
        CategoryParam self = new CategoryParam();
        return TeaModel.build(map, self);
    }

    public CategoryParam setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
        return this;
    }
    public Long getCategoryId() {
        return this.categoryId;
    }

    public CategoryParam setCategoryName(String categoryName) {
        this.categoryName = categoryName;
        return this;
    }
    public String getCategoryName() {
        return this.categoryName;
    }

    public CategoryParam setIsSelectFromDialog(Boolean isSelectFromDialog) {
        this.isSelectFromDialog = isSelectFromDialog;
        return this;
    }
    public Boolean getIsSelectFromDialog() {
        return this.isSelectFromDialog;
    }

    public CategoryParam setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

    public CategoryParam setProductName(String productName) {
        this.productName = productName;
        return this;
    }
    public String getProductName() {
        return this.productName;
    }

}
