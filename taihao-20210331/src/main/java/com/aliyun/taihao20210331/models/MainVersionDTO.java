// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class MainVersionDTO extends TeaModel {
    // createTime
    @NameInMap("CreateTime")
    public String createTime;

    // iaasType
    @NameInMap("IaasType")
    public String iaasType;

    // clusterTypeDTOS
    @NameInMap("clusterTypeDTOS")
    public java.util.List<ClusterTypeDTO> clusterTypeDTOS;

    // ecsRamRole
    @NameInMap("ecsRamRole")
    public String ecsRamRole;

    // imageId
    @NameInMap("imageId")
    public String imageId;

    // mainVersion
    @NameInMap("mainVersion")
    public String mainVersion;

    // nodeGroupSpecDTOS
    @NameInMap("nodeGroupSpecDTOS")
    public java.util.List<NodeGroupMetaDTO> nodeGroupSpecDTOS;

    @NameInMap("sshSpec")
    public SshSpec sshSpec;

    // status
    @NameInMap("status")
    public String status;

    // type
    @NameInMap("type")
    public String type;

    public static MainVersionDTO build(java.util.Map<String, ?> map) throws Exception {
        MainVersionDTO self = new MainVersionDTO();
        return TeaModel.build(map, self);
    }

    public MainVersionDTO setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public MainVersionDTO setIaasType(String iaasType) {
        this.iaasType = iaasType;
        return this;
    }
    public String getIaasType() {
        return this.iaasType;
    }

    public MainVersionDTO setClusterTypeDTOS(java.util.List<ClusterTypeDTO> clusterTypeDTOS) {
        this.clusterTypeDTOS = clusterTypeDTOS;
        return this;
    }
    public java.util.List<ClusterTypeDTO> getClusterTypeDTOS() {
        return this.clusterTypeDTOS;
    }

    public MainVersionDTO setEcsRamRole(String ecsRamRole) {
        this.ecsRamRole = ecsRamRole;
        return this;
    }
    public String getEcsRamRole() {
        return this.ecsRamRole;
    }

    public MainVersionDTO setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public MainVersionDTO setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public MainVersionDTO setNodeGroupSpecDTOS(java.util.List<NodeGroupMetaDTO> nodeGroupSpecDTOS) {
        this.nodeGroupSpecDTOS = nodeGroupSpecDTOS;
        return this;
    }
    public java.util.List<NodeGroupMetaDTO> getNodeGroupSpecDTOS() {
        return this.nodeGroupSpecDTOS;
    }

    public MainVersionDTO setSshSpec(SshSpec sshSpec) {
        this.sshSpec = sshSpec;
        return this;
    }
    public SshSpec getSshSpec() {
        return this.sshSpec;
    }

    public MainVersionDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MainVersionDTO setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
