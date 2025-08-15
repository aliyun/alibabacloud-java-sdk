// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class GetTraceRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("startTime")
    public String startTime;

    public static GetTraceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceRequest self = new GetTraceRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTraceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
