// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class StaticsInfo extends TeaModel {
    @NameInMap("activeCPUUsage")
    public Long activeCPUUsage;

    @NameInMap("cost")
    public Float cost;

    @NameInMap("diskUsage")
    public Long diskUsage;

    @NameInMap("functionName")
    public String functionName;

    @NameInMap("gpuUsage")
    public Long gpuUsage;

    @NameInMap("idleCPUUsage")
    public Long idleCPUUsage;

    @NameInMap("instanceTrafficOut")
    public Long instanceTrafficOut;

    @NameInMap("invocations")
    public Long invocations;

    @NameInMap("invokeCDNOut")
    public Long invokeCDNOut;

    @NameInMap("invokeInternetOut")
    public Long invokeInternetOut;

    @NameInMap("memoryUsage")
    public Long memoryUsage;

    @NameInMap("region")
    public String region;

    @NameInMap("serviceName")
    public String serviceName;

    public static StaticsInfo build(java.util.Map<String, ?> map) throws Exception {
        StaticsInfo self = new StaticsInfo();
        return TeaModel.build(map, self);
    }

    public StaticsInfo setActiveCPUUsage(Long activeCPUUsage) {
        this.activeCPUUsage = activeCPUUsage;
        return this;
    }
    public Long getActiveCPUUsage() {
        return this.activeCPUUsage;
    }

    public StaticsInfo setCost(Float cost) {
        this.cost = cost;
        return this;
    }
    public Float getCost() {
        return this.cost;
    }

    public StaticsInfo setDiskUsage(Long diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }
    public Long getDiskUsage() {
        return this.diskUsage;
    }

    public StaticsInfo setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public StaticsInfo setGpuUsage(Long gpuUsage) {
        this.gpuUsage = gpuUsage;
        return this;
    }
    public Long getGpuUsage() {
        return this.gpuUsage;
    }

    public StaticsInfo setIdleCPUUsage(Long idleCPUUsage) {
        this.idleCPUUsage = idleCPUUsage;
        return this;
    }
    public Long getIdleCPUUsage() {
        return this.idleCPUUsage;
    }

    public StaticsInfo setInstanceTrafficOut(Long instanceTrafficOut) {
        this.instanceTrafficOut = instanceTrafficOut;
        return this;
    }
    public Long getInstanceTrafficOut() {
        return this.instanceTrafficOut;
    }

    public StaticsInfo setInvocations(Long invocations) {
        this.invocations = invocations;
        return this;
    }
    public Long getInvocations() {
        return this.invocations;
    }

    public StaticsInfo setInvokeCDNOut(Long invokeCDNOut) {
        this.invokeCDNOut = invokeCDNOut;
        return this;
    }
    public Long getInvokeCDNOut() {
        return this.invokeCDNOut;
    }

    public StaticsInfo setInvokeInternetOut(Long invokeInternetOut) {
        this.invokeInternetOut = invokeInternetOut;
        return this;
    }
    public Long getInvokeInternetOut() {
        return this.invokeInternetOut;
    }

    public StaticsInfo setMemoryUsage(Long memoryUsage) {
        this.memoryUsage = memoryUsage;
        return this;
    }
    public Long getMemoryUsage() {
        return this.memoryUsage;
    }

    public StaticsInfo setRegion(String region) {
        this.region = region;
        return this;
    }
    public String getRegion() {
        return this.region;
    }

    public StaticsInfo setServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }
    public String getServiceName() {
        return this.serviceName;
    }

}
