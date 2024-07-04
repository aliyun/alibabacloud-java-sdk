// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerJobIssue extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;Name&quot;: &quot;CPUBottleneck&quot;,  &quot;Triggered&quot;: 10, &quot;Violations&quot;: 2,  &quot;Details&quot;: &quot;{}&quot;}</p>
     */
    @NameInMap("DebuggerJobIssue")
    public String debuggerJobIssue;

    /**
     * <strong>example:</strong>
     * <p>2021-01-12T14:35:00Z</p>
     */
    @NameInMap("GmtCreateTime")
    public String gmtCreateTime;

    /**
     * <strong>example:</strong>
     * <p>de-826ca1bcfba30</p>
     */
    @NameInMap("JobDebuggerIssueId")
    public String jobDebuggerIssueId;

    /**
     * <strong>example:</strong>
     * <p>dlc-20210126170216-mtl37ge7gkvdz</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>1002300</p>
     */
    @NameInMap("ReasonCode")
    public String reasonCode;

    /**
     * <strong>example:</strong>
     * <p>GPU利用率低</p>
     */
    @NameInMap("ReasonMessage")
    public String reasonMessage;

    /**
     * <strong>example:</strong>
     * <p>ProfileReport</p>
     */
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
