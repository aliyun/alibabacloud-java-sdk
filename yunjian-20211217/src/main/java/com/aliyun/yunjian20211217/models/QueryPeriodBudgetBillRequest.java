// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yunjian20211217.models;

import com.aliyun.tea.*;

public class QueryPeriodBudgetBillRequest extends TeaModel {
    @NameInMap("objectIds")
    public String objectIds;

    @NameInMap("objectType")
    public String objectType;

    @NameInMap("period")
    public String period;

    public static QueryPeriodBudgetBillRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryPeriodBudgetBillRequest self = new QueryPeriodBudgetBillRequest();
        return TeaModel.build(map, self);
    }

    public QueryPeriodBudgetBillRequest setObjectIds(String objectIds) {
        this.objectIds = objectIds;
        return this;
    }
    public String getObjectIds() {
        return this.objectIds;
    }

    public QueryPeriodBudgetBillRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public QueryPeriodBudgetBillRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

}
