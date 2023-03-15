// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetStackDetailRequest extends TeaModel {
    @NameInMap("endTime")
    public String endTime;

    @NameInMap("env")
    public String env;

    @NameInMap("rpcId")
    public String rpcId;

    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("startTime")
    public String startTime;

    public static GetStackDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetStackDetailRequest self = new GetStackDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetStackDetailRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetStackDetailRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public GetStackDetailRequest setRpcId(String rpcId) {
        this.rpcId = rpcId;
        return this;
    }
    public String getRpcId() {
        return this.rpcId;
    }

    public GetStackDetailRequest setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public GetStackDetailRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
