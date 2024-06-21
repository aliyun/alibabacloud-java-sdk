// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchplat20240529.models;

import com.aliyun.tea.*;

public class GetTextGenerationRequest extends TeaModel {
    @NameInMap("csi_level")
    public String csiLevel;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("messages")
    public java.util.List<GetTextGenerationRequestMessages> messages;

    @NameInMap("parameters")
    public java.util.Map<String, String> parameters;

    @NameInMap("stream")
    public Boolean stream;

    public static GetTextGenerationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTextGenerationRequest self = new GetTextGenerationRequest();
        return TeaModel.build(map, self);
    }

    public GetTextGenerationRequest setCsiLevel(String csiLevel) {
        this.csiLevel = csiLevel;
        return this;
    }
    public String getCsiLevel() {
        return this.csiLevel;
    }

    public GetTextGenerationRequest setMessages(java.util.List<GetTextGenerationRequestMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<GetTextGenerationRequestMessages> getMessages() {
        return this.messages;
    }

    public GetTextGenerationRequest setParameters(java.util.Map<String, String> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, String> getParameters() {
        return this.parameters;
    }

    public GetTextGenerationRequest setStream(Boolean stream) {
        this.stream = stream;
        return this;
    }
    public Boolean getStream() {
        return this.stream;
    }

    public static class GetTextGenerationRequestMessages extends TeaModel {
        @NameInMap("content")
        public String content;

        @NameInMap("role")
        public String role;

        public static GetTextGenerationRequestMessages build(java.util.Map<String, ?> map) throws Exception {
            GetTextGenerationRequestMessages self = new GetTextGenerationRequestMessages();
            return TeaModel.build(map, self);
        }

        public GetTextGenerationRequestMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTextGenerationRequestMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

    }

}
