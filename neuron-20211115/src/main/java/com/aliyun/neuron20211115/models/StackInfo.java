// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class StackInfo extends TeaModel {
    @NameInMap("api")
    public String api;

    @NameInMap("duration")
    public Long duration;

    @NameInMap("exception")
    public String exception;

    @NameInMap("extInfo")
    public StackInfoExtInfo extInfo;

    @NameInMap("line")
    public String line;

    @NameInMap("rpcId")
    public String rpcId;

    @NameInMap("serviceName")
    public String serviceName;

    @NameInMap("startTime")
    public Long startTime;

    public static StackInfo build(java.util.Map<String, ?> map) throws Exception {
        StackInfo self = new StackInfo();
        return TeaModel.build(map, self);
    }

    public StackInfo setApi(String api) {
        this.api = api;
        return this;
    }
    public String getApi() {
        return this.api;
    }

    public StackInfo setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public StackInfo setException(String exception) {
        this.exception = exception;
        return this;
    }
    public String getException() {
        return this.exception;
    }

    public StackInfo setExtInfo(StackInfoExtInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public StackInfoExtInfo getExtInfo() {
        return this.extInfo;
    }

    public StackInfo setLine(String line) {
        this.line = line;
        return this;
    }
    public String getLine() {
        return this.line;
    }

    public StackInfo setRpcId(String rpcId) {
        this.rpcId = rpcId;
        return this;
    }
    public String getRpcId() {
        return this.rpcId;
    }

    public StackInfo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

    public StackInfo setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

}
