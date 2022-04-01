// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateFullClusterByMainVersionParam extends TeaModel {
    // applicationComponentDeployments
    @NameInMap("applicationComponentDeployments")
    public java.util.List<ApplicationComponentDeploymentParam> applicationComponentDeployments;

    // applicationConfigs
    @NameInMap("applicationConfigs")
    public java.util.List<ApplicationConfigParam> applicationConfigs;

    // applications
    @NameInMap("applications")
    public java.util.List<ApplicationParam> applications;

    // autoRecommendConfig
    @NameInMap("autoRecommendConfig")
    public Boolean autoRecommendConfig;

    // clientToken
    @NameInMap("clientToken")
    public String clientToken;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // clusterName
    @NameInMap("clusterName")
    public String clusterName;

    // clusterScripts
    @NameInMap("clusterScripts")
    public java.util.List<ClusterScriptDTO> clusterScripts;

    // clusterType
    @NameInMap("clusterType")
    public String clusterType;

    // clusterUsers
    @NameInMap("clusterUsers")
    public java.util.List<ClusterUserDTO> clusterUsers;

    // deployMode
    @NameInMap("deployMode")
    public String deployMode;

    // depositType
    @NameInMap("depositType")
    public String depositType;

    // description
    @NameInMap("description")
    public String description;

    // enableDeploymentSet
    @NameInMap("enableDeploymentSet")
    public Boolean enableDeploymentSet;

    // iaaSType
    @NameInMap("iaaSType")
    public String iaaSType;

    // mainVersion
    @NameInMap("mainVersion")
    public String mainVersion;

    // nodeGroupParams
    @NameInMap("nodeGroupParams")
    public java.util.List<NodeGroupParam> nodeGroupParams;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // optionalApplications
    @NameInMap("optionalApplications")
    public java.util.List<ApplicationParam> optionalApplications;

    // paymentType
    @NameInMap("paymentType")
    public String paymentType;

    // productRoleName
    @NameInMap("productRoleName")
    public String productRoleName;

    // resourceGroupId
    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    // resourceOwnerUid
    @NameInMap("resourceOwnerUid")
    public String resourceOwnerUid;

    // securityMode
    @NameInMap("securityMode")
    public String securityMode;

    // tagList
    @NameInMap("tagList")
    public java.util.List<Tag> tagList;

    // vpcId
    @NameInMap("vpcId")
    public String vpcId;

    public static CreateFullClusterByMainVersionParam build(java.util.Map<String, ?> map) throws Exception {
        CreateFullClusterByMainVersionParam self = new CreateFullClusterByMainVersionParam();
        return TeaModel.build(map, self);
    }

    public CreateFullClusterByMainVersionParam setApplicationComponentDeployments(java.util.List<ApplicationComponentDeploymentParam> applicationComponentDeployments) {
        this.applicationComponentDeployments = applicationComponentDeployments;
        return this;
    }
    public java.util.List<ApplicationComponentDeploymentParam> getApplicationComponentDeployments() {
        return this.applicationComponentDeployments;
    }

    public CreateFullClusterByMainVersionParam setApplicationConfigs(java.util.List<ApplicationConfigParam> applicationConfigs) {
        this.applicationConfigs = applicationConfigs;
        return this;
    }
    public java.util.List<ApplicationConfigParam> getApplicationConfigs() {
        return this.applicationConfigs;
    }

    public CreateFullClusterByMainVersionParam setApplications(java.util.List<ApplicationParam> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ApplicationParam> getApplications() {
        return this.applications;
    }

    public CreateFullClusterByMainVersionParam setAutoRecommendConfig(Boolean autoRecommendConfig) {
        this.autoRecommendConfig = autoRecommendConfig;
        return this;
    }
    public Boolean getAutoRecommendConfig() {
        return this.autoRecommendConfig;
    }

    public CreateFullClusterByMainVersionParam setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFullClusterByMainVersionParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateFullClusterByMainVersionParam setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateFullClusterByMainVersionParam setClusterScripts(java.util.List<ClusterScriptDTO> clusterScripts) {
        this.clusterScripts = clusterScripts;
        return this;
    }
    public java.util.List<ClusterScriptDTO> getClusterScripts() {
        return this.clusterScripts;
    }

    public CreateFullClusterByMainVersionParam setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateFullClusterByMainVersionParam setClusterUsers(java.util.List<ClusterUserDTO> clusterUsers) {
        this.clusterUsers = clusterUsers;
        return this;
    }
    public java.util.List<ClusterUserDTO> getClusterUsers() {
        return this.clusterUsers;
    }

    public CreateFullClusterByMainVersionParam setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public CreateFullClusterByMainVersionParam setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public CreateFullClusterByMainVersionParam setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFullClusterByMainVersionParam setEnableDeploymentSet(Boolean enableDeploymentSet) {
        this.enableDeploymentSet = enableDeploymentSet;
        return this;
    }
    public Boolean getEnableDeploymentSet() {
        return this.enableDeploymentSet;
    }

    public CreateFullClusterByMainVersionParam setIaaSType(String iaaSType) {
        this.iaaSType = iaaSType;
        return this;
    }
    public String getIaaSType() {
        return this.iaaSType;
    }

    public CreateFullClusterByMainVersionParam setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public CreateFullClusterByMainVersionParam setNodeGroupParams(java.util.List<NodeGroupParam> nodeGroupParams) {
        this.nodeGroupParams = nodeGroupParams;
        return this;
    }
    public java.util.List<NodeGroupParam> getNodeGroupParams() {
        return this.nodeGroupParams;
    }

    public CreateFullClusterByMainVersionParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public CreateFullClusterByMainVersionParam setOptionalApplications(java.util.List<ApplicationParam> optionalApplications) {
        this.optionalApplications = optionalApplications;
        return this;
    }
    public java.util.List<ApplicationParam> getOptionalApplications() {
        return this.optionalApplications;
    }

    public CreateFullClusterByMainVersionParam setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateFullClusterByMainVersionParam setProductRoleName(String productRoleName) {
        this.productRoleName = productRoleName;
        return this;
    }
    public String getProductRoleName() {
        return this.productRoleName;
    }

    public CreateFullClusterByMainVersionParam setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateFullClusterByMainVersionParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public CreateFullClusterByMainVersionParam setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public CreateFullClusterByMainVersionParam setTagList(java.util.List<Tag> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<Tag> getTagList() {
        return this.tagList;
    }

    public CreateFullClusterByMainVersionParam setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
