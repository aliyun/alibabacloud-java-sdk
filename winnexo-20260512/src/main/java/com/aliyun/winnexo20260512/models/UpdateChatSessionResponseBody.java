// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class UpdateChatSessionResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述，成功时为空</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

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
         * <p>创建时间</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("createdAt")
        public Long createdAt;

        /**
         * <p>消息ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleId</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>创建时间是否超过30天</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("isExpired")
        public Boolean isExpired;

        /**
         * <p>关联对象ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleObjectId</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>会话使用的抽象模型名（quick/standard/flagship）</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("model")
        public String model;

        /**
         * <p>类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("object")
        public String object;

        @NameInMap("objectId")
        public String objectId;

        /**
         * <p>operatingObjectName</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("operatingObjectName")
        public java.util.List<String> operatingObjectName;

        /**
         * <p>标题</p>
         * 
         * <strong>example:</strong>
         * <p>示例标题</p>
         */
        @NameInMap("title")
        public String title;

        /**
         * <p>更新时间</p>
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
