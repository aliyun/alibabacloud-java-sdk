// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetNodeMetricsRequest extends TeaModel {
    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("GPUType")
    public String GPUType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("TimeStep")
    public String timeStep;

    @NameInMap("Verbose")
    public Boolean verbose;

    public static GetNodeMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetNodeMetricsRequest self = new GetNodeMetricsRequest();
        return TeaModel.build(map, self);
    }

    public GetNodeMetricsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public GetNodeMetricsRequest setGPUType(String GPUType) {
        this.GPUType = GPUType;
        return this;
    }
    public String getGPUType() {
        return this.GPUType;
    }

    public GetNodeMetricsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public GetNodeMetricsRequest setTimeStep(String timeStep) {
        this.timeStep = timeStep;
        return this;
    }
    public String getTimeStep() {
        return this.timeStep;
    }

    public GetNodeMetricsRequest setVerbose(Boolean verbose) {
        this.verbose = verbose;
        return this;
    }
    public Boolean getVerbose() {
        return this.verbose;
    }

}
