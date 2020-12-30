// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.workorder20200326.models;

import com.aliyun.tea.*;

public class ListCategoriesRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("ProductCode")
    public String productCode;

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

    public ListCategoriesRequest setProductCode(String productCode) {
        this.productCode = productCode;
        return this;
    }
    public String getProductCode() {
        return this.productCode;
    }

}
