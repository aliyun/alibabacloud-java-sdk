// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class NodePodInfo extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Phase")
    public String phase;

    /**
     * <strong>example:</strong>
     * <p>192.168.2.2</p>
     */
    @NameInMap("PodIP")
    public String podIP;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("PodName")
    public String podName;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("PodNamespace")
    public String podNamespace;

    @NameInMap("ResourceSpec")
    public ResourceAmount resourceSpec;

    /**
     * <strong>example:</strong>
     * <p>dlc19de9s6vn3acr</p>
     */
    @NameInMap("WorkloadId")
    public String workloadId;

    /**
     * <strong>example:</strong>
     * <p>dlc</p>
     */
    @NameInMap("WorkloadType")
    public String workloadType;

    public static NodePodInfo build(java.util.Map<String, ?> map) throws Exception {
        NodePodInfo self = new NodePodInfo();
        return TeaModel.build(map, self);
    }

    public NodePodInfo setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public NodePodInfo setPodIP(String podIP) {
        this.podIP = podIP;
        return this;
    }
    public String getPodIP() {
        return this.podIP;
    }

    public NodePodInfo setPodName(String podName) {
        this.podName = podName;
        return this;
    }
    public String getPodName() {
        return this.podName;
    }

    public NodePodInfo setPodNamespace(String podNamespace) {
        this.podNamespace = podNamespace;
        return this;
    }
    public String getPodNamespace() {
        return this.podNamespace;
    }

    public NodePodInfo setResourceSpec(ResourceAmount resourceSpec) {
        this.resourceSpec = resourceSpec;
        return this;
    }
    public ResourceAmount getResourceSpec() {
        return this.resourceSpec;
    }

    public NodePodInfo setWorkloadId(String workloadId) {
        this.workloadId = workloadId;
        return this;
    }
    public String getWorkloadId() {
        return this.workloadId;
    }

    public NodePodInfo setWorkloadType(String workloadType) {
        this.workloadType = workloadType;
        return this;
    }
    public String getWorkloadType() {
        return this.workloadType;
    }

}
