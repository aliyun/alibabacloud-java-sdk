// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class CatalogOperatorRoleCreateCmd extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("marketId")
    public Long marketId;

    @NameInMap("marketType")
    public String marketType;

    public static CatalogOperatorRoleCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        CatalogOperatorRoleCreateCmd self = new CatalogOperatorRoleCreateCmd();
        return TeaModel.build(map, self);
    }

    public CatalogOperatorRoleCreateCmd setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public CatalogOperatorRoleCreateCmd setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

    public CatalogOperatorRoleCreateCmd setMarketType(String marketType) {
        this.marketType = marketType;
        return this;
    }
    public String getMarketType() {
        return this.marketType;
    }

}
