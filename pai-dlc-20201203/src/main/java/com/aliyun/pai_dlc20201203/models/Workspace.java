// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class Workspace extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ken</p>
     */
    @NameInMap("Creator")
    public String creator;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:36:01Z</p>
     */
    @NameInMap("GmtModifyTime")
    public String gmtModifyTime;

    @NameInMap("Members")
    public java.util.List<Member> members;

    @NameInMap("Quotas")
    public java.util.List<Quota> quotas;

    @NameInMap("TotalResources")
    public Resources totalResources;

    @NameInMap("WorkspaceAdmins")
    public java.util.List<Member> workspaceAdmins;

    /**
     * <strong>example:</strong>
     * <p>ws-20210126170216-mtl37ge7gkvdz</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>dlc-workspace</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static Workspace build(java.util.Map<String, ?> map) throws Exception {
        Workspace self = new Workspace();
        return TeaModel.build(map, self);
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

    public Workspace setMembers(java.util.List<Member> members) {
        this.members = members;
        return this;
    }
    public java.util.List<Member> getMembers() {
        return this.members;
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

    public Workspace setWorkspaceAdmins(java.util.List<Member> workspaceAdmins) {
        this.workspaceAdmins = workspaceAdmins;
        return this;
    }
    public java.util.List<Member> getWorkspaceAdmins() {
        return this.workspaceAdmins;
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

}
