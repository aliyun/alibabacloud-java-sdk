// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class DeleteChatSessionResponseBody extends TeaModel {
    /**
     * <p>业务状态码：成功为 200，失败为后端错误码（ERR.* / InvalidParameter.*）</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>是否删除成功</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("deleted")
    public Boolean deleted;

    /**
     * <p>是否硬删除</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hardDelete")
    public Boolean hardDelete;

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

    /**
     * <p>会话 ID</p>
     * 
     * <strong>example:</strong>
     * <p>exampleSessionId</p>
     */
    @NameInMap("sessionId")
    public String sessionId;

    public static DeleteChatSessionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatSessionResponseBody self = new DeleteChatSessionResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteChatSessionResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteChatSessionResponseBody setDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }
    public Boolean getDeleted() {
        return this.deleted;
    }

    public DeleteChatSessionResponseBody setHardDelete(Boolean hardDelete) {
        this.hardDelete = hardDelete;
        return this;
    }
    public Boolean getHardDelete() {
        return this.hardDelete;
    }

    public DeleteChatSessionResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteChatSessionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteChatSessionResponseBody setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

}
