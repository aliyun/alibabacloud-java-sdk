// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yuqing20210126.models;

import com.aliyun.tea.*;

public class AggregateSearchYuqingResponseBody extends TeaModel {
    @NameInMap("aggResultList")
    public java.util.List<StatisticPoint> aggResultList;

    @NameInMap("requestId")
    public String requestId;

    public static AggregateSearchYuqingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AggregateSearchYuqingResponseBody self = new AggregateSearchYuqingResponseBody();
        return TeaModel.build(map, self);
    }

    public AggregateSearchYuqingResponseBody setAggResultList(java.util.List<StatisticPoint> aggResultList) {
        this.aggResultList = aggResultList;
        return this;
    }
    public java.util.List<StatisticPoint> getAggResultList() {
        return this.aggResultList;
    }

    public AggregateSearchYuqingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
