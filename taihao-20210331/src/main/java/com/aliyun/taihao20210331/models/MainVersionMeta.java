// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class MainVersionMeta extends TeaModel {
    // applicationMetas
    @NameInMap("applicationMetas")
    public java.util.List<ApplicationMeta> applicationMetas;

    // clusterTypeMetas
    @NameInMap("clusterTypeMetas")
    public java.util.List<ClusterTypeMeta> clusterTypeMetas;

    // ecsRamRole
    @NameInMap("ecsRamRole")
    public String ecsRamRole;

    // gmtModified
    @NameInMap("gmtModified")
    public Long gmtModified;

    // nodeGroupMetas
    @NameInMap("nodeGroupMetas")
    public java.util.List<NodeGroupMeta> nodeGroupMetas;

    // passwordLessLogins
    @NameInMap("passwordLessLogins")
    public java.util.List<PasswordLessLoginSpec> passwordLessLogins;

    public static MainVersionMeta build(java.util.Map<String, ?> map) throws Exception {
        MainVersionMeta self = new MainVersionMeta();
        return TeaModel.build(map, self);
    }

    public MainVersionMeta setApplicationMetas(java.util.List<ApplicationMeta> applicationMetas) {
        this.applicationMetas = applicationMetas;
        return this;
    }
    public java.util.List<ApplicationMeta> getApplicationMetas() {
        return this.applicationMetas;
    }

    public MainVersionMeta setClusterTypeMetas(java.util.List<ClusterTypeMeta> clusterTypeMetas) {
        this.clusterTypeMetas = clusterTypeMetas;
        return this;
    }
    public java.util.List<ClusterTypeMeta> getClusterTypeMetas() {
        return this.clusterTypeMetas;
    }

    public MainVersionMeta setEcsRamRole(String ecsRamRole) {
        this.ecsRamRole = ecsRamRole;
        return this;
    }
    public String getEcsRamRole() {
        return this.ecsRamRole;
    }

    public MainVersionMeta setGmtModified(Long gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public Long getGmtModified() {
        return this.gmtModified;
    }

    public MainVersionMeta setNodeGroupMetas(java.util.List<NodeGroupMeta> nodeGroupMetas) {
        this.nodeGroupMetas = nodeGroupMetas;
        return this;
    }
    public java.util.List<NodeGroupMeta> getNodeGroupMetas() {
        return this.nodeGroupMetas;
    }

    public MainVersionMeta setPasswordLessLogins(java.util.List<PasswordLessLoginSpec> passwordLessLogins) {
        this.passwordLessLogins = passwordLessLogins;
        return this;
    }
    public java.util.List<PasswordLessLoginSpec> getPasswordLessLogins() {
        return this.passwordLessLogins;
    }

}
