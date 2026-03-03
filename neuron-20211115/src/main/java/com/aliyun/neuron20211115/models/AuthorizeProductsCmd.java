// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class AuthorizeProductsCmd extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("productIds")
    public java.util.List<Long> productIds;

    public static AuthorizeProductsCmd build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeProductsCmd self = new AuthorizeProductsCmd();
        return TeaModel.build(map, self);
    }

    public AuthorizeProductsCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public AuthorizeProductsCmd setProductIds(java.util.List<Long> productIds) {
        this.productIds = productIds;
        return this;
    }
    public java.util.List<Long> getProductIds() {
        return this.productIds;
    }

}
