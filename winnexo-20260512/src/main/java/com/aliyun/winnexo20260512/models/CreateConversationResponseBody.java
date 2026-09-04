// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CreateConversationResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The session ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3a59769c-e631-4b48-84f3-c9bf3a8ae940</p>
     */
    @NameInMap("conversationId")
    public String conversationId;

    /**
     * <p>The time when the share was created.</p>
     * 
     * <strong>example:</strong>
     * <p>1784513941206</p>
     */
    @NameInMap("createdAt")
    public String createdAt;

    /**
     * <p>The description of the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>The current zone list is illegal.</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>A reserved field for extension purposes.</p>
     */
    @NameInMap("metadata")
    public java.util.Map<String, ?> metadata;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A5241B90-8FF4-565C-977A-0CE1842AED72</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The appointment title.</p>
     * 
     * <strong>example:</strong>
     * <p>Incident RCA: alert-0885feb7-3d4b-4da5-90f0-0119dfbbf555:up0shc25tp0kueo0afeobvhk81</p>
     */
    @NameInMap("title")
    public String title;

    public static CreateConversationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateConversationResponseBody self = new CreateConversationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateConversationResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateConversationResponseBody setConversationId(String conversationId) {
        this.conversationId = conversationId;
        return this;
    }
    public String getConversationId() {
        return this.conversationId;
    }

    public CreateConversationResponseBody setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }
    public String getCreatedAt() {
        return this.createdAt;
    }

    public CreateConversationResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateConversationResponseBody setMetadata(java.util.Map<String, ?> metadata) {
        this.metadata = metadata;
        return this;
    }
    public java.util.Map<String, ?> getMetadata() {
        return this.metadata;
    }

    public CreateConversationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateConversationResponseBody setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

}
