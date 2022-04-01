// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class CreateClusterParam extends TeaModel {
    // clusterId
    @NameInMap("clusterId")
    public String clusterId;

    // clusterName
    @NameInMap("clusterName")
    public String clusterName;

    // clusterScriptList
    @NameInMap("clusterScriptList")
    public java.util.List<ClusterScriptDTO> clusterScriptList;

    // clusterType
    @NameInMap("clusterType")
    public String clusterType;

    // deployMode
    @NameInMap("deployMode")
    public String deployMode;

    // depositType
    @NameInMap("depositType")
    public String depositType;

    // iaaSType
    @NameInMap("iaaSType")
    public String iaaSType;

    // operateUserId
    @NameInMap("operateUserId")
    public String operateUserId;

    // paymentType
    @NameInMap("paymentType")
    public String paymentType;

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

    public static CreateClusterParam build(java.util.Map<String, ?> map) throws Exception {
        CreateClusterParam self = new CreateClusterParam();
        return TeaModel.build(map, self);
    }

    public CreateClusterParam setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public CreateClusterParam setClusterName(String clusterName) {
        this.clusterName = clusterName;
        return this;
    }
    public String getClusterName() {
        return this.clusterName;
    }

    public CreateClusterParam setClusterScriptList(java.util.List<ClusterScriptDTO> clusterScriptList) {
        this.clusterScriptList = clusterScriptList;
        return this;
    }
    public java.util.List<ClusterScriptDTO> getClusterScriptList() {
        return this.clusterScriptList;
    }

    public CreateClusterParam setClusterType(String clusterType) {
        this.clusterType = clusterType;
        return this;
    }
    public String getClusterType() {
        return this.clusterType;
    }

    public CreateClusterParam setDeployMode(String deployMode) {
        this.deployMode = deployMode;
        return this;
    }
    public String getDeployMode() {
        return this.deployMode;
    }

    public CreateClusterParam setDepositType(String depositType) {
        this.depositType = depositType;
        return this;
    }
    public String getDepositType() {
        return this.depositType;
    }

    public CreateClusterParam setIaaSType(String iaaSType) {
        this.iaaSType = iaaSType;
        return this;
    }
    public String getIaaSType() {
        return this.iaaSType;
    }

    public CreateClusterParam setOperateUserId(String operateUserId) {
        this.operateUserId = operateUserId;
        return this;
    }
    public String getOperateUserId() {
        return this.operateUserId;
    }

    public CreateClusterParam setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateClusterParam setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateClusterParam setResourceOwnerUid(String resourceOwnerUid) {
        this.resourceOwnerUid = resourceOwnerUid;
        return this;
    }
    public String getResourceOwnerUid() {
        return this.resourceOwnerUid;
    }

    public CreateClusterParam setSecurityMode(String securityMode) {
        this.securityMode = securityMode;
        return this;
    }
    public String getSecurityMode() {
        return this.securityMode;
    }

    public CreateClusterParam setTagList(java.util.List<Tag> tagList) {
        this.tagList = tagList;
        return this;
    }
    public java.util.List<Tag> getTagList() {
        return this.tagList;
    }

    public CreateClusterParam setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

}
