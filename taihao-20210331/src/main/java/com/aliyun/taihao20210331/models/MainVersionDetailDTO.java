// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class MainVersionDetailDTO extends TeaModel {
    // applicationMetaDTOS
    @NameInMap("applicationMetaDTOS")
    public java.util.List<ApplicationMeta> applicationMetaDTOS;

    // clusterTypeMetas
    @NameInMap("clusterTypeMetas")
    public java.util.List<ClusterTypeMeta> clusterTypeMetas;

    // ecsRamRole
    @NameInMap("ecsRamRole")
    public String ecsRamRole;

    // gmtCreate
    @NameInMap("gmtCreate")
    public Long gmtCreate;

    // gmtModified
    @NameInMap("gmtModified")
    public Long gmtModified;

    // imageId
    @NameInMap("imageId")
    public String imageId;

    // mainVersion
    @NameInMap("mainVersion")
    public String mainVersion;

    // nodeGroupMetaDTOS
    @NameInMap("nodeGroupMetaDTOS")
    public java.util.List<NodeGroupMeta> nodeGroupMetaDTOS;

    // passwordLessLogins
    @NameInMap("passwordLessLogins")
    public java.util.List<PasswordLessLoginSpec> passwordLessLogins;

    // product
    @NameInMap("product")
    public String product;

    // releaseType
    @NameInMap("releaseType")
    public String releaseType;

    // status
    @NameInMap("status")
    public String status;

    // uuid
    @NameInMap("uuid")
    public String uuid;

    public static MainVersionDetailDTO build(java.util.Map<String, ?> map) throws Exception {
        MainVersionDetailDTO self = new MainVersionDetailDTO();
        return TeaModel.build(map, self);
    }

    public MainVersionDetailDTO setApplicationMetaDTOS(java.util.List<ApplicationMeta> applicationMetaDTOS) {
        this.applicationMetaDTOS = applicationMetaDTOS;
        return this;
    }
    public java.util.List<ApplicationMeta> getApplicationMetaDTOS() {
        return this.applicationMetaDTOS;
    }

    public MainVersionDetailDTO setClusterTypeMetas(java.util.List<ClusterTypeMeta> clusterTypeMetas) {
        this.clusterTypeMetas = clusterTypeMetas;
        return this;
    }
    public java.util.List<ClusterTypeMeta> getClusterTypeMetas() {
        return this.clusterTypeMetas;
    }

    public MainVersionDetailDTO setEcsRamRole(String ecsRamRole) {
        this.ecsRamRole = ecsRamRole;
        return this;
    }
    public String getEcsRamRole() {
        return this.ecsRamRole;
    }

    public MainVersionDetailDTO setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public MainVersionDetailDTO setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public MainVersionDetailDTO setImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    public String getImageId() {
        return this.imageId;
    }

    public MainVersionDetailDTO setMainVersion(String mainVersion) {
        this.mainVersion = mainVersion;
        return this;
    }
    public String getMainVersion() {
        return this.mainVersion;
    }

    public MainVersionDetailDTO setNodeGroupMetaDTOS(java.util.List<NodeGroupMeta> nodeGroupMetaDTOS) {
        this.nodeGroupMetaDTOS = nodeGroupMetaDTOS;
        return this;
    }
    public java.util.List<NodeGroupMeta> getNodeGroupMetaDTOS() {
        return this.nodeGroupMetaDTOS;
    }

    public MainVersionDetailDTO setPasswordLessLogins(java.util.List<PasswordLessLoginSpec> passwordLessLogins) {
        this.passwordLessLogins = passwordLessLogins;
        return this;
    }
    public java.util.List<PasswordLessLoginSpec> getPasswordLessLogins() {
        return this.passwordLessLogins;
    }

    public MainVersionDetailDTO setProduct(String product) {
        this.product = product;
        return this;
    }
    public String getProduct() {
        return this.product;
    }

    public MainVersionDetailDTO setReleaseType(String releaseType) {
        this.releaseType = releaseType;
        return this;
    }
    public String getReleaseType() {
        return this.releaseType;
    }

    public MainVersionDetailDTO setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public MainVersionDetailDTO setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
