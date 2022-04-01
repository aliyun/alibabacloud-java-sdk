// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ClusterDTO extends TeaModel {
    // autoRenew
    @NameInMap("autoRenew")
    public Boolean autoRenew;

    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // clusterName
    @NameInMap("clusterName")
    public String clusterName;

    // clusterStatus
    @NameInMap("clusterStatus")
    public String clusterStatus;

    // clusterType
    @NameInMap("clusterType")
    public String clusterType;

    // creator
    @NameInMap("creator")
    public String creator;

    // deployMode
    @NameInMap("deployMode")
    public String deployMode;

    // deploymentSetId
    @NameInMap("deploymentSetId")
    public String deploymentSetId;

    // depositType
    @NameInMap("depositType")
    public String depositType;

    // enableDeploymentSet
    @NameInMap("enableDeploymentSet")
    public Boolean enableDeploymentSet;

    // expireTime
    @NameInMap("expireTime")
    public Long expireTime;

    // failReason
    @NameInMap("failReason")
    public String failReason;

    // gmtCreate
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    // gmtModified
    @NameInMap("gmtModified")
    public Long gmtModified;

    // hasUncompletedOrder
    @NameInMap("hasUncompletedOrder")
    public Boolean hasUncompletedOrder;

    // iaaSType
    @NameInMap("iaaSType")
    public String iaaSType;

    // mainVersion
    @NameInMap("mainVersion")
    public String mainVersion;

    // modifier
    @NameInMap("modifier")
    public String modifier;

    // nodeRamRole
    @NameInMap("nodeRamRole")
    public String nodeRamRole;

    // paymentType
    @NameInMap("paymentType")
    public String paymentType;

    // productRoleName
    @NameInMap("productRoleName")
    public String productRoleName;

    // regionId
    @NameInMap("regionId")
    public String regionId;

    // resourceOwnerId
    @NameInMap("resourceOwnerId")
    public String resourceOwnerId;

    // securityMode
    @NameInMap("securityMode")
    public String securityMode;

    // vpcId
    @NameInMap("vpcId")
    public String vpcId;

    public static ClusterDTO build(java.util.Map<String, ?> map) throws Exception {
        ClusterDTO self = new ClusterDTO();
        return TeaModel.build(map, self);
    }

    public ClusterDTO setAutoRenew(Boolean autoRenew) {
        this.autoRenew = autoRenew;
        return this;
    }
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    public ClusterDTO setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public ClusterDTO setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public ClusterDTO setClusterStatus(String clusterStatus) {
        this.clusterStatus = clusterStatus;
        return this;
    }
    public String getClusterStatus() {
        return this.clusterStatus;
    }

    public ClusterDTO setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public ClusterDTO setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public ClusterDTO setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public ClusterDTO setDeploymentSetId(String deploymentSetId) {
        this.deploymentSetId = deploymentSetId;
        return this;
    }
    public String getDeploymentSetId() {
        return this.deploymentSetId;
    }

    public ClusterDTO setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public ClusterDTO setEnableDeploymentSet(Boolean enableDeploymentSet) {
        this.enableDeploymentSet = enableDeploymentSet;
        return this;
    }
    public Boolean getEnableDeploymentSet() {
        return this.enableDeploymentSet;
    }

    public ClusterDTO setExpireTime(Long expireTime) {
        this.expireTime = expireTime;
        return this;
    }
    public Long getExpireTime() {
        return this.expireTime;
    }

    public ClusterDTO setFailReason(String failReason) {
        this.failReason = failReason;
        return this;
    }
    public String getFailReason() {
        return this.failReason;
    }

    public ClusterDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public ClusterDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public ClusterDTO setHasUncompletedOrder(Boolean hasUncompletedOrder) {
        this.hasUncompletedOrder = hasUncompletedOrder;
        return this;
    }
    public Boolean getHasUncompletedOrder() {
        return this.hasUncompletedOrder;
    }

    public ClusterDTO setIaaSType(String iaaSType) {
        this.iaaSType = iaaSType;
        return this;
    }
    public String getIaaSType() {
        return this.iaaSType;
    }

    public ClusterDTO setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public ClusterDTO setModifier(String modifier) {
        this.modifier = modifier;
        return this;
    }
    public String getModifier() {
        return this.modifier;
    }

    public ClusterDTO setNodeRamRole(String nodeRamRole) {
        this.nodeRamRole = nodeRamRole;
        return this;
    }
    public String getNodeRamRole() {
        return this.nodeRamRole;
    }

    public ClusterDTO setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public ClusterDTO setProductRoleName(String productRoleName) {
        this.productRoleName = productRoleName;
        return this;
    }
    public String getProductRoleName() {
        return this.productRoleName;
    }

    public ClusterDTO setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ClusterDTO setResourceOwnerId(String resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public String getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ClusterDTO setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public ClusterDTO setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
