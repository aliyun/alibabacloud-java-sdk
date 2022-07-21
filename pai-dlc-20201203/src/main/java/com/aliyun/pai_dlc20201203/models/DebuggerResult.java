// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerResult extends TeaModel {
    // 配置项细节，json结构
    @NameInMap("DebuggerConfigContent")
    public String debuggerConfigContent;

    // 规则报告细节信息
    @NameInMap("DebuggerJobIssues")
    public String debuggerJobIssues;

    // debugger job运行状态描述
    @NameInMap("DebuggerJobStatus")
    public String debuggerJobStatus;

    // 报告文件下载地址
    @NameInMap("DebuggerReportURL")
    public String debuggerReportURL;

    // 作业显示名
    @NameInMap("JobDisplayName")
    public String jobDisplayName;

    // 作业ID
    @NameInMap("JobId")
    public String jobId;

    // 用户ID
    @NameInMap("JobUserId")
    public String jobUserId;

    public static DebuggerResult build(java.util.Map<String, ?> map) throws Exception {
        DebuggerResult self = new DebuggerResult();
        return TeaModel.build(map, self);
    }

    public DebuggerResult setDebuggerConfigContent(String debuggerConfigContent) {
        this.debuggerConfigContent = debuggerConfigContent;
        return this;
    }
    public String getDebuggerConfigContent() {
        return this.debuggerConfigContent;
    }

    public DebuggerResult setDebuggerJobIssues(String debuggerJobIssues) {
        this.debuggerJobIssues = debuggerJobIssues;
        return this;
    }
    public String getDebuggerJobIssues() {
        return this.debuggerJobIssues;
    }

    public DebuggerResult setDebuggerJobStatus(String debuggerJobStatus) {
        this.debuggerJobStatus = debuggerJobStatus;
        return this;
    }
    public String getDebuggerJobStatus() {
        return this.debuggerJobStatus;
    }

    public DebuggerResult setDebuggerReportURL(String debuggerReportURL) {
        this.debuggerReportURL = debuggerReportURL;
        return this;
    }
    public String getDebuggerReportURL() {
        return this.debuggerReportURL;
    }

    public DebuggerResult setJobDisplayName(String jobDisplayName) {
        this.jobDisplayName = jobDisplayName;
        return this;
    }
    public String getJobDisplayName() {
        return this.jobDisplayName;
    }

    public DebuggerResult setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DebuggerResult setJobUserId(String jobUserId) {
        this.jobUserId = jobUserId;
        return this;
    }
    public String getJobUserId() {
        return this.jobUserId;
    }

}
