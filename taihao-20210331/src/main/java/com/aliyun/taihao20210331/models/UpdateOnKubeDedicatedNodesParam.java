// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UpdateOnKubeDedicatedNodesParam extends TeaModel {
    // ackInstanceId
    @NameInMap("ackInstanceId")
    public String ackInstanceId;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // desireDedicatedNodePools
    @NameInMap("desireDedicatedNodePools")
    public java.util.List<String> desireDedicatedNodePools;

    // desireDedicatedNodes
    @NameInMap("desireDedicatedNodes")
    public java.util.List<String> desireDedicatedNodes;

    // fullNodeLabels
    @NameInMap("fullNodeLabels")
    public java.util.List<KubeNodeLabelDTO> fullNodeLabels;

    @NameInMap("nodeLabel")
    public KubeNodeLabelDTO nodeLabel;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // productRoleName
    @NameInMap("productRoleName")
    public String productRoleName;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    public static UpdateOnKubeDedicatedNodesParam build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnKubeDedicatedNodesParam self = new UpdateOnKubeDedicatedNodesParam();
        return TeaModel.build(map, self);
    }

    public UpdateOnKubeDedicatedNodesParam setAckInstanceId(String ackInstanceId) {
        this.ackInstanceId = ackInstanceId;
        return this;
    }
    public String getAckInstanceId() {
        return this.ackInstanceId;
    }

    public UpdateOnKubeDedicatedNodesParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public UpdateOnKubeDedicatedNodesParam setDesireDedicatedNodePools(java.util.List<String> desireDedicatedNodePools) {
        this.desireDedicatedNodePools = desireDedicatedNodePools;
        return this;
    }
    public java.util.List<String> getDesireDedicatedNodePools() {
        return this.desireDedicatedNodePools;
    }

    public UpdateOnKubeDedicatedNodesParam setDesireDedicatedNodes(java.util.List<String> desireDedicatedNodes) {
        this.desireDedicatedNodes = desireDedicatedNodes;
        return this;
    }
    public java.util.List<String> getDesireDedicatedNodes() {
        return this.desireDedicatedNodes;
    }

    public UpdateOnKubeDedicatedNodesParam setFullNodeLabels(java.util.List<KubeNodeLabelDTO> fullNodeLabels) {
        this.fullNodeLabels = fullNodeLabels;
        return this;
    }
    public java.util.List<KubeNodeLabelDTO> getFullNodeLabels() {
        return this.fullNodeLabels;
    }

    public UpdateOnKubeDedicatedNodesParam setNodeLabel(KubeNodeLabelDTO nodeLabel) {
        this.nodeLabel = nodeLabel;
        return this;
    }
    public KubeNodeLabelDTO getNodeLabel() {
        return this.nodeLabel;
    }

    public UpdateOnKubeDedicatedNodesParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public UpdateOnKubeDedicatedNodesParam setProductRoleName(String productRoleName) {
        this.productRoleName = productRoleName;
        return this;
    }
    public String getProductRoleName() {
        return this.productRoleName;
    }

    public UpdateOnKubeDedicatedNodesParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

}
