// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateChatSessionResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success. A non-200 value indicates a backend error code (ERR.* / InvalidParameter.*).</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error description. This is empty when the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request trace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The session ID.</p>
     */
    @NameInMap("session")
    public UpdateChatSessionResponseBodySession session;

    public static UpdateChatSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatSessionResponseBody self = new UpdateChatSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateChatSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateChatSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateChatSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateChatSessionResponseBody setSession(UpdateChatSessionResponseBodySession session) {
        this.session = session;
        return this;
    }
    public UpdateChatSessionResponseBodySession getSession() {
        return this.session;
    }

    public static class UpdateChatSessionResponseBodySession extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleId</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>Indicates whether the creation time exceeds 30 days.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isExpired")
        public Boolean isExpired;

        /**
         * <p>The associated object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>The abstract model name used by the session (quick/standard/flagship).</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("object")
        public String object;

        /**
         * <p>The associated object ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2676</p>
         */
        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>The operating object name.</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("operatingObjectName")
        public java.util.List<String> operatingObjectName;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample title</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("updatedAt")
        public Long updatedAt;

        public static UpdateChatSessionResponseBodySession build(java.util.Map<String, ?> map) throws Exception {
            UpdateChatSessionResponseBodySession self = new UpdateChatSessionResponseBodySession();
            return TeaModel.build(map, self);
        }

        public UpdateChatSessionResponseBodySession setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public UpdateChatSessionResponseBodySession setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public UpdateChatSessionResponseBodySession setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public UpdateChatSessionResponseBodySession setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public UpdateChatSessionResponseBodySession setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public UpdateChatSessionResponseBodySession setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public UpdateChatSessionResponseBodySession setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public UpdateChatSessionResponseBodySession setOperatingObjectName(java.util.List<String> operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }
        public java.util.List<String> getOperatingObjectName() {
            return this.operatingObjectName;
        }

        public UpdateChatSessionResponseBodySession setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public UpdateChatSessionResponseBodySession setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
