// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ossagent20260622.models;

import com.aliyun.tea.*;

public class ConfirmRequest extends TeaModel {
    @NameInMap("confirmed")
    public Boolean confirmed;

    @NameInMap("phase")
    public String phase;

    @NameInMap("reason")
    public String reason;

    @NameInMap("sessionId")
    public String sessionId;

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
        @NameInMap("id")
        public String id;

        @NameInMap("modifiedInput")
        public java.util.Map<String, ?> modifiedInput;

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
