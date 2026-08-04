// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class QuotaConfig extends TeaModel {
    /**
     * <p>The ACS-related configurations.</p>
     */
    @NameInMap("ACS")
    public ACS ACS;

    /**
     * <p>The ID of the cluster where the quota resides.</p>
     * 
     * <strong>example:</strong>
     * <p>ceeb3724255364***</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("ControlPlaneClusterId")
    public String controlPlaneClusterId;

    /**
     * <p>The default GPU driver version for the resource quota.</p>
     * 
     * <strong>example:</strong>
     * <p>470.199.02</p>
     */
    @NameInMap("DefaultGPUDriver")
    public String defaultGPUDriver;

    @NameInMap("EnableGPUShare")
    public Boolean enableGPUShare;

    /**
     * <p>Specifies whether workloads in sub-quotas can be preempted.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnablePreemptSubquotaWorkloads")
    public Boolean enablePreemptSubquotaWorkloads;

    /**
     * <p>Specifies whether guaranteed resources within this quota can be preempted.</p>
     */
    @NameInMap("EnableSelfQuotaPreemption")
    public Boolean enableSelfQuotaPreemption;

    /**
     * <p>Specifies whether resources in sub-quotas can be preempted.</p>
     */
    @NameInMap("EnableSubQuotaPreemption")
    public Boolean enableSubQuotaPreemption;

    @NameInMap("EniCacheConfig")
    public EniCacheConfig eniCacheConfig;

    @NameInMap("IsEncryptedResource")
    public Boolean isEncryptedResource;

    @NameInMap("OversoldUsageConfig")
    public OversoldUsageConfig oversoldUsageConfig;

    /**
     * <p>The resource specification templates.</p>
     */
    @NameInMap("ResourceSpecs")
    public java.util.List<WorkspaceSpecs> resourceSpecs;

    @NameInMap("SandboxCacheConfig")
    public SandboxCacheConfig sandboxCacheConfig;

    @NameInMap("SelfQuotaPreemptionConfig")
    public SelfQuotaPreemptionConfig selfQuotaPreemptionConfig;

    /**
     * <p>The configuration for the sub-quota preemption task.</p>
     */
    @NameInMap("SubQuotaPreemptionConfig")
    public SubQuotaPreemptionConfig subQuotaPreemptionConfig;

    /**
     * <p>The GPU driver versions supported by the resource quota.</p>
     */
    @NameInMap("SupportGPUDrivers")
    public java.util.List<String> supportGPUDrivers;

    /**
     * <p>Specifies whether RDMA is supported.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SupportRDMA")
    public Boolean supportRDMA;

    @NameInMap("UseCase")
    public String useCase;

    /**
     * <p>The user VPC information.</p>
     */
    @NameInMap("UserVpc")
    public UserVpc userVpc;

    @NameInMap("WorkloadTypes")
    public java.util.List<String> workloadTypes;

    public static QuotaConfig build(java.util.Map<String, ?> map) throws Exception {
        QuotaConfig self = new QuotaConfig();
        return TeaModel.build(map, self);
    }

    public QuotaConfig setACS(ACS ACS) {
        this.ACS = ACS;
        return this;
    }
    public ACS getACS() {
        return this.ACS;
    }

    public QuotaConfig setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public QuotaConfig setControlPlaneClusterId(String controlPlaneClusterId) {
        this.controlPlaneClusterId = controlPlaneClusterId;
        return this;
    }
    public String getControlPlaneClusterId() {
        return this.controlPlaneClusterId;
    }

    public QuotaConfig setDefaultGPUDriver(String defaultGPUDriver) {
        this.defaultGPUDriver = defaultGPUDriver;
        return this;
    }
    public String getDefaultGPUDriver() {
        return this.defaultGPUDriver;
    }

    public QuotaConfig setEnableGPUShare(Boolean enableGPUShare) {
        this.enableGPUShare = enableGPUShare;
        return this;
    }
    public Boolean getEnableGPUShare() {
        return this.enableGPUShare;
    }

    public QuotaConfig setEnablePreemptSubquotaWorkloads(Boolean enablePreemptSubquotaWorkloads) {
        this.enablePreemptSubquotaWorkloads = enablePreemptSubquotaWorkloads;
        return this;
    }
    public Boolean getEnablePreemptSubquotaWorkloads() {
        return this.enablePreemptSubquotaWorkloads;
    }

    public QuotaConfig setEnableSelfQuotaPreemption(Boolean enableSelfQuotaPreemption) {
        this.enableSelfQuotaPreemption = enableSelfQuotaPreemption;
        return this;
    }
    public Boolean getEnableSelfQuotaPreemption() {
        return this.enableSelfQuotaPreemption;
    }

    public QuotaConfig setEnableSubQuotaPreemption(Boolean enableSubQuotaPreemption) {
        this.enableSubQuotaPreemption = enableSubQuotaPreemption;
        return this;
    }
    public Boolean getEnableSubQuotaPreemption() {
        return this.enableSubQuotaPreemption;
    }

    public QuotaConfig setEniCacheConfig(EniCacheConfig eniCacheConfig) {
        this.eniCacheConfig = eniCacheConfig;
        return this;
    }
    public EniCacheConfig getEniCacheConfig() {
        return this.eniCacheConfig;
    }

    public QuotaConfig setIsEncryptedResource(Boolean isEncryptedResource) {
        this.isEncryptedResource = isEncryptedResource;
        return this;
    }
    public Boolean getIsEncryptedResource() {
        return this.isEncryptedResource;
    }

    public QuotaConfig setOversoldUsageConfig(OversoldUsageConfig oversoldUsageConfig) {
        this.oversoldUsageConfig = oversoldUsageConfig;
        return this;
    }
    public OversoldUsageConfig getOversoldUsageConfig() {
        return this.oversoldUsageConfig;
    }

    public QuotaConfig setResourceSpecs(java.util.List<WorkspaceSpecs> resourceSpecs) {
        this.resourceSpecs = resourceSpecs;
        return this;
    }
    public java.util.List<WorkspaceSpecs> getResourceSpecs() {
        return this.resourceSpecs;
    }

    public QuotaConfig setSandboxCacheConfig(SandboxCacheConfig sandboxCacheConfig) {
        this.sandboxCacheConfig = sandboxCacheConfig;
        return this;
    }
    public SandboxCacheConfig getSandboxCacheConfig() {
        return this.sandboxCacheConfig;
    }

    public QuotaConfig setSelfQuotaPreemptionConfig(SelfQuotaPreemptionConfig selfQuotaPreemptionConfig) {
        this.selfQuotaPreemptionConfig = selfQuotaPreemptionConfig;
        return this;
    }
    public SelfQuotaPreemptionConfig getSelfQuotaPreemptionConfig() {
        return this.selfQuotaPreemptionConfig;
    }

    public QuotaConfig setSubQuotaPreemptionConfig(SubQuotaPreemptionConfig subQuotaPreemptionConfig) {
        this.subQuotaPreemptionConfig = subQuotaPreemptionConfig;
        return this;
    }
    public SubQuotaPreemptionConfig getSubQuotaPreemptionConfig() {
        return this.subQuotaPreemptionConfig;
    }

    public QuotaConfig setSupportGPUDrivers(java.util.List<String> supportGPUDrivers) {
        this.supportGPUDrivers = supportGPUDrivers;
        return this;
    }
    public java.util.List<String> getSupportGPUDrivers() {
        return this.supportGPUDrivers;
    }

    public QuotaConfig setSupportRDMA(Boolean supportRDMA) {
        this.supportRDMA = supportRDMA;
        return this;
    }
    public Boolean getSupportRDMA() {
        return this.supportRDMA;
    }

    public QuotaConfig setUseCase(String useCase) {
        this.useCase = useCase;
        return this;
    }
    public String getUseCase() {
        return this.useCase;
    }

    public QuotaConfig setUserVpc(UserVpc userVpc) {
        this.userVpc = userVpc;
        return this;
    }
    public UserVpc getUserVpc() {
        return this.userVpc;
    }

    public QuotaConfig setWorkloadTypes(java.util.List<String> workloadTypes) {
        this.workloadTypes = workloadTypes;
        return this;
    }
    public java.util.List<String> getWorkloadTypes() {
        return this.workloadTypes;
    }

}
