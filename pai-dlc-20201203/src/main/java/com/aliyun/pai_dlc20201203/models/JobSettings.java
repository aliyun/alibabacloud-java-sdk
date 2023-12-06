// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobSettings extends TeaModel {
    @NameInMap("AdvancedSettings")
    public java.util.Map<String, ?> advancedSettings;

    @NameInMap("BusinessUserId")
    public String businessUserId;

    @NameInMap("Caller")
    public String caller;

    @NameInMap("Driver")
    public String driver;

    @NameInMap("EnableErrorMonitoringInAIMaster")
    public Boolean enableErrorMonitoringInAIMaster;

    @NameInMap("EnableOssAppend")
    public Boolean enableOssAppend;

    @NameInMap("EnableRDMA")
    public Boolean enableRDMA;

    @NameInMap("EnableTideResource")
    public Boolean enableTideResource;

    @NameInMap("ErrorMonitoringArgs")
    public String errorMonitoringArgs;

    @NameInMap("JobReservedMinutes")
    public Integer jobReservedMinutes;

    @NameInMap("JobReservedPolicy")
    public String jobReservedPolicy;

    @NameInMap("OversoldType")
    public String oversoldType;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    public static JobSettings build(java.util.Map<String, ?> map) throws Exception {
        JobSettings self = new JobSettings();
        return TeaModel.build(map, self);
    }

    public JobSettings setAdvancedSettings(java.util.Map<String, ?> advancedSettings) {
        this.advancedSettings = advancedSettings;
        return this;
    }
    public java.util.Map<String, ?> getAdvancedSettings() {
        return this.advancedSettings;
    }

    public JobSettings setBusinessUserId(String businessUserId) {
        this.businessUserId = businessUserId;
        return this;
    }
    public String getBusinessUserId() {
        return this.businessUserId;
    }

    public JobSettings setCaller(String caller) {
        this.caller = caller;
        return this;
    }
    public String getCaller() {
        return this.caller;
    }

    public JobSettings setDriver(String driver) {
        this.driver = driver;
        return this;
    }
    public String getDriver() {
        return this.driver;
    }

    public JobSettings setEnableErrorMonitoringInAIMaster(Boolean enableErrorMonitoringInAIMaster) {
        this.enableErrorMonitoringInAIMaster = enableErrorMonitoringInAIMaster;
        return this;
    }
    public Boolean getEnableErrorMonitoringInAIMaster() {
        return this.enableErrorMonitoringInAIMaster;
    }

    public JobSettings setEnableOssAppend(Boolean enableOssAppend) {
        this.enableOssAppend = enableOssAppend;
        return this;
    }
    public Boolean getEnableOssAppend() {
        return this.enableOssAppend;
    }

    public JobSettings setEnableRDMA(Boolean enableRDMA) {
        this.enableRDMA = enableRDMA;
        return this;
    }
    public Boolean getEnableRDMA() {
        return this.enableRDMA;
    }

    public JobSettings setEnableTideResource(Boolean enableTideResource) {
        this.enableTideResource = enableTideResource;
        return this;
    }
    public Boolean getEnableTideResource() {
        return this.enableTideResource;
    }

    public JobSettings setErrorMonitoringArgs(String errorMonitoringArgs) {
        this.errorMonitoringArgs = errorMonitoringArgs;
        return this;
    }
    public String getErrorMonitoringArgs() {
        return this.errorMonitoringArgs;
    }

    public JobSettings setJobReservedMinutes(Integer jobReservedMinutes) {
        this.jobReservedMinutes = jobReservedMinutes;
        return this;
    }
    public Integer getJobReservedMinutes() {
        return this.jobReservedMinutes;
    }

    public JobSettings setJobReservedPolicy(String jobReservedPolicy) {
        this.jobReservedPolicy = jobReservedPolicy;
        return this;
    }
    public String getJobReservedPolicy() {
        return this.jobReservedPolicy;
    }

    public JobSettings setOversoldType(String oversoldType) {
        this.oversoldType = oversoldType;
        return this;
    }
    public String getOversoldType() {
        return this.oversoldType;
    }

    public JobSettings setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public JobSettings setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

}
