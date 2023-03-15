// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetHistoryDeveloperRequest extends TeaModel {
    @NameInMap("enterpriseId")
    public Long enterpriseId;

    public static GetHistoryDeveloperRequest build(java.util.Map<String, ?> map) throws Exception {
        GetHistoryDeveloperRequest self = new GetHistoryDeveloperRequest();
        return TeaModel.build(map, self);
    }

    public GetHistoryDeveloperRequest setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }
    public Long getEnterpriseId() {
        return this.enterpriseId;
    }

}
