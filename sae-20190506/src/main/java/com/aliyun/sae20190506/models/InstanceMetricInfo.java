// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class InstanceMetricInfo extends TeaModel {
    @NameInMap("applicationID")
    public String applicationID;

    @NameInMap("cpuPercent")
    public Float cpuPercent;

    @NameInMap("cpuQuotaPercent")
    public Float cpuQuotaPercent;

    @NameInMap("instanceID")
    public String instanceID;

    @NameInMap("memoryLimitMB")
    public Float memoryLimitMB;

    @NameInMap("memoryUsageMB")
    public Float memoryUsageMB;

    @NameInMap("timestamp")
    public Long timestamp;

    public static InstanceMetricInfo build(java.util.Map<String, ?> map) throws Exception {
        InstanceMetricInfo self = new InstanceMetricInfo();
        return TeaModel.build(map, self);
    }

    public InstanceMetricInfo setApplicationID(String applicationID) {
        this.applicationID = applicationID;
        return this;
    }
    public String getApplicationID() {
        return this.applicationID;
    }

    public InstanceMetricInfo setCpuPercent(Float cpuPercent) {
        this.cpuPercent = cpuPercent;
        return this;
    }
    public Float getCpuPercent() {
        return this.cpuPercent;
    }

    public InstanceMetricInfo setCpuQuotaPercent(Float cpuQuotaPercent) {
        this.cpuQuotaPercent = cpuQuotaPercent;
        return this;
    }
    public Float getCpuQuotaPercent() {
        return this.cpuQuotaPercent;
    }

    public InstanceMetricInfo setInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    public String getInstanceID() {
        return this.instanceID;
    }

    public InstanceMetricInfo setMemoryLimitMB(Float memoryLimitMB) {
        this.memoryLimitMB = memoryLimitMB;
        return this;
    }
    public Float getMemoryLimitMB() {
        return this.memoryLimitMB;
    }

    public InstanceMetricInfo setMemoryUsageMB(Float memoryUsageMB) {
        this.memoryUsageMB = memoryUsageMB;
        return this;
    }
    public Float getMemoryUsageMB() {
        return this.memoryUsageMB;
    }

    public InstanceMetricInfo setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

}
