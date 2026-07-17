// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobSpec extends TeaModel {
    /**
     * <p>The scheduling node assignment configuration.</p>
     */
    @NameInMap("AssignNodeSpec")
    public AssignNodeSpec assignNodeSpec;

    /**
     * <p>The auto scaling configuration.</p>
     */
    @NameInMap("AutoScalingSpec")
    public AutoScalingSpec autoScalingSpec;

    /**
     * <p>Specifies whether to consider this role when determining job success. This parameter takes effect only when the success policy is set to Partial.</p>
     */
    @NameInMap("ConsiderInSuccessPolicy")
    public Boolean considerInSuccessPolicy;

    /**
     * <p>The hardware specifications of the worker. Visit <a href="https://help.aliyun.com/document_detail/171758.html">PAI-DLC billing</a> for the detailed list of specifications.&gt;Notice: Prices vary depending on the specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    @NameInMap("ElasticSpotSpecs")
    public java.util.List<ElasticSpotSpec> elasticSpotSpecs;

    /**
     * <p>The extra pod configuration.</p>
     */
    @NameInMap("ExtraPodSpec")
    public ExtraPodSpec extraPodSpec;

    @NameInMap("HyperNodeSchedulingConfig")
    public HyperNodeSchedulingConfig hyperNodeSchedulingConfig;

    /**
     * <p>The runtime image address for this type of worker. Call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain images provided by the PAI platform. You can also specify a third-party public image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/cloud-dsw/tensorflow:1.12PAI-gpu-py36-cu101-ubuntu18.04</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The private image configuration.</p>
     */
    @NameInMap("ImageConfig")
    public ImageConfig imageConfig;

    /**
     * <p>Deprecated due to a spelling error.</p>
     */
    @NameInMap("IsCheif")
    @Deprecated
    public Boolean isCheif;

    /**
     * <p>Indicates whether this role is the Chief role. Only one Chief role is allowed.</p>
     */
    @NameInMap("IsChief")
    public Boolean isChief;

    /**
     * <p>The list of local mount configurations.</p>
     */
    @NameInMap("LocalMountSpecs")
    public java.util.List<LocalMountSpec> localMountSpecs;

    @NameInMap("OversoldType")
    public String oversoldType;

    /**
     * <p>The number of replicas.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PodCount")
    public Long podCount;

    @NameInMap("QuotaId")
    public String quotaId;

    /**
     * <p>The resource configuration.</p>
     */
    @NameInMap("ResourceConfig")
    public ResourceConfig resourceConfig;

    /**
     * <p>The restart policy. Valid values: Always, Never, OnFailure, and ExitCode.</p>
     * 
     * <strong>example:</strong>
     * <p>ExitCode</p>
     */
    @NameInMap("RestartPolicy")
    public String restartPolicy;

    /**
     * <p>The service configuration.</p>
     */
    @NameInMap("ServiceSpec")
    public ServiceSpec serviceSpec;

    /**
     * <p>The spot instance configuration.</p>
     */
    @NameInMap("SpotSpec")
    public SpotSpec spotSpec;

    /**
     * <p>The dependencies required before this role starts.</p>
     */
    @NameInMap("StartupDependencies")
    public java.util.List<StartupDependency> startupDependencies;

    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    /**
     * <p>Type is closely related to Job Type. Different Job Types support different Worker Types.</p>
     * <ul>
     * <li><p><strong>TFJob</strong>: Supports Chief, PS, Worker, Evaluator, and GraphLearn.</p>
     * </li>
     * <li><p><strong>PyTorchJob</strong>: Supports Worker and Master.</p>
     * </li>
     * <li><p><strong>XGBoostJob</strong>: Supports Worker and Master.</p>
     * </li>
     * <li><p><strong>OneFlowJob</strong>: Supports Worker and Master.</p>
     * </li>
     * <li><p><strong>ElasticBatch</strong>: Supports Worker and Master.</p>
     * </li>
     * <li><p><strong>RayJob</strong>: Supports Head, Worker, and Worker[-xxx].</p>
     * </li>
     * </ul>
     * <p>Master is optional in PyTorchJob, XGBoostJob, OneFlowJob, and ElasticBatch. If Master is not specified, the system automatically designates the first Worker node as Master.</p>
     * 
     * <strong>example:</strong>
     * <p>Worker</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Specifies whether to use spot instances.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("UseSpotInstance")
    @Deprecated
    public Boolean useSpotInstance;

    public static JobSpec build(java.util.Map<String, ?> map) throws Exception {
        JobSpec self = new JobSpec();
        return TeaModel.build(map, self);
    }

    public JobSpec setAssignNodeSpec(AssignNodeSpec assignNodeSpec) {
        this.assignNodeSpec = assignNodeSpec;
        return this;
    }
    public AssignNodeSpec getAssignNodeSpec() {
        return this.assignNodeSpec;
    }

    public JobSpec setAutoScalingSpec(AutoScalingSpec autoScalingSpec) {
        this.autoScalingSpec = autoScalingSpec;
        return this;
    }
    public AutoScalingSpec getAutoScalingSpec() {
        return this.autoScalingSpec;
    }

    public JobSpec setConsiderInSuccessPolicy(Boolean considerInSuccessPolicy) {
        this.considerInSuccessPolicy = considerInSuccessPolicy;
        return this;
    }
    public Boolean getConsiderInSuccessPolicy() {
        return this.considerInSuccessPolicy;
    }

    public JobSpec setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public JobSpec setElasticSpotSpecs(java.util.List<ElasticSpotSpec> elasticSpotSpecs) {
        this.elasticSpotSpecs = elasticSpotSpecs;
        return this;
    }
    public java.util.List<ElasticSpotSpec> getElasticSpotSpecs() {
        return this.elasticSpotSpecs;
    }

    public JobSpec setExtraPodSpec(ExtraPodSpec extraPodSpec) {
        this.extraPodSpec = extraPodSpec;
        return this;
    }
    public ExtraPodSpec getExtraPodSpec() {
        return this.extraPodSpec;
    }

    public JobSpec setHyperNodeSchedulingConfig(HyperNodeSchedulingConfig hyperNodeSchedulingConfig) {
        this.hyperNodeSchedulingConfig = hyperNodeSchedulingConfig;
        return this;
    }
    public HyperNodeSchedulingConfig getHyperNodeSchedulingConfig() {
        return this.hyperNodeSchedulingConfig;
    }

    public JobSpec setImage(String image) {
        this.image = image;
        return this;
    }
    public String getImage() {
        return this.image;
    }

    public JobSpec setImageConfig(ImageConfig imageConfig) {
        this.imageConfig = imageConfig;
        return this;
    }
    public ImageConfig getImageConfig() {
        return this.imageConfig;
    }

    @Deprecated
    public JobSpec setIsCheif(Boolean isCheif) {
        this.isCheif = isCheif;
        return this;
    }
    public Boolean getIsCheif() {
        return this.isCheif;
    }

    public JobSpec setIsChief(Boolean isChief) {
        this.isChief = isChief;
        return this;
    }
    public Boolean getIsChief() {
        return this.isChief;
    }

    public JobSpec setLocalMountSpecs(java.util.List<LocalMountSpec> localMountSpecs) {
        this.localMountSpecs = localMountSpecs;
        return this;
    }
    public java.util.List<LocalMountSpec> getLocalMountSpecs() {
        return this.localMountSpecs;
    }

    public JobSpec setOversoldType(String oversoldType) {
        this.oversoldType = oversoldType;
        return this;
    }
    public String getOversoldType() {
        return this.oversoldType;
    }

    public JobSpec setPodCount(Long podCount) {
        this.podCount = podCount;
        return this;
    }
    public Long getPodCount() {
        return this.podCount;
    }

    public JobSpec setQuotaId(String quotaId) {
        this.quotaId = quotaId;
        return this;
    }
    public String getQuotaId() {
        return this.quotaId;
    }

    public JobSpec setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
        return this;
    }
    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    public JobSpec setRestartPolicy(String restartPolicy) {
        this.restartPolicy = restartPolicy;
        return this;
    }
    public String getRestartPolicy() {
        return this.restartPolicy;
    }

    public JobSpec setServiceSpec(ServiceSpec serviceSpec) {
        this.serviceSpec = serviceSpec;
        return this;
    }
    public ServiceSpec getServiceSpec() {
        return this.serviceSpec;
    }

    public JobSpec setSpotSpec(SpotSpec spotSpec) {
        this.spotSpec = spotSpec;
        return this;
    }
    public SpotSpec getSpotSpec() {
        return this.spotSpec;
    }

    public JobSpec setStartupDependencies(java.util.List<StartupDependency> startupDependencies) {
        this.startupDependencies = startupDependencies;
        return this;
    }
    public java.util.List<StartupDependency> getStartupDependencies() {
        return this.startupDependencies;
    }

    public JobSpec setSystemDisk(SystemDisk systemDisk) {
        this.systemDisk = systemDisk;
        return this;
    }
    public SystemDisk getSystemDisk() {
        return this.systemDisk;
    }

    public JobSpec setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    @Deprecated
    public JobSpec setUseSpotInstance(Boolean useSpotInstance) {
        this.useSpotInstance = useSpotInstance;
        return this;
    }
    public Boolean getUseSpotInstance() {
        return this.useSpotInstance;
    }

}
