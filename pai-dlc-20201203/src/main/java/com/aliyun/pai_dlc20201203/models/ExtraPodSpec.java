// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ExtraPodSpec extends TeaModel {
    /**
     * <p>The containers to be initialized.</p>
     */
    @NameInMap("InitContainers")
    public java.util.List<ContainerSpec> initContainers;

    /**
     * <p>The lifecycle object.</p>
     */
    @NameInMap("Lifecycle")
    public Lifecycle lifecycle;

    /**
     * <p>The pod annotations.</p>
     */
    @NameInMap("PodAnnotations")
    @Deprecated
    public java.util.Map<String, String> podAnnotations;

    /**
     * <p>The pod labels.</p>
     */
    @NameInMap("PodLabels")
    @Deprecated
    public java.util.Map<String, String> podLabels;

    /**
     * <p>The local paths shared between containers.</p>
     */
    @NameInMap("SharedVolumeMountPaths")
    public java.util.List<String> sharedVolumeMountPaths;

    /**
     * <p>The sidecar containers.</p>
     */
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

    public ExtraPodSpec setLifecycle(Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
        return this;
    }
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Deprecated
    public ExtraPodSpec setPodAnnotations(java.util.Map<String, String> podAnnotations) {
        this.podAnnotations = podAnnotations;
        return this;
    }
    public java.util.Map<String, String> getPodAnnotations() {
        return this.podAnnotations;
    }

    @Deprecated
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
