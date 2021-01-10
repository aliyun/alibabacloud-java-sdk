// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasLocaloverviewTodayrisklistRequest extends TeaModel {
    @NameInMap("RiskStatus")
    public String riskStatus;

    public static QueryHasLocaloverviewTodayrisklistRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryHasLocaloverviewTodayrisklistRequest self = new QueryHasLocaloverviewTodayrisklistRequest();
        return TeaModel.build(map, self);
    }

    public QueryHasLocaloverviewTodayrisklistRequest setRiskStatus(String riskStatus) {
        this.riskStatus = riskStatus;
        return this;
    }
    public String getRiskStatus() {
        return this.riskStatus;
    }

}
