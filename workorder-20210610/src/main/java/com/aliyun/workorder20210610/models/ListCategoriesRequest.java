// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListCategoriesRequest extends TeaModel {
    /**
     * <p>Multi-language, support, Chinese, English. Value definition: zh: Chinese, en: English.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the classification question. Fuzzy search is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the product. You can call the ListProducts operation to obtain the product ID. The ProductId parameter is the ID of an Alibaba Cloud product. Multiple Categories are displayed for each product.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>18550</p>
     */
    @NameInMap("ProductId")
    public Long productId;

    public static ListCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesRequest self = new ListCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public ListCategoriesRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public ListCategoriesRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListCategoriesRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

}
