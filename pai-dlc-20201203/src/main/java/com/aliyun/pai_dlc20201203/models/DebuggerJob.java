// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerJob extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>dlc20210126170216-mtl37ge7gkvdz</p>
     */
    @NameInMap("DebuggerJobId")
    public String debuggerJobId;

    /**
     * <strong>example:</strong>
     * <p>dlc debugger test</p>
     */
    @NameInMap("DisplayName")
    public String displayName;

    /**
     * <strong>example:</strong>
     * <p>2932</p>
     */
    @NameInMap("Duration")
    public String duration;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:00Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("GmtFailedTime")
    public String gmtFailedTime;

    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    @NameInMap("GmtRunningTime")
    public String gmtRunningTime;

    @NameInMap("GmtStoppedTime")
    public String gmtStoppedTime;

    @NameInMap("GmtSubmittedTime")
    public String gmtSubmittedTime;

    @NameInMap("GmtSucceedTime")
    public String gmtSucceedTime;

    /**
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>12344556</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <strong>example:</strong>
     * <p>workspace01</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>public</p>
     */
    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static DebuggerJob build(java.util.Map<String, ?> map) throws Exception {
        DebuggerJob self = new DebuggerJob();
        return TeaModel.build(map, self);
    }

    public DebuggerJob setDebuggerJobId(String debuggerJobId) {
        this.debuggerJobId = debuggerJobId;
        return this;
    }
    public String getDebuggerJobId() {
        return this.debuggerJobId;
    }

    public DebuggerJob setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public DebuggerJob setDuration(String duration) {
        this.duration = duration;
        return this;
    }
    public String getDuration() {
        return this.duration;
    }

    public DebuggerJob setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public DebuggerJob setGmtFailedTime(String gmtFailedTime) {
        this.gmtFailedTime = gmtFailedTime;
        return this;
    }
    public String getGmtFailedTime() {
        return this.gmtFailedTime;
    }

    public DebuggerJob setGmtFinishTime(String gmtFinishTime) {
        this.gmtFinishTime = gmtFinishTime;
        return this;
    }
    public String getGmtFinishTime() {
        return this.gmtFinishTime;
    }

    public DebuggerJob setGmtRunningTime(String gmtRunningTime) {
        this.gmtRunningTime = gmtRunningTime;
        return this;
    }
    public String getGmtRunningTime() {
        return this.gmtRunningTime;
    }

    public DebuggerJob setGmtStoppedTime(String gmtStoppedTime) {
        this.gmtStoppedTime = gmtStoppedTime;
        return this;
    }
    public String getGmtStoppedTime() {
        return this.gmtStoppedTime;
    }

    public DebuggerJob setGmtSubmittedTime(String gmtSubmittedTime) {
        this.gmtSubmittedTime = gmtSubmittedTime;
        return this;
    }
    public String getGmtSubmittedTime() {
        return this.gmtSubmittedTime;
    }

    public DebuggerJob setGmtSucceedTime(String gmtSucceedTime) {
        this.gmtSucceedTime = gmtSucceedTime;
        return this;
    }
    public String getGmtSucceedTime() {
        return this.gmtSucceedTime;
    }

    public DebuggerJob setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DebuggerJob setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public DebuggerJob setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public DebuggerJob setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
