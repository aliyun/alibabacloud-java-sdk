// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class ExtraPodSpec extends TeaModel {
    /**
     * <p>A list of init containers that run to completion before the main container starts.</p>
     */
    @NameInMap("InitContainers")
    public java.util.List<ContainerSpec> initContainers;

    /**
     * <p>Defines lifecycle hooks for the main container.</p>
     */
    @NameInMap("Lifecycle")
    public Lifecycle lifecycle;

    /**
     * <p>Defines the security context for the main container.</p>
     */
    @NameInMap("MainContainerSecurityContext")
    public SecurityContext mainContainerSecurityContext;

    /**
     * <p>Key-value pairs to apply to the pod as annotations. Use annotations to attach arbitrary, non-identifying metadata.</p>
     */
    @NameInMap("PodAnnotations")
    @Deprecated
    public java.util.Map<String, String> podAnnotations;

    /**
     * <p>Key-value pairs to apply to the pod as labels. Use labels to organize and select pods.</p>
     */
    @NameInMap("PodLabels")
    @Deprecated
    public java.util.Map<String, String> podLabels;

    /**
     * <p>A list of local directory paths to mount and share among all containers in the pod.</p>
     */
    @NameInMap("SharedVolumeMountPaths")
    public java.util.List<String> sharedVolumeMountPaths;

    /**
     * <p>A list of sidecar containers.</p>
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

    public ExtraPodSpec setMainContainerSecurityContext(SecurityContext mainContainerSecurityContext) {
        this.mainContainerSecurityContext = mainContainerSecurityContext;
        return this;
    }
    public SecurityContext getMainContainerSecurityContext() {
        return this.mainContainerSecurityContext;
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
