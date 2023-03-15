// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMarketsRequest extends TeaModel {
    @NameInMap("companyId")
    public Long companyId;

    public static ListMarketsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMarketsRequest self = new ListMarketsRequest();
        return TeaModel.build(map, self);
    }

    public ListMarketsRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

}
