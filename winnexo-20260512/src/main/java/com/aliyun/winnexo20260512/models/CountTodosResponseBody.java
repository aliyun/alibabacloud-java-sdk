// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CountTodosResponseBody extends TeaModel {
    /**
     * <p>业务状态码；成功为200</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>错误描述</p>
     * 
     * <strong>example:</strong>
     * <p>请求的资源不存在</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>待处理数量（PENDING 主状态）</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("pendingCount")
    public Long pendingCount;

    /**
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>未读数量（处理人 readAt 为空）</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("unreadCount")
    public Long unreadCount;

    public static CountTodosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CountTodosResponseBody self = new CountTodosResponseBody();
        return TeaModel.build(map, self);
    }

    public CountTodosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CountTodosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CountTodosResponseBody setPendingCount(Long pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }
    public Long getPendingCount() {
        return this.pendingCount;
    }

    public CountTodosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CountTodosResponseBody setUnreadCount(Long unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }
    public Long getUnreadCount() {
        return this.unreadCount;
    }

}
