// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetTraceDetailRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("env")
    public String env;

    @NameInMap("startTime")
    public String startTime;

    public static GetTraceDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTraceDetailRequest self = new GetTraceDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetTraceDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetTraceDetailRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetTraceDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
