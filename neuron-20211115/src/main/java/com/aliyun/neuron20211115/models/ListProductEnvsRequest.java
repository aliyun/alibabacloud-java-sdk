// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListProductEnvsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>42</p>
     */
    @NameInMap("companyId")
    public Long companyId;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("productId")
    public Long productId;

    public static ListProductEnvsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProductEnvsRequest self = new ListProductEnvsRequest();
        return TeaModel.build(map, self);
    }

    public ListProductEnvsRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ListProductEnvsRequest setProductId(Long productId) {
        this.productId = productId;
        return this;
    }
    public Long getProductId() {
        return this.productId;
    }

}
