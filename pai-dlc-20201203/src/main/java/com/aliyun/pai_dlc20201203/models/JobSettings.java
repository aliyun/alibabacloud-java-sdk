// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobSettings extends TeaModel {
    /**
     * <p>The extra advanced parameter settings.</p>
     */
    @NameInMap("AdvancedSettings")
    public java.util.Map<String, ?> advancedSettings;

    /**
     * <p>Specifies whether to mount all RDMA network interfaces.</p>
     */
    @NameInMap("AllocateAllRDMADevices")
    public Boolean allocateAllRDMADevices;

    @NameInMap("AllowUnschedulableNodes")
    public Boolean allowUnschedulableNodes;

    /**
     * <p>The user ID associated with the job.</p>
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

    /**
     * <p>The DataJuicer task configuration.</p>
     */
    @NameInMap("DataJuicerConfig")
    public DataJuicerConfig dataJuicerConfig;

    /**
     * <p>Specifies whether to skip the inventory check. Valid values:</p>
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
     * <p>The NVIDIA driver configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>535.54.03</p>
     */
    @NameInMap("Driver")
    public String driver;

    /**
     * <p>The CPU affinity setting. This setting takes effect only when general-purpose subscription computing resources are used.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableCPUAffinity")
    public Boolean enableCPUAffinity;

    @NameInMap("EnableDSWDev")
    public Boolean enableDSWDev;

    /**
     * <p>Specifies whether to enable fault tolerance monitoring for the job. Valid values:</p>
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
     * <p>Specifies whether OSS append writes are allowed. Valid values:</p>
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
     * <p>Specifies whether the job is allowed to use RDMA. Valid values:</p>
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
     * <p>Specifies whether to enable computing power health check for the job. Valid values:</p>
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
     * <p>Specifies whether the job is allowed to use tidal resources. Valid values:</p>
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
     * <p>The configuration parameters for fault tolerance monitoring after it is enabled. For example, you can specify whether to enable log hang-based detection.</p>
     * 
     * <strong>example:</strong>
     * <p>--enable-log-hang-detection true</p>
     */
    @NameInMap("ErrorMonitoringArgs")
    public String errorMonitoringArgs;

    /**
     * <p>The duration (in minutes) for which the job is retained after it ends.</p>
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

    /**
     * <p>The output model configuration. This parameter currently takes effect only in federated training scenarios.</p>
     */
    @NameInMap("ModelConfig")
    public ModelConfig modelConfig;

    /**
     * <p>The oversold resource usage mode for the job (not accepted, acceptable, or only accepted).</p>
     * 
     * <strong>example:</strong>
     * <p>AcceptQuotaOverSold</p>
     */
    @NameInMap("OversoldType")
    public String oversoldType;

    /**
     * <p>The workflow ID.</p>
     * 
     * <strong>example:</strong>
     * <p>pid-12****</p>
     */
    @NameInMap("PipelineId")
    public String pipelineId;

    /**
     * <p>The configuration parameters for computing power health check.</p>
     * 
     * <strong>example:</strong>
     * <p>--sanity-check-timing=AfterJobFaultTolerant --sanity-check-timeout-ops=MarkJobFail</p>
     */
    @NameInMap("SanityCheckArgs")
    public String sanityCheckArgs;

    /**
     * <strong>example:</strong>
     * <p>/bin/bash</p>
     */
    @NameInMap("Shell")
    public String shell;

    /**
     * <p>The custom tags.</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, String> tags;

    @NameInMap("TerminationGracePeriodSeconds")
    public Long terminationGracePeriodSeconds;

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

    public JobSettings setShell(String shell) {
        this.shell = shell;
        return this;
    }
    public String getShell() {
        return this.shell;
    }

    public JobSettings setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, String> getTags() {
        return this.tags;
    }

    public JobSettings setTerminationGracePeriodSeconds(Long terminationGracePeriodSeconds) {
        this.terminationGracePeriodSeconds = terminationGracePeriodSeconds;
        return this;
    }
    public Long getTerminationGracePeriodSeconds() {
        return this.terminationGracePeriodSeconds;
    }

}
