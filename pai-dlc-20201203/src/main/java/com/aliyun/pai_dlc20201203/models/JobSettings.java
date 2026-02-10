// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobSettings extends TeaModel {
    /**
     * <p>The additional advanced parameter configurations.</p>
     */
    @NameInMap("AdvancedSettings")
    public java.util.Map<String, ?> advancedSettings;

    /**
     * <p>Whether to mount all RDMA network interface controllers</p>
     */
    @NameInMap("AllocateAllRDMADevices")
    public Boolean allocateAllRDMADevices;

    @NameInMap("AllowUnschedulableNodes")
    public Boolean allowUnschedulableNodes;

    /**
     * <p>The ID of the user associated with the job.</p>
     * 
     * <strong>example:</strong>
     * <p>16****</p>
     */
    @NameInMap("BusinessUserId")
    public String businessUserId;

    /**
     * <p>The caller.</p>
     * 
     * <strong>example:</strong>
     * <p>SilkFlow</p>
     */
    @NameInMap("Caller")
    public String caller;

    @NameInMap("DataJuicerConfig")
    public DataJuicerConfig dataJuicerConfig;

    /**
     * <p>Whether inventory check is skipped. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DisableEcsStockCheck")
    public Boolean disableEcsStockCheck;

    /**
     * <p>The NVIDIA driver configurations.</p>
     * 
     * <strong>example:</strong>
     * <p>535.54.03</p>
     */
    @NameInMap("Driver")
    public String driver;

    /**
     * <p>Whether the CPU affinity is enabled. This parameter takes effect only when you use subscription general computing resources.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCPUAffinity")
    public Boolean enableCPUAffinity;

    @NameInMap("EnableDSWDev")
    public Boolean enableDSWDev;

    /**
     * <p>Whether fault tolerance monitoring is enabled for the job. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableErrorMonitoringInAIMaster")
    public Boolean enableErrorMonitoringInAIMaster;

    /**
     * <p>Whether data is written to Object Storage Service (OSS) in append mode. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableOssAppend")
    public Boolean enableOssAppend;

    /**
     * <p>Whether RDMA is enabled for the job. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableRDMA")
    public Boolean enableRDMA;

    /**
     * <p>Whether sanity check is enabled for the job. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableSanityCheck")
    public Boolean enableSanityCheck;

    /**
     * <p>Whether tidal resources are allowed for the job. Valid values:</p>
     * <ul>
     * <li>true</li>
     * <li>false</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableTideResource")
    public Boolean enableTideResource;

    /**
     * <p>The configuration parameters after you enable fault tolerance monitoring. For example, you can specify whether to enable log hang-based detection.</p>
     * 
     * <strong>example:</strong>
     * <p>--enable-log-hang-detection true</p>
     */
    @NameInMap("ErrorMonitoringArgs")
    public String errorMonitoringArgs;

    /**
     * <p>The retention period after the job ends. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("JobReservedMinutes")
    public Integer jobReservedMinutes;

    /**
     * <p>The retention policy after the job ends.</p>
     * 
     * <strong>example:</strong>
     * <p>Always</p>
     */
    @NameInMap("JobReservedPolicy")
    public String jobReservedPolicy;

    @NameInMap("ModelConfig")
    public ModelConfig modelConfig;

    /**
     * <p>Whether the job accepts oversold resources. Valid values: ForbiddenQuotaOverSold, AcceptQuotaOverSold, and ForceQuotaOverSold.</p>
     * 
     * <strong>example:</strong>
     * <p>AcceptQuotaOverSold</p>
     */
    @NameInMap("OversoldType")
    public String oversoldType;

    /**
     * <p>The pipeline ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pid-123456</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The configuration parameters for sanity check.</p>
     * 
     * <strong>example:</strong>
     * <p>--sanity-check-timing=AfterJobFaultTolerant --sanity-check-timeout-ops=MarkJobFail</p>
     */
    @NameInMap("SanityCheckArgs")
    public String sanityCheckArgs;

    /**
     * <p>The custom tag.</p>
     */
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

    public JobSettings setAllocateAllRDMADevices(Boolean allocateAllRDMADevices) {
        this.allocateAllRDMADevices = allocateAllRDMADevices;
        return this;
    }
    public Boolean getAllocateAllRDMADevices() {
        return this.allocateAllRDMADevices;
    }

    public JobSettings setAllowUnschedulableNodes(Boolean allowUnschedulableNodes) {
        this.allowUnschedulableNodes = allowUnschedulableNodes;
        return this;
    }
    public Boolean getAllowUnschedulableNodes() {
        return this.allowUnschedulableNodes;
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

    public JobSettings setDataJuicerConfig(DataJuicerConfig dataJuicerConfig) {
        this.dataJuicerConfig = dataJuicerConfig;
        return this;
    }
    public DataJuicerConfig getDataJuicerConfig() {
        return this.dataJuicerConfig;
    }

    public JobSettings setDisableEcsStockCheck(Boolean disableEcsStockCheck) {
        this.disableEcsStockCheck = disableEcsStockCheck;
        return this;
    }
    public Boolean getDisableEcsStockCheck() {
        return this.disableEcsStockCheck;
    }

    public JobSettings setDriver(String driver) {
        this.driver = driver;
        return this;
    }
    public String getDriver() {
        return this.driver;
    }

    public JobSettings setEnableCPUAffinity(Boolean enableCPUAffinity) {
        this.enableCPUAffinity = enableCPUAffinity;
        return this;
    }
    public Boolean getEnableCPUAffinity() {
        return this.enableCPUAffinity;
    }

    public JobSettings setEnableDSWDev(Boolean enableDSWDev) {
        this.enableDSWDev = enableDSWDev;
        return this;
    }
    public Boolean getEnableDSWDev() {
        return this.enableDSWDev;
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

    public JobSettings setModelConfig(ModelConfig modelConfig) {
        this.modelConfig = modelConfig;
        return this;
    }
    public ModelConfig getModelConfig() {
        return this.modelConfig;
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
