// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetSignalResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>2026-03-18T10:02:04+08:00</p>
     */
    @NameInMap("GmtCreated")
    public String gmtCreated;

    /**
     * <strong>example:</strong>
     * <p>2026-03-18T10:02:04+08:00</p>
     */
    @NameInMap("GmtModified")
    public String gmtModified;

    /**
     * <strong>example:</strong>
     * <p>oper***********</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>signal delivered to 1 pods</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("PodNames")
    public java.util.List<String> podNames;

    /**
     * <strong>example:</strong>
     * <p>Completed</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-xxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Roles")
    public java.util.List<String> roles;

    /**
     * <strong>example:</strong>
     * <p>pods</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <strong>example:</strong>
     * <p>SIGUSR1</p>
     */
    @NameInMap("Signal")
    public String signal;

    /**
     * <strong>example:</strong>
     * <p>dlc***********</p>
     */
    @NameInMap("SignalId")
    public String signalId;

    /**
     * <strong>example:</strong>
     * <p>Succeeded</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetSignalResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSignalResponseBody self = new GetSignalResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSignalResponseBody setGmtCreated(String gmtCreated) {
        this.gmtCreated = gmtCreated;
        return this;
    }
    public String getGmtCreated() {
        return this.gmtCreated;
    }

    public GetSignalResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public GetSignalResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetSignalResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSignalResponseBody setPodNames(java.util.List<String> podNames) {
        this.podNames = podNames;
        return this;
    }
    public java.util.List<String> getPodNames() {
        return this.podNames;
    }

    public GetSignalResponseBody setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public GetSignalResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSignalResponseBody setRoles(java.util.List<String> roles) {
        this.roles = roles;
        return this;
    }
    public java.util.List<String> getRoles() {
        return this.roles;
    }

    public GetSignalResponseBody setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public GetSignalResponseBody setSignal(String signal) {
        this.signal = signal;
        return this;
    }
    public String getSignal() {
        return this.signal;
    }

    public GetSignalResponseBody setSignalId(String signalId) {
        this.signalId = signalId;
        return this;
    }
    public String getSignalId() {
        return this.signalId;
    }

    public GetSignalResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
