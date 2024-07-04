// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DebuggerResult extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;description&quot;:&quot;这是一个新的pytorchjob模板&quot;}</p>
     */
    @NameInMap("DebuggerConfigContent")
    public String debuggerConfigContent;

    /**
     * <strong>example:</strong>
     * <p>{ &quot;ProfileReport&quot;: { &quot;Name&quot;: &quot;CPUBottleneck&quot;,&quot;Triggered&quot;: 10,&quot;Violations&quot;: 2,&quot;Details&quot;: &quot;{}&quot;}, &quot;LowCPU&quot;: { &quot;Name&quot;: &quot;CPUBottleneck&quot;,&quot;Triggered&quot;: 10,&quot;Violations&quot;: 2,&quot;Details&quot;: &quot;{}&quot;}}</p>
     */
    @NameInMap("DebuggerJobIssues")
    public String debuggerJobIssues;

    /**
     * <strong>example:</strong>
     * <p>{&quot;Running&quot;: 1, &quot;Failed&quot;: 1, &quot;Succeeded&quot;: 2}</p>
     */
    @NameInMap("DebuggerJobStatus")
    public String debuggerJobStatus;

    /**
     * <strong>example:</strong>
     * <p><a href="http://xxx.com/debug/report/download/new_xxxx.html">http://xxx.com/debug/report/download/new_xxxx.html</a></p>
     */
    @NameInMap("DebuggerReportURL")
    public String debuggerReportURL;

    /**
     * <strong>example:</strong>
     * <p>dlc debugger test</p>
     */
    @NameInMap("JobDisplayName")
    public String jobDisplayName;

    /**
     * <strong>example:</strong>
     * <p>dlc-20210126170216-mtl37ge7gkvdz</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>12344556</p>
     */
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
