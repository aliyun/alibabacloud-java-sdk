// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class GetLifecycleRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Order")
    public String order;

    @NameInMap("SessionNumber")
    public Integer sessionNumber;

    @NameInMap("StartTime")
    public String startTime;

    public static GetLifecycleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLifecycleRequest self = new GetLifecycleRequest();
        return TeaModel.build(map, self);
    }

    public GetLifecycleRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetLifecycleRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public GetLifecycleRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public GetLifecycleRequest setSessionNumber(Integer sessionNumber) {
        this.sessionNumber = sessionNumber;
        return this;
    }
    public Integer getSessionNumber() {
        return this.sessionNumber;
    }

    public GetLifecycleRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
