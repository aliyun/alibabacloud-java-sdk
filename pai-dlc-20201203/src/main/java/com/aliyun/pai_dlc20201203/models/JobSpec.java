// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobSpec extends TeaModel {
    /**
     * <p>The scheduling node configurations.</p>
     */
    @NameInMap("AssignNodeSpec")
    public AssignNodeSpec assignNodeSpec;

    /**
     * <p>The auto scaling configurations.</p>
     */
    @NameInMap("AutoScalingSpec")
    public AutoScalingSpec autoScalingSpec;

    /**
     * <p>The hardware specifications of the worker. For more information, see <a href="https://help.aliyun.com/document_detail/171758.html">Billing of DLC</a> of PAI.</p>
     * <blockquote>
     * <p> The price varies based on instance types.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    /**
     * <p>The additional pod configurations.</p>
     */
    @NameInMap("ExtraPodSpec")
    public ExtraPodSpec extraPodSpec;

    /**
     * <p>The address of the image that is run by the worker node. You can call <a href="https://help.aliyun.com/document_detail/449118.html">ListImages</a> to obtain the image provided by PAI. You can also specify a third-party public image.</p>
     * 
     * <strong>example:</strong>
     * <p>registry-vpc.cn-hangzhou.aliyuncs.com/cloud-dsw/tensorflow:1.12PAI-gpu-py36-cu101-ubuntu18.04</p>
     */
    @NameInMap("Image")
    public String image;

    /**
     * <p>The configuration of the private image.</p>
     */
    @NameInMap("ImageConfig")
    public ImageConfig imageConfig;

    /**
     * <p>Deprecated.</p>
     */
    @NameInMap("IsCheif")
    @Deprecated
    public Boolean isCheif;

    /**
     * <p>Whether the role is a Chief role. Chief role must be unique.</p>
     */
    @NameInMap("IsChief")
    public Boolean isChief;

    /**
     * <p>The list of local mount configurations.</p>
     */
    @NameInMap("LocalMountSpecs")
    public java.util.List<LocalMountSpec> localMountSpecs;

    /**
     * <p>The number of replicas.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PodCount")
    public Long podCount;

    /**
     * <p>The resource configurations.</p>
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
     * <p>The service configurations.</p>
     */
    @NameInMap("ServiceSpec")
    public ServiceSpec serviceSpec;

    /**
     * <p>The configurations of the preemptible instance.</p>
     */
    @NameInMap("SpotSpec")
    public SpotSpec spotSpec;

    @NameInMap("StartupDependencies")
    public java.util.List<StartupDependency> startupDependencies;

    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    /**
     * <p>The worker type, which is related to JobType. The valid values of this parameter vary based on the value of JobType.</p>
     * <ul>
     * <li>Valid values when JobType is set to <strong>TFJob</strong>: Chief, PS, Worker, Evaluator, and GraphLearn.</li>
     * <li>Valid values when JobType is set to <strong>PyTorchJob</strong>: Worker and Master.</li>
     * <li>Valid values when JobType is set to <strong>XGBoostJob</strong>: Worker and Master.</li>
     * <li>Valid values when JobType is set to <strong>OneFlowJob</strong>: Worker and Master.</li>
     * <li>Valid values when JobType is set to <strong>ElasticBatch</strong>: Worker and Master.</li>
     * </ul>
     * <p>The Master node in jobs of the PyTorchJob, XGBoostJob, OneFlowJob, or ElasticBatch type is optional. If you do not specify the Master node, the system automatically uses the first Worker node as the Master node.</p>
     * 
     * <strong>example:</strong>
     * <p>Worker</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>Whether to use preemptible instances.</p>
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

    public JobSpec setEcsSpec(String ecsSpec) {
        this.ecsSpec = ecsSpec;
        return this;
    }
    public String getEcsSpec() {
        return this.ecsSpec;
    }

    public JobSpec setExtraPodSpec(ExtraPodSpec extraPodSpec) {
        this.extraPodSpec = extraPodSpec;
        return this;
    }
    public ExtraPodSpec getExtraPodSpec() {
        return this.extraPodSpec;
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

    public JobSpec setPodCount(Long podCount) {
        this.podCount = podCount;
        return this;
    }
    public Long getPodCount() {
        return this.podCount;
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
