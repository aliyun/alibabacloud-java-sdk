// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class JobSpec extends TeaModel {
    @NameInMap("AssignNodeSpec")
    public AssignNodeSpec assignNodeSpec;

    @NameInMap("AutoScalingSpec")
    public AutoScalingSpec autoScalingSpec;

    /**
     * <strong>example:</strong>
     * <p>ecs.c6.large</p>
     */
    @NameInMap("EcsSpec")
    public String ecsSpec;

    @NameInMap("ExtraPodSpec")
    public ExtraPodSpec extraPodSpec;

    /**
     * <strong>example:</strong>
     * <p>registry.cn-hangzhou.aliyuncs.com/pai-dlc/tensorflow-training:1.12.2PAI-cpu-py27-ubuntu16.04</p>
     */
    @NameInMap("Image")
    public String image;

    @NameInMap("ImageConfig")
    public ImageConfig imageConfig;

    @NameInMap("IsCheif")
    @Deprecated
    public Boolean isCheif;

    @NameInMap("IsChief")
    public Boolean isChief;

    @NameInMap("LocalMountSpecs")
    public java.util.List<LocalMountSpec> localMountSpecs;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PodCount")
    public Long podCount;

    @NameInMap("ResourceConfig")
    public ResourceConfig resourceConfig;

    @NameInMap("RestartPolicy")
    public String restartPolicy;

    @NameInMap("ServiceSpec")
    public ServiceSpec serviceSpec;

    @NameInMap("SpotSpec")
    public SpotSpec spotSpec;

    @NameInMap("StartupDependencies")
    public java.util.List<StartupDependency> startupDependencies;

    @NameInMap("SystemDisk")
    public SystemDisk systemDisk;

    /**
     * <strong>example:</strong>
     * <p>Worker</p>
     */
    @NameInMap("Type")
    public String type;

    /**
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
