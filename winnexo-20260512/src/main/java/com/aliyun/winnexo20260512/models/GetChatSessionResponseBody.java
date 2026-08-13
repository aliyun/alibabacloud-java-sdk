// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetChatSessionResponseBody extends TeaModel {
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

    @NameInMap("messages")
    public java.util.List<GetChatSessionResponseBodyMessages> messages;

    /**
     * <p>请求追踪 ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("session")
    public GetChatSessionResponseBodySession session;

    public static GetChatSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetChatSessionResponseBody self = new GetChatSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetChatSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetChatSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetChatSessionResponseBody setMessages(java.util.List<GetChatSessionResponseBodyMessages> messages) {
        this.messages = messages;
        return this;
    }
    public java.util.List<GetChatSessionResponseBodyMessages> getMessages() {
        return this.messages;
    }

    public GetChatSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetChatSessionResponseBody setSession(GetChatSessionResponseBodySession session) {
        this.session = session;
        return this;
    }
    public GetChatSessionResponseBodySession getSession() {
        return this.session;
    }

    public static class GetChatSessionResponseBodyMessages extends TeaModel {
        /**
         * <p>消息内容</p>
         * 
         * <strong>example:</strong>
         * <p>示例内容</p>
         */
        @NameInMap("content")
        public String content;

        /**
         * <p>该消息之后 LLM 上下文是否已清空</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("contextCleared")
        public Boolean contextCleared;

        /**
         * <p>是否来自分享续聊复制的消息</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("fromShare")
        public Boolean fromShare;

        /**
         * <p>消息ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleId</p>
         */
        @NameInMap("id")
        public String id;

        /**
         * <p>更新时间</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("metadata")
        public java.util.Map<String, ?> metadata;

        /**
         * <p>类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("object")
        public String object;

        /**
         * <p>角色</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("role")
        public String role;

        /**
         * <p>分享来源用户名称</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("shareUserName")
        public String shareUserName;

        /**
         * <p>消息状态</p>
         * 
         * <strong>example:</strong>
         * <p>READY</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>追踪ID</p>
         * 
         * <strong>example:</strong>
         * <p>exampleTraceId</p>
         */
        @NameInMap("traceId")
        public String traceId;

        @NameInMap("updateAt")
        public Long updateAt;

        /**
         * <p>用户反馈类型</p>
         * 
         * <strong>example:</strong>
         * <p>string_value</p>
         */
        @NameInMap("userFeedback")
        public String userFeedback;

        public static GetChatSessionResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            GetChatSessionResponseBodyMessages self = new GetChatSessionResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public GetChatSessionResponseBodyMessages setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetChatSessionResponseBodyMessages setContextCleared(Boolean contextCleared) {
            this.contextCleared = contextCleared;
            return this;
        }
        public Boolean getContextCleared() {
            return this.contextCleared;
        }

        public GetChatSessionResponseBodyMessages setFromShare(Boolean fromShare) {
            this.fromShare = fromShare;
            return this;
        }
        public Boolean getFromShare() {
            return this.fromShare;
        }

        public GetChatSessionResponseBodyMessages setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetChatSessionResponseBodyMessages setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public GetChatSessionResponseBodyMessages setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public GetChatSessionResponseBodyMessages setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public GetChatSessionResponseBodyMessages setShareUserName(String shareUserName) {
            this.shareUserName = shareUserName;
            return this;
        }
        public String getShareUserName() {
            return this.shareUserName;
        }

        public GetChatSessionResponseBodyMessages setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetChatSessionResponseBodyMessages setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

        public GetChatSessionResponseBodyMessages setUpdateAt(Long updateAt) {
            this.updateAt = updateAt;
            return this;
        }
        public Long getUpdateAt() {
            return this.updateAt;
        }

        public GetChatSessionResponseBodyMessages setUserFeedback(String userFeedback) {
            this.userFeedback = userFeedback;
            return this;
        }
        public String getUserFeedback() {
            return this.userFeedback;
        }

    }

    public static class GetChatSessionResponseBodySession extends TeaModel {
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

        public static GetChatSessionResponseBodySession build(java.util.Map<String, ?> map) throws Exception {
            GetChatSessionResponseBodySession self = new GetChatSessionResponseBodySession();
            return TeaModel.build(map, self);
        }

        public GetChatSessionResponseBodySession setCreatedAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }
        public Long getCreatedAt() {
            return this.createdAt;
        }

        public GetChatSessionResponseBodySession setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetChatSessionResponseBodySession setIsExpired(Boolean isExpired) {
            this.isExpired = isExpired;
            return this;
        }
        public Boolean getIsExpired() {
            return this.isExpired;
        }

        public GetChatSessionResponseBodySession setMetadata(java.util.Map<String, ?> metadata) {
            this.metadata = metadata;
            return this;
        }
        public java.util.Map<String, ?> getMetadata() {
            return this.metadata;
        }

        public GetChatSessionResponseBodySession setModel(String model) {
            this.model = model;
            return this;
        }
        public String getModel() {
            return this.model;
        }

        public GetChatSessionResponseBodySession setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public GetChatSessionResponseBodySession setObjectId(String objectId) {
            this.objectId = objectId;
            return this;
        }
        public String getObjectId() {
            return this.objectId;
        }

        public GetChatSessionResponseBodySession setOperatingObjectName(java.util.List<String> operatingObjectName) {
            this.operatingObjectName = operatingObjectName;
            return this;
        }
        public java.util.List<String> getOperatingObjectName() {
            return this.operatingObjectName;
        }

        public GetChatSessionResponseBodySession setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetChatSessionResponseBodySession setUpdatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Long getUpdatedAt() {
            return this.updatedAt;
        }

    }

}
