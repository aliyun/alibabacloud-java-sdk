// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GetStackDetailRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2022-11-08 15:03:22</p>
     */
    @NameInMap("endTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>TEST</p>
     */
    @NameInMap("env")
    public String env;

    /**
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("rpcId")
    public String rpcId;

    @NameInMap("serviceGroupId")
    public Long serviceGroupId;

    /**
     * <strong>example:</strong>
     * <p>feishu-attendance-app</p>
     */
    @NameInMap("serviceName")
    public String serviceName;

    /**
     * <strong>example:</strong>
     * <p>2022-12-06 10:24:44</p>
     */
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

    public GetStackDetailRequest setServiceGroupId(Long serviceGroupId) {
        this.serviceGroupId = serviceGroupId;
        return this;
    }
    public Long getServiceGroupId() {
        return this.serviceGroupId;
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
