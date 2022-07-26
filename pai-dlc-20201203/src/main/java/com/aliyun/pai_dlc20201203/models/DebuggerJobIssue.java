// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerJobIssue extends TeaModel {
    @NameInMap("DebuggerJobIssue")
    public String debuggerJobIssue;

    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    @NameInMap("JobDebuggerIssueId")
    public String jobDebuggerIssueId;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ReasonCode")
    public String reasonCode;

    @NameInMap("ReasonMessage")
    public String reasonMessage;

    @NameInMap("RuleName")
    public String ruleName;

    public static DebuggerJobIssue build(java.util.Map<String, ?> map) throws Exception {
        DebuggerJobIssue self = new DebuggerJobIssue();
        return TeaModel.build(map, self);
    }

    public DebuggerJobIssue setDebuggerJobIssue(String debuggerJobIssue) {
        this.debuggerJobIssue = debuggerJobIssue;
        return this;
    }
    public String getDebuggerJobIssue() {
        return this.debuggerJobIssue;
    }

    public DebuggerJobIssue setGmtCreateTime(String gmtCreateTime) {
        this.gmtCreateTime = gmtCreateTime;
        return this;
    }
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    public DebuggerJobIssue setJobDebuggerIssueId(String jobDebuggerIssueId) {
        this.jobDebuggerIssueId = jobDebuggerIssueId;
        return this;
    }
    public String getJobDebuggerIssueId() {
        return this.jobDebuggerIssueId;
    }

    public DebuggerJobIssue setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DebuggerJobIssue setReasonCode(String reasonCode) {
        this.reasonCode = reasonCode;
        return this;
    }
    public String getReasonCode() {
        return this.reasonCode;
    }

    public DebuggerJobIssue setReasonMessage(String reasonMessage) {
        this.reasonMessage = reasonMessage;
        return this;
    }
    public String getReasonMessage() {
        return this.reasonMessage;
    }

    public DebuggerJobIssue setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

}
