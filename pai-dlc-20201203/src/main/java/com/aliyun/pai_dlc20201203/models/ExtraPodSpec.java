// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ExtraPodSpec extends TeaModel {
    // 初始化容器
    @NameInMap("InitContainers")
    public java.util.List<ContainerSpec> initContainers;

    // Pod注解
    @NameInMap("PodAnnotations")
    public java.util.Map<String, String> podAnnotations;

    // Pod标签
    @NameInMap("PodLabels")
    public java.util.Map<String, String> podLabels;

    // 容器间共享的本地目录
    @NameInMap("SharedVolumeMountPaths")
    public java.util.List<String> sharedVolumeMountPaths;

    // 伴随容器
    @NameInMap("SideCarContainers")
    public java.util.List<ContainerSpec> sideCarContainers;

    public static ExtraPodSpec build(java.util.Map<String, ?> map) throws Exception {
        ExtraPodSpec self = new ExtraPodSpec();
        return TeaModel.build(map, self);
    }

    public ExtraPodSpec setInitContainers(java.util.List<ContainerSpec> initContainers) {
        this.initContainers = initContainers;
        return this;
    }
    public java.util.List<ContainerSpec> getInitContainers() {
        return this.initContainers;
    }

    public ExtraPodSpec setPodAnnotations(java.util.Map<String, String> podAnnotations) {
        this.podAnnotations = podAnnotations;
        return this;
    }
    public java.util.Map<String, String> getPodAnnotations() {
        return this.podAnnotations;
    }

    public ExtraPodSpec setPodLabels(java.util.Map<String, String> podLabels) {
        this.podLabels = podLabels;
        return this;
    }
    public java.util.Map<String, String> getPodLabels() {
        return this.podLabels;
    }

    public ExtraPodSpec setSharedVolumeMountPaths(java.util.List<String> sharedVolumeMountPaths) {
        this.sharedVolumeMountPaths = sharedVolumeMountPaths;
        return this;
    }
    public java.util.List<String> getSharedVolumeMountPaths() {
        return this.sharedVolumeMountPaths;
    }

    public ExtraPodSpec setSideCarContainers(java.util.List<ContainerSpec> sideCarContainers) {
        this.sideCarContainers = sideCarContainers;
        return this;
    }
    public java.util.List<ContainerSpec> getSideCarContainers() {
        return this.sideCarContainers;
    }

}
