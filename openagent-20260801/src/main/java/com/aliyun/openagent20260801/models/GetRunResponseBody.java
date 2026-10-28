// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class GetRunResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public GetRunResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRunResponseBody self = new GetRunResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRunResponseBody setData(GetRunResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRunResponseBodyData getData() {
        return this.data;
    }

    public GetRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetRunResponseBodyDataOutcomeInterruptsDataApiCalls extends TeaModel {
        /**
         * <p>The API name.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleAction</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The operation description.</p>
         * 
         * <strong>example:</strong>
         * <p>Perform changes on the sample resource</p>
         */
        @NameInMap("description")
        public String description;

        public static GetRunResponseBodyDataOutcomeInterruptsDataApiCalls build(java.util.Map<String, ?> map) throws Exception {
            GetRunResponseBodyDataOutcomeInterruptsDataApiCalls self = new GetRunResponseBodyDataOutcomeInterruptsDataApiCalls();
            return TeaModel.build(map, self);
        }

        public GetRunResponseBodyDataOutcomeInterruptsDataApiCalls setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public GetRunResponseBodyDataOutcomeInterruptsDataApiCalls setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class GetRunResponseBodyDataOutcomeInterruptsData extends TeaModel {
        /**
         * <p>The list of APIs pending approval.</p>
         */
        @NameInMap("apiCalls")
        public java.util.List<GetRunResponseBodyDataOutcomeInterruptsDataApiCalls> apiCalls;

        /**
         * <p>The approval ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval_example_001</p>
         */
        @NameInMap("approvalId")
        public String approvalId;

        /**
         * <p>The approval URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/approvals/approval_example_001">https://example.com/approvals/approval_example_001</a></p>
         */
        @NameInMap("approvalUrl")
        public String approvalUrl;

        /**
         * <p>Specifies whether the interrupt can be canceled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cancellable")
        public Boolean cancellable;

        /**
         * <p>The change digest.</p>
         * 
         * <strong>example:</strong>
         * <p>example-change-digest</p>
         */
        @NameInMap("changeDigest")
        public String changeDigest;

        /**
         * <p>The approval title.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample change approval</p>
         */
        @NameInMap("title")
        public String title;

        public static GetRunResponseBodyDataOutcomeInterruptsData build(java.util.Map<String, ?> map) throws Exception {
            GetRunResponseBodyDataOutcomeInterruptsData self = new GetRunResponseBodyDataOutcomeInterruptsData();
            return TeaModel.build(map, self);
        }

        public GetRunResponseBodyDataOutcomeInterruptsData setApiCalls(java.util.List<GetRunResponseBodyDataOutcomeInterruptsDataApiCalls> apiCalls) {
            this.apiCalls = apiCalls;
            return this;
        }
        public java.util.List<GetRunResponseBodyDataOutcomeInterruptsDataApiCalls> getApiCalls() {
            return this.apiCalls;
        }

        public GetRunResponseBodyDataOutcomeInterruptsData setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public GetRunResponseBodyDataOutcomeInterruptsData setApprovalUrl(String approvalUrl) {
            this.approvalUrl = approvalUrl;
            return this;
        }
        public String getApprovalUrl() {
            return this.approvalUrl;
        }

        public GetRunResponseBodyDataOutcomeInterruptsData setCancellable(Boolean cancellable) {
            this.cancellable = cancellable;
            return this;
        }
        public Boolean getCancellable() {
            return this.cancellable;
        }

        public GetRunResponseBodyDataOutcomeInterruptsData setChangeDigest(String changeDigest) {
            this.changeDigest = changeDigest;
            return this;
        }
        public String getChangeDigest() {
            return this.changeDigest;
        }

        public GetRunResponseBodyDataOutcomeInterruptsData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class GetRunResponseBodyDataOutcomeInterrupts extends TeaModel {
        /**
         * <p>The interrupt data.</p>
         */
        @NameInMap("data")
        public GetRunResponseBodyDataOutcomeInterruptsData data;

        /**
         * <p>The expiration time of the interrupt, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-02T00:00:00Z</p>
         */
        @NameInMap("expiresAt")
        public String expiresAt;

        /**
         * <p>The interrupt ID.</p>
         * 
         * <strong>example:</strong>
         * <p>interrupt_example_001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The interrupt prompt.</p>
         * 
         * <strong>example:</strong>
         * <p>Specify the region of the target resource</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The extended information.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The reason for the interrupt: <code>tool_call</code> (tool calling requires processing), <code>input_required</code> (user input is required), <code>confirmation</code> (confirmation is required), or <code>out_of_band_approval</code> (waiting for out-of-band approval).</p>
         * 
         * <strong>example:</strong>
         * <p>input_required</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <p>The JSON Schema that the payload must conform to when resuming the interrupt.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;region&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;region&quot;]}</p>
         */
        @NameInMap("responseSchema")
        public java.util.Map<String, ?> responseSchema;

        /**
         * <p>The ID used to invoke the tool calling.</p>
         * 
         * <strong>example:</strong>
         * <p>tool_call_example_001</p>
         */
        @NameInMap("toolCallId")
        public String toolCallId;

        public static GetRunResponseBodyDataOutcomeInterrupts build(java.util.Map<String, ?> map) throws Exception {
            GetRunResponseBodyDataOutcomeInterrupts self = new GetRunResponseBodyDataOutcomeInterrupts();
            return TeaModel.build(map, self);
        }

        public GetRunResponseBodyDataOutcomeInterrupts setData(GetRunResponseBodyDataOutcomeInterruptsData data) {
            this.data = data;
            return this;
        }
        public GetRunResponseBodyDataOutcomeInterruptsData getData() {
            return this.data;
        }

        public GetRunResponseBodyDataOutcomeInterrupts setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public GetRunResponseBodyDataOutcomeInterrupts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetRunResponseBodyDataOutcomeInterrupts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetRunResponseBodyDataOutcomeInterrupts setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public GetRunResponseBodyDataOutcomeInterrupts setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetRunResponseBodyDataOutcomeInterrupts setResponseSchema(java.util.Map<String, ?> responseSchema) {
            this.responseSchema = responseSchema;
            return this;
        }
        public java.util.Map<String, ?> getResponseSchema() {
            return this.responseSchema;
        }

        public GetRunResponseBodyDataOutcomeInterrupts setToolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }
        public String getToolCallId() {
            return this.toolCallId;
        }

    }

    public static class GetRunResponseBodyDataOutcome extends TeaModel {
        /**
         * <p>The list of interrupts.</p>
         */
        @NameInMap("interrupts")
        public java.util.List<GetRunResponseBodyDataOutcomeInterrupts> interrupts;

        /**
         * <p>The outcome type: <code>success</code> (completed successfully) or <code>interrupt</code> (waiting for interrupt processing).</p>
         * 
         * <strong>example:</strong>
         * <p>interrupt</p>
         */
        @NameInMap("type")
        public String type;

        public static GetRunResponseBodyDataOutcome build(java.util.Map<String, ?> map) throws Exception {
            GetRunResponseBodyDataOutcome self = new GetRunResponseBodyDataOutcome();
            return TeaModel.build(map, self);
        }

        public GetRunResponseBodyDataOutcome setInterrupts(java.util.List<GetRunResponseBodyDataOutcomeInterrupts> interrupts) {
            this.interrupts = interrupts;
            return this;
        }
        public java.util.List<GetRunResponseBodyDataOutcomeInterrupts> getInterrupts() {
            return this.interrupts;
        }

        public GetRunResponseBodyDataOutcome setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetRunResponseBodyData extends TeaModel {
        /**
         * <p>The time when the run was created, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:00:00Z</p>
         */
        @NameInMap("createdAt")
        public String createdAt;

        /**
         * <p>The run outcome.</p>
         */
        @NameInMap("outcome")
        public GetRunResponseBodyDataOutcome outcome;

        /**
         * <p>The run ID.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>The session ID.</p>
         * 
         * <strong>example:</strong>
         * <p>session_example_001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The run status: <code>PENDING</code> (pending execution), <code>RUNNING</code> (running), <code>WAITING_USER</code> (waiting for interrupt processing), <code>COMPLETED</code> (completed), <code>FAILED</code> (failed), <code>CANCELLED</code> (canceled), or <code>REJECTED</code> (rejected).</p>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The time when the run was last updated, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:01:00Z</p>
         */
        @NameInMap("updatedAt")
        public String updatedAt;

        public static GetRunResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRunResponseBodyData self = new GetRunResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRunResponseBodyData setCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public String getCreatedAt() {
            return this.createdAt;
        }

        public GetRunResponseBodyData setOutcome(GetRunResponseBodyDataOutcome outcome) {
            this.outcome = outcome;
            return this;
        }
        public GetRunResponseBodyDataOutcome getOutcome() {
            return this.outcome;
        }

        public GetRunResponseBodyData setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public GetRunResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public GetRunResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetRunResponseBodyData setUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public String getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
