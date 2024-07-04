// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobSettings extends TeaModel {
    @NameInMap("AdvancedSettings")
    public java.util.Map<String, ?> advancedSettings;

    /**
     * <strong>example:</strong>
     * <p>166924</p>
     */
    @NameInMap("BusinessUserId")
    public String businessUserId;

    /**
     * <strong>example:</strong>
     * <p>SilkFlow</p>
     */
    @NameInMap("Caller")
    public String caller;

    /**
     * <strong>example:</strong>
     * <p>535.54.03</p>
     */
    @NameInMap("Driver")
    public String driver;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableErrorMonitoringInAIMaster")
    public Boolean enableErrorMonitoringInAIMaster;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableOssAppend")
    public Boolean enableOssAppend;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRDMA")
    public Boolean enableRDMA;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSanityCheck")
    public Boolean enableSanityCheck;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTideResource")
    public Boolean enableTideResource;

    /**
     * <strong>example:</strong>
     * <p>--enable-log-hang-detection true</p>
     */
    @NameInMap("ErrorMonitoringArgs")
    public String errorMonitoringArgs;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("JobReservedMinutes")
    public Integer jobReservedMinutes;

    /**
     * <strong>example:</strong>
     * <p>Always</p>
     */
    @NameInMap("JobReservedPolicy")
    public String jobReservedPolicy;

    /**
     * <strong>example:</strong>
     * <p>AcceptQuotaOverSold</p>
     */
    @NameInMap("OversoldType")
    public String oversoldType;

    /**
     * <strong>example:</strong>
     * <p>pid-123456</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <strong>example:</strong>
     * <p>--sanity-check-timing=AfterJobFaultTolerant --sanity-check-timeout-ops=MarkJobFai</p>
     */
    @NameInMap("SanityCheckArgs")
    public String sanityCheckArgs;

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

    public JobSettings setEnableSanityCheck(Boolean enableSanityCheck) {
        this.enableSanityCheck = enableSanityCheck;
        return this;
    }
    public Boolean getEnableSanityCheck() {
        return this.enableSanityCheck;
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

    public JobSettings setSanityCheckArgs(String sanityCheckArgs) {
        this.sanityCheckArgs = sanityCheckArgs;
        return this;
    }
    public String getSanityCheckArgs() {
        return this.sanityCheckArgs;
    }

    public JobSettings setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

}
