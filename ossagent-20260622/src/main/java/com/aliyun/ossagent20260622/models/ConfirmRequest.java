// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260622.models;

import com.aliyun.tea.*;

public class ConfirmRequest extends TeaModel {
    /**
     * <p>Specifies whether to approve the tool execution.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("confirmed")
    public Boolean confirmed;

    /**
     * <p>The current execution phase.</p>
     * 
     * <strong>example:</strong>
     * <p>PARAM_INPUT</p>
     */
    @NameInMap("phase")
    public String phase;

    /**
     * <p>The reason for whether to call the tool.</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("reason")
    public String reason;

    /**
     * <p>The Q&amp;A session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>UUID</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    /**
     * <p>The tool invocations.</p>
     */
    @NameInMap("toolCalls")
    public java.util.List<ConfirmRequestToolCalls> toolCalls;

    public static ConfirmRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfirmRequest self = new ConfirmRequest();
        return TeaModel.build(map, self);
    }

    public ConfirmRequest setConfirmed(Boolean confirmed) {
        this.confirmed = confirmed;
        return this;
    }
    public Boolean getConfirmed() {
        return this.confirmed;
    }

    public ConfirmRequest setPhase(String phase) {
        this.phase = phase;
        return this;
    }
    public String getPhase() {
        return this.phase;
    }

    public ConfirmRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public ConfirmRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ConfirmRequest setToolCalls(java.util.List<ConfirmRequestToolCalls> toolCalls) {
        this.toolCalls = toolCalls;
        return this;
    }
    public java.util.List<ConfirmRequestToolCalls> getToolCalls() {
        return this.toolCalls;
    }

    public static class ConfirmRequestToolCalls extends TeaModel {
        /**
         * <p>The tool ID, returned by the Chat operation.</p>
         * 
         * <strong>example:</strong>
         * <p>call_662cc029b3444d8d923a7ea6</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>The command to execute for the tool calling operation, returned by the Chat operation.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;command&quot;: &quot;api put-bucket-acl --bucket xxx --acl private&quot;,
         *     &quot;region&quot;: &quot;cn-hangzhou&quot;
         * }</p>
         */
        @NameInMap("modifiedInput")
        public java.util.Map<String, ?> modifiedInput;

        /**
         * <p>The consumer name.</p>
         * 
         * <strong>example:</strong>
         * <p>ossutil_safe</p>
         */
        @NameInMap("name")
        public String name;

        public static ConfirmRequestToolCalls build(java.util.Map<String, ?> map) throws Exception {
            ConfirmRequestToolCalls self = new ConfirmRequestToolCalls();
            return TeaModel.build(map, self);
        }

        public ConfirmRequestToolCalls setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ConfirmRequestToolCalls setModifiedInput(java.util.Map<String, ?> modifiedInput) {
            this.modifiedInput = modifiedInput;
            return this;
        }
        public java.util.Map<String, ?> getModifiedInput() {
            return this.modifiedInput;
        }

        public ConfirmRequestToolCalls setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
