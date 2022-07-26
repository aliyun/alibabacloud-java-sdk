// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerResult extends TeaModel {
    @NameInMap("DebuggerConfigContent")
    public String debuggerConfigContent;

    @NameInMap("DebuggerJobIssues")
    public String debuggerJobIssues;

    @NameInMap("DebuggerJobStatus")
    public String debuggerJobStatus;

    @NameInMap("DebuggerReportURL")
    public String debuggerReportURL;

    @NameInMap("JobDisplayName")
    public String jobDisplayName;

    @NameInMap("JobId")
    public String jobId;

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
