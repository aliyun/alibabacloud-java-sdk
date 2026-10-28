// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openagent20260801.models;

import com.aliyun.tea.*;

public class ListMessagesResponseBody extends TeaModel {
    /**
     * <p>The message history and pagination information.</p>
     */
    @NameInMap("data")
    public ListMessagesResponseBodyData data;

    /**
     * <p>The request ID, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>00000000-0000-4000-8000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. A value of true indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static ListMessagesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMessagesResponseBody self = new ListMessagesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMessagesResponseBody setData(ListMessagesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMessagesResponseBodyData getData() {
        return this.data;
    }

    public ListMessagesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMessagesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsDataApiCalls extends TeaModel {
        /**
         * <p>The name of the API action.</p>
         * 
         * <strong>example:</strong>
         * <p>ExampleAction</p>
         */
        @NameInMap("action")
        public String action;

        /**
         * <p>The description of the operation pending approval.</p>
         * 
         * <strong>example:</strong>
         * <p>Execute changes on the sample resource</p>
         */
        @NameInMap("description")
        public String description;

        public static ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsDataApiCalls build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsDataApiCalls self = new ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsDataApiCalls();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsDataApiCalls setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsDataApiCalls setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

    }

    public static class ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData extends TeaModel {
        /**
         * <p>The list of API operations that require approval.</p>
         */
        @NameInMap("apiCalls")
        public java.util.List<ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsDataApiCalls> apiCalls;

        /**
         * <p>The associated approval ID.</p>
         * 
         * <strong>example:</strong>
         * <p>approval_example_001</p>
         */
        @NameInMap("approvalId")
        public String approvalId;

        /**
         * <p>The URL of the approval page. The example URL cannot be used for actual approval.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/approvals/approval_example_001">https://example.com/approvals/approval_example_001</a></p>
         */
        @NameInMap("approvalUrl")
        public String approvalUrl;

        /**
         * <p>Specifies whether the approval can be canceled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("cancellable")
        public Boolean cancellable;

        /**
         * <p>The digest identifier of the change pending approval.</p>
         * 
         * <strong>example:</strong>
         * <p>example-change-digest</p>
         */
        @NameInMap("changeDigest")
        public String changeDigest;

        /**
         * <p>The title of the approval item.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample change approval</p>
         */
        @NameInMap("title")
        public String title;

        public static ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData self = new ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData setApiCalls(java.util.List<ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsDataApiCalls> apiCalls) {
            this.apiCalls = apiCalls;
            return this;
        }
        public java.util.List<ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsDataApiCalls> getApiCalls() {
            return this.apiCalls;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData setApprovalId(String approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public String getApprovalId() {
            return this.approvalId;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData setApprovalUrl(String approvalUrl) {
            this.approvalUrl = approvalUrl;
            return this;
        }
        public String getApprovalUrl() {
            return this.approvalUrl;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData setCancellable(Boolean cancellable) {
            this.cancellable = cancellable;
            return this;
        }
        public Boolean getCancellable() {
            return this.cancellable;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData setChangeDigest(String changeDigest) {
            this.changeDigest = changeDigest;
            return this;
        }
        public String getChangeDigest() {
            return this.changeDigest;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts extends TeaModel {
        /**
         * <p>The supplementary business data for the interrupt.</p>
         */
        @NameInMap("data")
        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData data;

        /**
         * <p>The expiration time of the interrupt, in RFC 3339 format.</p>
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
         * <p>The interrupt prompt displayed to the user.</p>
         * 
         * <strong>example:</strong>
         * <p>Specify the target region</p>
         */
        @NameInMap("message")
        public String message;

        /**
         * <p>The extended metadata of the interrupt.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The reason for the interrupt. Valid values: <code>tool_call</code> (tool invocation requires processing), <code>input_required</code> (user input is required), <code>confirmation</code> (confirmation is required), and <code>out_of_band_approval</code> (waiting for out-of-band approval).</p>
         * 
         * <strong>example:</strong>
         * <p>input_required</p>
         */
        @NameInMap("reason")
        public String reason;

        /**
         * <p>The JSON schema that the resume result payload must follow.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;region&quot;:{&quot;type&quot;:&quot;string&quot;}},&quot;required&quot;:[&quot;region&quot;]}</p>
         */
        @NameInMap("responseSchema")
        public java.util.Map<String, ?> responseSchema;

        /**
         * <p>The ID of the tool invocation associated with the interrupt.</p>
         * 
         * <strong>example:</strong>
         * <p>tool_call_example_001</p>
         */
        @NameInMap("toolCallId")
        public String toolCallId;

        public static ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts self = new ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts setData(ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData data) {
            this.data = data;
            return this;
        }
        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterruptsData getData() {
            return this.data;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts setExpiresAt(String expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }
        public String getExpiresAt() {
            return this.expiresAt;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts setResponseSchema(java.util.Map<String, ?> responseSchema) {
            this.responseSchema = responseSchema;
            return this;
        }
        public java.util.Map<String, ?> getResponseSchema() {
            return this.responseSchema;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts setToolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }
        public String getToolCallId() {
            return this.toolCallId;
        }

    }

    public static class ListMessagesResponseBodyDataTimelineMessageInterruptOutcome extends TeaModel {
        /**
         * <p>The list of historical interrupts.</p>
         */
        @NameInMap("interrupts")
        public java.util.List<ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts> interrupts;

        /**
         * <p>The type of the interrupt result. The value is fixed to <code>interrupt</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>interrupt</p>
         */
        @NameInMap("type")
        public String type;

        public static ListMessagesResponseBodyDataTimelineMessageInterruptOutcome build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataTimelineMessageInterruptOutcome self = new ListMessagesResponseBodyDataTimelineMessageInterruptOutcome();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcome setInterrupts(java.util.List<ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts> interrupts) {
            this.interrupts = interrupts;
            return this;
        }
        public java.util.List<ListMessagesResponseBodyDataTimelineMessageInterruptOutcomeInterrupts> getInterrupts() {
            return this.interrupts;
        }

        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcome setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMessagesResponseBodyDataTimelineMessageResumeInputResume extends TeaModel {
        /**
         * <p>The ID of the processed interrupt.</p>
         * 
         * <strong>example:</strong>
         * <p>interrupt_example_001</p>
         */
        @NameInMap("interruptId")
        public String interruptId;

        /**
         * <p>The processing result for the corresponding interrupt, which must comply with the responseSchema of the interrupt.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;region&quot;:&quot;cn-hangzhou&quot;}</p>
         */
        @NameInMap("payload")
        public Object payload;

        /**
         * <p>The response method for the current interrupt. Valid values: <code>resolved</code> (the answer, confirmation, or tool result required by the interrupt has been submitted, including the <code>payload</code>) and <code>cancelled</code> (the interrupt has been canceled, excluding the <code>payload</code>).</p>
         * 
         * <strong>example:</strong>
         * <p>resolved</p>
         */
        @NameInMap("status")
        public String status;

        public static ListMessagesResponseBodyDataTimelineMessageResumeInputResume build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataTimelineMessageResumeInputResume self = new ListMessagesResponseBodyDataTimelineMessageResumeInputResume();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataTimelineMessageResumeInputResume setInterruptId(String interruptId) {
            this.interruptId = interruptId;
            return this;
        }
        public String getInterruptId() {
            return this.interruptId;
        }

        public ListMessagesResponseBodyDataTimelineMessageResumeInputResume setPayload(Object payload) {
            this.payload = payload;
            return this;
        }
        public Object getPayload() {
            return this.payload;
        }

        public ListMessagesResponseBodyDataTimelineMessageResumeInputResume setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class ListMessagesResponseBodyDataTimelineMessageResumeInput extends TeaModel {
        /**
         * <p>The time when the interrupt processing was completed, in RFC 3339 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-01T00:01:00Z</p>
         */
        @NameInMap("resolvedAt")
        public String resolvedAt;

        /**
         * <p>The submitted processing results for each interrupt.</p>
         */
        @NameInMap("resume")
        public java.util.List<ListMessagesResponseBodyDataTimelineMessageResumeInputResume> resume;

        /**
         * <p>The ID of the original run that was resumed.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        @NameInMap("runId")
        public String runId;

        /**
         * <p>The source of the resume request. Valid values: <code>USER</code> (submitted by a user) and <code>INTERNAL</code> (submitted by an internal process).</p>
         * 
         * <strong>example:</strong>
         * <p>USER</p>
         */
        @NameInMap("source")
        public String source;

        public static ListMessagesResponseBodyDataTimelineMessageResumeInput build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataTimelineMessageResumeInput self = new ListMessagesResponseBodyDataTimelineMessageResumeInput();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataTimelineMessageResumeInput setResolvedAt(String resolvedAt) {
            this.resolvedAt = resolvedAt;
            return this;
        }
        public String getResolvedAt() {
            return this.resolvedAt;
        }

        public ListMessagesResponseBodyDataTimelineMessageResumeInput setResume(java.util.List<ListMessagesResponseBodyDataTimelineMessageResumeInputResume> resume) {
            this.resume = resume;
            return this;
        }
        public java.util.List<ListMessagesResponseBodyDataTimelineMessageResumeInputResume> getResume() {
            return this.resume;
        }

        public ListMessagesResponseBodyDataTimelineMessageResumeInput setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

        public ListMessagesResponseBodyDataTimelineMessageResumeInput setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class ListMessagesResponseBodyDataTimelineMessageToolCallsFunction extends TeaModel {
        /**
         * <p>The tool parameters in the form of a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;keyword&quot;:&quot;example&quot;}</p>
         */
        @NameInMap("arguments")
        public String arguments;

        /**
         * <p>The name of the function or tool.</p>
         * 
         * <strong>example:</strong>
         * <p>lookup_example</p>
         */
        @NameInMap("name")
        public String name;

        public static ListMessagesResponseBodyDataTimelineMessageToolCallsFunction build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataTimelineMessageToolCallsFunction self = new ListMessagesResponseBodyDataTimelineMessageToolCallsFunction();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataTimelineMessageToolCallsFunction setArguments(String arguments) {
            this.arguments = arguments;
            return this;
        }
        public String getArguments() {
            return this.arguments;
        }

        public ListMessagesResponseBodyDataTimelineMessageToolCallsFunction setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ListMessagesResponseBodyDataTimelineMessageToolCalls extends TeaModel {
        /**
         * <p>The encrypted content of the tool invocation. The example is only a placeholder value.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE_ENCRYPTED_VALUE</p>
         */
        @NameInMap("encryptedValue")
        public String encryptedValue;

        /**
         * <p>The information about the function to be executed.</p>
         */
        @NameInMap("function")
        public ListMessagesResponseBodyDataTimelineMessageToolCallsFunction function;

        /**
         * <p>The tool invocation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>tool_call_example_001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The extended metadata of the tool invocation.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The type of the tool invocation. The value is fixed to <code>function</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>function</p>
         */
        @NameInMap("type")
        public String type;

        public static ListMessagesResponseBodyDataTimelineMessageToolCalls build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataTimelineMessageToolCalls self = new ListMessagesResponseBodyDataTimelineMessageToolCalls();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataTimelineMessageToolCalls setEncryptedValue(String encryptedValue) {
            this.encryptedValue = encryptedValue;
            return this;
        }
        public String getEncryptedValue() {
            return this.encryptedValue;
        }

        public ListMessagesResponseBodyDataTimelineMessageToolCalls setFunction(ListMessagesResponseBodyDataTimelineMessageToolCallsFunction function) {
            this.function = function;
            return this;
        }
        public ListMessagesResponseBodyDataTimelineMessageToolCallsFunction getFunction() {
            return this.function;
        }

        public ListMessagesResponseBodyDataTimelineMessageToolCalls setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMessagesResponseBodyDataTimelineMessageToolCalls setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListMessagesResponseBodyDataTimelineMessageToolCalls setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMessagesResponseBodyDataTimelineMessage extends TeaModel {
        /**
         * <p>The type identifier of the activity message.</p>
         * 
         * <strong>example:</strong>
         * <p>example_activity</p>
         */
        @NameInMap("activityType")
        public String activityType;

        /**
         * <p>The message content. The structure is determined by the message type.</p>
         * 
         * <strong>example:</strong>
         * <p>Query the status of the sample resource</p>
         */
        @NameInMap("content")
        public Object content;

        /**
         * <p>The encrypted content. The example is an invalid placeholder value and does not contain real ciphertext.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE_ENCRYPTED_VALUE</p>
         */
        @NameInMap("encryptedValue")
        public String encryptedValue;

        /**
         * <p>The error description when tool execution fails.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample tool execution failure</p>
         */
        @NameInMap("error")
        public String error;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>message_example_001</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The result information of historical interrupts.</p>
         */
        @NameInMap("interruptOutcome")
        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcome interruptOutcome;

        /**
         * <p>The extended metadata of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The name of the message sender.</p>
         * 
         * <strong>example:</strong>
         * <p>example-user</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The resume input corresponding to the historical interrupt.</p>
         */
        @NameInMap("resumeInput")
        public ListMessagesResponseBodyDataTimelineMessageResumeInput resumeInput;

        /**
         * <p>The role of the message. Valid values: <code>user</code> (user message), <code>assistant</code> (assistant message), <code>tool</code> (tool result), <code>activity</code> (activity message), <code>reasoning</code> (reasoning message), and <code>interrupt</code> (interrupt record).</p>
         * 
         * <strong>example:</strong>
         * <p>user</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>The ID of the tool invocation associated with the tool result.</p>
         * 
         * <strong>example:</strong>
         * <p>tool_call_example_001</p>
         */
        @NameInMap("toolCallId")
        public String toolCallId;

        /**
         * <p>The list of tool invocations initiated by the agent.</p>
         */
        @NameInMap("toolCalls")
        public java.util.List<ListMessagesResponseBodyDataTimelineMessageToolCalls> toolCalls;

        public static ListMessagesResponseBodyDataTimelineMessage build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataTimelineMessage self = new ListMessagesResponseBodyDataTimelineMessage();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataTimelineMessage setActivityType(String activityType) {
            this.activityType = activityType;
            return this;
        }
        public String getActivityType() {
            return this.activityType;
        }

        public ListMessagesResponseBodyDataTimelineMessage setContent(Object content) {
            this.content = content;
            return this;
        }
        public Object getContent() {
            return this.content;
        }

        public ListMessagesResponseBodyDataTimelineMessage setEncryptedValue(String encryptedValue) {
            this.encryptedValue = encryptedValue;
            return this;
        }
        public String getEncryptedValue() {
            return this.encryptedValue;
        }

        public ListMessagesResponseBodyDataTimelineMessage setError(String error) {
            this.error = error;
            return this;
        }
        public String getError() {
            return this.error;
        }

        public ListMessagesResponseBodyDataTimelineMessage setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListMessagesResponseBodyDataTimelineMessage setInterruptOutcome(ListMessagesResponseBodyDataTimelineMessageInterruptOutcome interruptOutcome) {
            this.interruptOutcome = interruptOutcome;
            return this;
        }
        public ListMessagesResponseBodyDataTimelineMessageInterruptOutcome getInterruptOutcome() {
            return this.interruptOutcome;
        }

        public ListMessagesResponseBodyDataTimelineMessage setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public ListMessagesResponseBodyDataTimelineMessage setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMessagesResponseBodyDataTimelineMessage setResumeInput(ListMessagesResponseBodyDataTimelineMessageResumeInput resumeInput) {
            this.resumeInput = resumeInput;
            return this;
        }
        public ListMessagesResponseBodyDataTimelineMessageResumeInput getResumeInput() {
            return this.resumeInput;
        }

        public ListMessagesResponseBodyDataTimelineMessage setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ListMessagesResponseBodyDataTimelineMessage setToolCallId(String toolCallId) {
            this.toolCallId = toolCallId;
            return this;
        }
        public String getToolCallId() {
            return this.toolCallId;
        }

        public ListMessagesResponseBodyDataTimelineMessage setToolCalls(java.util.List<ListMessagesResponseBodyDataTimelineMessageToolCalls> toolCalls) {
            this.toolCalls = toolCalls;
            return this;
        }
        public java.util.List<ListMessagesResponseBodyDataTimelineMessageToolCalls> getToolCalls() {
            return this.toolCalls;
        }

    }

    public static class ListMessagesResponseBodyDataTimeline extends TeaModel {
        /**
         * <p>The message object. Different message types are distinguished by role, and each type uses the corresponding fields.</p>
         */
        @NameInMap("message")
        public ListMessagesResponseBodyDataTimelineMessage message;

        /**
         * <p>The ID of the run to which the message belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>run_example_001</p>
         */
        @NameInMap("runId")
        public String runId;

        public static ListMessagesResponseBodyDataTimeline build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyDataTimeline self = new ListMessagesResponseBodyDataTimeline();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyDataTimeline setMessage(ListMessagesResponseBodyDataTimelineMessage message) {
            this.message = message;
            return this;
        }
        public ListMessagesResponseBodyDataTimelineMessage getMessage() {
            return this.message;
        }

        public ListMessagesResponseBodyDataTimeline setRunId(String runId) {
            this.runId = runId;
            return this;
        }
        public String getRunId() {
            return this.runId;
        }

    }

    public static class ListMessagesResponseBodyData extends TeaModel {
        /**
         * <p>The pagination token for the next page. A value of null indicates that no more data is available.</p>
         * 
         * <strong>example:</strong>
         * <p>example-next-token</p>
         */
        @NameInMap("nextToken")
        public String nextToken;

        /**
         * <p>The ID of the session to which the messages belong.</p>
         * 
         * <strong>example:</strong>
         * <p>session_example_001</p>
         */
        @NameInMap("sessionId")
        public String sessionId;

        /**
         * <p>The message records returned in a timeline.</p>
         */
        @NameInMap("timeline")
        public java.util.List<ListMessagesResponseBodyDataTimeline> timeline;

        /**
         * <p>The number of timeline records on the current page, which is equal to the length of the timeline array.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListMessagesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMessagesResponseBodyData self = new ListMessagesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMessagesResponseBodyData setNextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }
        public String getNextToken() {
            return this.nextToken;
        }

        public ListMessagesResponseBodyData setSessionId(String sessionId) {
            this.sessionId = sessionId;
            return this;
        }
        public String getSessionId() {
            return this.sessionId;
        }

        public ListMessagesResponseBodyData setTimeline(java.util.List<ListMessagesResponseBodyDataTimeline> timeline) {
            this.timeline = timeline;
            return this;
        }
        public java.util.List<ListMessagesResponseBodyDataTimeline> getTimeline() {
            return this.timeline;
        }

        public ListMessagesResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
