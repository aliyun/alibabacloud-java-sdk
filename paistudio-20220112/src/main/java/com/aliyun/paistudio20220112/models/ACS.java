// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class ACS extends TeaModel {
    @NameInMap("ACSQuotaId")
    public String ACSQuotaId;

    @NameInMap("AssociatedProducts")
    public java.util.List<String> associatedProducts;

    public static ACS build(java.util.Map<String, ?> map) throws Exception {
        ACS self = new ACS();
        return TeaModel.build(map, self);
    }

    public ACS setACSQuotaId(String ACSQuotaId) {
        this.ACSQuotaId = ACSQuotaId;
        return this;
    }
    public String getACSQuotaId() {
        return this.ACSQuotaId;
    }

    public ACS setAssociatedProducts(java.util.List<String> associatedProducts) {
        this.associatedProducts = associatedProducts;
        return this;
    }
    public java.util.List<String> getAssociatedProducts() {
        return this.associatedProducts;
    }

}
