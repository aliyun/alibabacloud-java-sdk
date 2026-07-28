// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ververica20220718.models;

import com.aliyun.tea.*;

public class ChatAiAgentResponseBody extends TeaModel {
    /**
     * <p>Indicates whether this text segment is complete (the last segment of the message it belongs to).</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("completed")
    public Boolean completed;

    /**
     * <p>The localized display name of the tool.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("displayName")
    public String displayName;

    /**
     * <p>The error message when the tool call fails (only when success is false).</p>
     * 
     * <strong>example:</strong>
     * <p>TIMEOUT</p>
     */
    @NameInMap("errorMessage")
    public String errorMessage;

    /**
     * <p>The error type when the tool call fails (only when success is false).</p>
     * 
     * <strong>example:</strong>
     * <p>TIMEOUT</p>
     */
    @NameInMap("errorType")
    public String errorType;

    /**
     * <p>The event type.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("event")
    public String event;

    /**
     * <p>The tool input key-value pairs. The structure varies depending on the toolName.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;namespace&quot;: &quot;vvp-dev-team&quot;, &quot;jobId&quot;: &quot;aa91ec66-...&quot;, &quot;deploymentId&quot;: &quot;b78aae4c-...&quot; }</p>
     */
    @NameInMap("input")
    public Object input;

    /**
     * <p>The list of items pending approval.</p>
     */
    @NameInMap("items")
    public java.util.List<ChatAiAgentResponseBodyItems> items;

    /**
     * <p>The error message (for error events).</p>
     * 
     * <strong>example:</strong>
     * <p>“”</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The session ID for this conversation.</p>
     * 
     * <strong>example:</strong>
     * <p>462E2707-590E-51B6-9940-0AB33044828B-deliverData-202603020950-WCSN4MEC8T</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>Indicates whether the tool calling invoke is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    /**
     * <p>The text output from the assistant.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("text")
    public String text;

    /**
     * <p>The tool calling ID, used to pair the invoke call and result.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;c1&quot;</p>
     */
    @NameInMap("toolCallId")
    public String toolCallId;

    /**
     * <p>The tool function name.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;get_job_events&quot;</p>
     */
    @NameInMap("toolName")
    public String toolName;

    /**
     * <p>The token usage.</p>
     */
    @NameInMap("usage")
    public ChatAiAgentResponseBodyUsage usage;

    public static ChatAiAgentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ChatAiAgentResponseBody self = new ChatAiAgentResponseBody();
        return TeaModel.build(map, self);
    }

    public ChatAiAgentResponseBody setCompleted(Boolean completed) {
        this.completed = completed;
        return this;
    }
    public Boolean getCompleted() {
        return this.completed;
    }

    public ChatAiAgentResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ChatAiAgentResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ChatAiAgentResponseBody setErrorType(String errorType) {
        this.errorType = errorType;
        return this;
    }
    public String getErrorType() {
        return this.errorType;
    }

    public ChatAiAgentResponseBody setEvent(String event) {
        this.event = event;
        return this;
    }
    public String getEvent() {
        return this.event;
    }

    public ChatAiAgentResponseBody setInput(Object input) {
        this.input = input;
        return this;
    }
    public Object getInput() {
        return this.input;
    }

    public ChatAiAgentResponseBody setItems(java.util.List<ChatAiAgentResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ChatAiAgentResponseBodyItems> getItems() {
        return this.items;
    }

    public ChatAiAgentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ChatAiAgentResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatAiAgentResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public ChatAiAgentResponseBody setText(String text) {
        this.text = text;
        return this;
    }
    public String getText() {
        return this.text;
    }

    public ChatAiAgentResponseBody setToolCallId(String toolCallId) {
        this.toolCallId = toolCallId;
        return this;
    }
    public String getToolCallId() {
        return this.toolCallId;
    }

    public ChatAiAgentResponseBody setToolName(String toolName) {
        this.toolName = toolName;
        return this;
    }
    public String getToolName() {
        return this.toolName;
    }

    public ChatAiAgentResponseBody setUsage(ChatAiAgentResponseBodyUsage usage) {
        this.usage = usage;
        return this;
    }
    public ChatAiAgentResponseBodyUsage getUsage() {
        return this.usage;
    }

    public static class ChatAiAgentResponseBodyItems extends TeaModel {
        /**
         * <p>The original tool parameter key-value pairs.</p>
         * 
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("args")
        public Object args;

        /**
         * <p>The display name of the tool.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("displayName")
        public String displayName;

        /**
         * <p>The approval item ID, used when returning hitlDecisions.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("hitlId")
        public String hitlId;

        /**
         * <p>The name of the intercepted tool.</p>
         * 
         * <strong>example:</strong>
         * <p>“”</p>
         */
        @NameInMap("toolName")
        public String toolName;

        public static ChatAiAgentResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            ChatAiAgentResponseBodyItems self = new ChatAiAgentResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public ChatAiAgentResponseBodyItems setArgs(Object args) {
            this.args = args;
            return this;
        }
        public Object getArgs() {
            return this.args;
        }

        public ChatAiAgentResponseBodyItems setDisplayName(String displayName) {
            this.displayName = displayName;
            return this;
        }
        public String getDisplayName() {
            return this.displayName;
        }

        public ChatAiAgentResponseBodyItems setHitlId(String hitlId) {
            this.hitlId = hitlId;
            return this;
        }
        public String getHitlId() {
            return this.hitlId;
        }

        public ChatAiAgentResponseBodyItems setToolName(String toolName) {
            this.toolName = toolName;
            return this;
        }
        public String getToolName() {
            return this.toolName;
        }

    }

    public static class ChatAiAgentResponseBodyUsage extends TeaModel {
        /**
         * <p>The number of input tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("inputTokens")
        public Long inputTokens;

        /**
         * <p>The number of output tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("outputTokens")
        public Long outputTokens;

        /**
         * <p>The total number of tokens.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("totalTokens")
        public Long totalTokens;

        public static ChatAiAgentResponseBodyUsage build(java.util.Map<String, ?> map) throws Exception {
            ChatAiAgentResponseBodyUsage self = new ChatAiAgentResponseBodyUsage();
            return TeaModel.build(map, self);
        }

        public ChatAiAgentResponseBodyUsage setInputTokens(Long inputTokens) {
            this.inputTokens = inputTokens;
            return this;
        }
        public Long getInputTokens() {
            return this.inputTokens;
        }

        public ChatAiAgentResponseBodyUsage setOutputTokens(Long outputTokens) {
            this.outputTokens = outputTokens;
            return this;
        }
        public Long getOutputTokens() {
            return this.outputTokens;
        }

        public ChatAiAgentResponseBodyUsage setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

}
