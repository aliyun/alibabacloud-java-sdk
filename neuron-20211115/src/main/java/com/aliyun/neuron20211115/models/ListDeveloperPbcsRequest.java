// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListDeveloperPbcsRequest extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    @NameInMap("marketId")
    public Long marketId;

    public static ListDeveloperPbcsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDeveloperPbcsRequest self = new ListDeveloperPbcsRequest();
        return TeaModel.build(map, self);
    }

    public ListDeveloperPbcsRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public ListDeveloperPbcsRequest setMarketId(Long marketId) {
        this.marketId = marketId;
        return this;
    }
    public Long getMarketId() {
        return this.marketId;
    }

}
