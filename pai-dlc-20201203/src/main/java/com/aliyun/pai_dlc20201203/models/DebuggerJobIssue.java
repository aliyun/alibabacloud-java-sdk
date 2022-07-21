// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerJobIssue extends TeaModel {
    // 规则报告的具体json描述
    @NameInMap("DebuggerJobIssue")
    public String debuggerJobIssue;

    // 创建时间（UTC）
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    // event的全局唯一ID
    @NameInMap("JobDebuggerIssueId")
    public String jobDebuggerIssueId;

    // 作业ID
    @NameInMap("JobId")
    public String jobId;

    // 规则触发原因的编码
    @NameInMap("ReasonCode")
    public String reasonCode;

    // 规则触发的原因
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    // 规则名称
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
