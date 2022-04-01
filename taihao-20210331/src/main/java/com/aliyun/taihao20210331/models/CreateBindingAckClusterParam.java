// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateBindingAckClusterParam extends TeaModel {
    // ackInstanceId
    @NameInMap("ackInstanceId")
    public String ackInstanceId;

    // ackNodePools
    @NameInMap("ackNodePools")
    public java.util.List<AckNodePools> ackNodePools;

    // ackNodes
    @NameInMap("ackNodes")
    public java.util.List<AckNodes> ackNodes;

    // applicationList
    @NameInMap("applicationList")
    public java.util.List<ApplicationList> applicationList;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // clusterName
    @NameInMap("clusterName")
    public String clusterName;

    // clusterType
    @NameInMap("clusterType")
    public String clusterType;

    // namespace
    @NameInMap("namespace")
    public String namespace;

    @NameInMap("nodeLabel")
    public KubeNodeLabelDTO nodeLabel;

    // oauthCallbackUrl
    @NameInMap("oauthCallbackUrl")
    public String oauthCallbackUrl;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // ossPath
    @NameInMap("ossPath")
    public String ossPath;

    // productRoleName
    @NameInMap("productRoleName")
    public String productRoleName;

    // productSelectors
    @NameInMap("productSelectors")
    public NodeSelector productSelectors;

    // resourceGroupId
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // token
    @NameInMap("token")
    public String token;

    public static CreateBindingAckClusterParam build(java.util.Map<String, ?> map) throws Exception {
        CreateBindingAckClusterParam self = new CreateBindingAckClusterParam();
        return TeaModel.build(map, self);
    }

    public CreateBindingAckClusterParam setAckInstanceId(String ackInstanceId) {
        this.ackInstanceId = ackInstanceId;
        return this;
    }
    public String getAckInstanceId() {
        return this.ackInstanceId;
    }

    public CreateBindingAckClusterParam setAckNodePools(java.util.List<AckNodePools> ackNodePools) {
        this.ackNodePools = ackNodePools;
        return this;
    }
    public java.util.List<AckNodePools> getAckNodePools() {
        return this.ackNodePools;
    }

    public CreateBindingAckClusterParam setAckNodes(java.util.List<AckNodes> ackNodes) {
        this.ackNodes = ackNodes;
        return this;
    }
    public java.util.List<AckNodes> getAckNodes() {
        return this.ackNodes;
    }

    public CreateBindingAckClusterParam setApplicationList(java.util.List<ApplicationList> applicationList) {
        this.applicationList = applicationList;
        return this;
    }
    public java.util.List<ApplicationList> getApplicationList() {
        return this.applicationList;
    }

    public CreateBindingAckClusterParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateBindingAckClusterParam setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateBindingAckClusterParam setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateBindingAckClusterParam setNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }
    public String getNamespace() {
        return this.namespace;
    }

    public CreateBindingAckClusterParam setNodeLabel(KubeNodeLabelDTO nodeLabel) {
        this.nodeLabel = nodeLabel;
        return this;
    }
    public KubeNodeLabelDTO getNodeLabel() {
        return this.nodeLabel;
    }

    public CreateBindingAckClusterParam setOauthCallbackUrl(String oauthCallbackUrl) {
        this.oauthCallbackUrl = oauthCallbackUrl;
        return this;
    }
    public String getOauthCallbackUrl() {
        return this.oauthCallbackUrl;
    }

    public CreateBindingAckClusterParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public CreateBindingAckClusterParam setOssPath(String ossPath) {
        this.ossPath = ossPath;
        return this;
    }
    public String getOssPath() {
        return this.ossPath;
    }

    public CreateBindingAckClusterParam setProductRoleName(String productRoleName) {
        this.productRoleName = productRoleName;
        return this;
    }
    public String getProductRoleName() {
        return this.productRoleName;
    }

    public CreateBindingAckClusterParam setProductSelectors(NodeSelector productSelectors) {
        this.productSelectors = productSelectors;
        return this;
    }
    public NodeSelector getProductSelectors() {
        return this.productSelectors;
    }

    public CreateBindingAckClusterParam setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateBindingAckClusterParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public CreateBindingAckClusterParam setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public static class AckNodePools extends TeaModel {
        // nodePoolId
        @NameInMap("nodePoolId")
        public String nodePoolId;

        @NameInMap("nodeSelector")
        public NodeSelector nodeSelector;

        public static AckNodePools build(java.util.Map<String, ?> map) throws Exception {
            AckNodePools self = new AckNodePools();
            return TeaModel.build(map, self);
        }

        public AckNodePools setNodePoolId(String nodePoolId) {
            this.nodePoolId = nodePoolId;
            return this;
        }
        public String getNodePoolId() {
            return this.nodePoolId;
        }

        public AckNodePools setNodeSelector(NodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }
        public NodeSelector getNodeSelector() {
            return this.nodeSelector;
        }

    }

    public static class AckNodes extends TeaModel {
        // nodeId
        @NameInMap("nodeId")
        public String nodeId;

        @NameInMap("nodeSelector")
        public NodeSelector nodeSelector;

        public static AckNodes build(java.util.Map<String, ?> map) throws Exception {
            AckNodes self = new AckNodes();
            return TeaModel.build(map, self);
        }

        public AckNodes setNodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }
        public String getNodeId() {
            return this.nodeId;
        }

        public AckNodes setNodeSelector(NodeSelector nodeSelector) {
            this.nodeSelector = nodeSelector;
            return this;
        }
        public NodeSelector getNodeSelector() {
            return this.nodeSelector;
        }

    }

    public static class ApplicationList extends TeaModel {
        // applicationName
        @NameInMap("applicationName")
        public String applicationName;

        // applicationVersion
        @NameInMap("applicationVersion")
        public String applicationVersion;

        public static ApplicationList build(java.util.Map<String, ?> map) throws Exception {
            ApplicationList self = new ApplicationList();
            return TeaModel.build(map, self);
        }

        public ApplicationList setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ApplicationList setApplicationVersion(String applicationVersion) {
            this.applicationVersion = applicationVersion;
            return this;
        }
        public String getApplicationVersion() {
            return this.applicationVersion;
        }

    }

}
