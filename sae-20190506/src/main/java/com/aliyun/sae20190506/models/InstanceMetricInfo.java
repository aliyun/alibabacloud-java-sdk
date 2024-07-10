// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class InstanceMetricInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>a03aa9f9-3d32-4655-8394-05fd10dcbd8a</p>
     */
    @NameInMap("applicationID")
    public String applicationID;

    /**
     * <strong>example:</strong>
     * <p>1.98</p>
     */
    @NameInMap("cpuPercent")
    public Float cpuPercent;

    /**
     * <strong>example:</strong>
     * <p>35.0</p>
     */
    @NameInMap("cpuQuotaPercent")
    public Float cpuQuotaPercent;

    /**
     * <strong>example:</strong>
     * <p>c-6498f0fe-33bb4f9249b54789a023</p>
     */
    @NameInMap("instanceID")
    public String instanceID;

    /**
     * <strong>example:</strong>
     * <p>512.0</p>
     */
    @NameInMap("memoryLimitMB")
    public Float memoryLimitMB;

    /**
     * <strong>example:</strong>
     * <p>8.81</p>
     */
    @NameInMap("memoryUsageMB")
    public Float memoryUsageMB;

    /**
     * <strong>example:</strong>
     * <p>1686568800000</p>
     */
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
