// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Workspace extends TeaModel {
    // 工作空间id
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 工作空间名称
    @NameInMap("WorkspaceName")
    public String workspaceName;

    // 创建者
    @NameInMap("Creator")
    public String creator;

    // 创建时间
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 最近修改时间
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    // 资源配额列表
    @NameInMap("Quotas")
    public java.util.List<Quota> quotas;

    // 资源总量
    @NameInMap("TotalResources")
    public Resources totalResources;

    // 成员列表
    @NameInMap("Members")
    public java.util.List<Member> members;

    // 管理员列表
    @NameInMap("WorkspaceAdmins")
    public java.util.List<Member> workspaceAdmins;

    public static Workspace build(java.util.Map<String, ?> map) throws Exception {
        Workspace self = new Workspace();
        return TeaModel.build(map, self);
    }

    public Workspace setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public Workspace setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public Workspace setCreator(String creator) {
        this.creator = creator;
        return this;
    }
    public String getCreator() {
        return this.creator;
    }

    public Workspace setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public Workspace setGmtModifyTime(String gmtModifyTime) {
        this.gmtModifyTime = gmtModifyTime;
        return this;
    }
    public String getGmtModifyTime() {
        return this.gmtModifyTime;
    }

    public Workspace setQuotas(java.util.List<Quota> quotas) {
        this.quotas = quotas;
        return this;
    }
    public java.util.List<Quota> getQuotas() {
        return this.quotas;
    }

    public Workspace setTotalResources(Resources totalResources) {
        this.totalResources = totalResources;
        return this;
    }
    public Resources getTotalResources() {
        return this.totalResources;
    }

    public Workspace setMembers(java.util.List<Member> members) {
        this.members = members;
        return this;
    }
    public java.util.List<Member> getMembers() {
        return this.members;
    }

    public Workspace setWorkspaceAdmins(java.util.List<Member> workspaceAdmins) {
        this.workspaceAdmins = workspaceAdmins;
        return this;
    }
    public java.util.List<Member> getWorkspaceAdmins() {
        return this.workspaceAdmins;
    }

}
