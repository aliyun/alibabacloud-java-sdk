// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20210610.models;

import com.aliyun.tea.*;

public class ListCategoriesRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("ProductId")
    public Long productId;

    public static ListCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCategoriesRequest self = new ListCategoriesRequest();
        return TeaModel.build(map, self);
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
