// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerJob extends TeaModel {
    // debugger分析作业ID
    @NameInMap("DebuggerJobId")
    public String debuggerJobId;

    // 作业显示名
    @NameInMap("DisplayName")
    public String displayName;

    // 作业运行的时长（单位秒）
    @NameInMap("Duration")
    public String duration;

    // 创建时间（UTC）
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // 失败时间（UTC）
    @NameInMap("GmtFailedTime")
    public String gmtFailedTime;

    // 任务完成时间（UTC）
    @NameInMap("GmtFinishTime")
    public String gmtFinishTime;

    // 运行开始时间（UTC）
    @NameInMap("GmtRunningTime")
    public String gmtRunningTime;

    // 结束时间（UTC）
    @NameInMap("GmtStoppedTime")
    public String gmtStoppedTime;

    // 提交时间（UTC）
    @NameInMap("GmtSubmittedTime")
    public String gmtSubmittedTime;

    // 成功结束时间（UTC）
    @NameInMap("GmtSucceedTime")
    public String gmtSucceedTime;

    // 作业运行状态
    @NameInMap("Status")
    public String status;

    // 用户ID
    @NameInMap("UserId")
    public String userId;

    // 作业所属的运行工作空间
    @NameInMap("WorkspaceId")
    public String workspaceId;

    // 作业所属的运行工作空间名称
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
