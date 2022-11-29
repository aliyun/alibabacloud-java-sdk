// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ServiceStatus extends TeaModel {
    @NameInMap("message")
    public String message;

    @NameInMap("observedGeneration")
    public Integer observedGeneration;

    @NameInMap("observedTime")
    public String observedTime;

    @NameInMap("output")
    public java.util.Map<String, ?> output;

    @NameInMap("phase")
    public String phase;

    public static ServiceStatus build(java.util.Map<String, ?> map) throws Exception {
        ServiceStatus self = new ServiceStatus();
        return TeaModel.build(map, self);
    }

    public ServiceStatus setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ServiceStatus setObservedGeneration(Integer observedGeneration) {
        this.observedGeneration = observedGeneration;
        return this;
    }
    public Integer getObservedGeneration() {
        return this.observedGeneration;
    }

    public ServiceStatus setObservedTime(String observedTime) {
        this.observedTime = observedTime;
        return this;
    }
    public String getObservedTime() {
        return this.observedTime;
    }

    public ServiceStatus setOutput(java.util.Map<String, ?> output) {
        this.output = output;
        return this;
    }
    public java.util.Map<String, ?> getOutput() {
        return this.output;
    }

    public ServiceStatus setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

}
