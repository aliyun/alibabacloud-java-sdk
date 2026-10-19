// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MarkTodosReadResponseBody extends TeaModel {
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
     * <p>请求追踪ID</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>标记后剩余未读数</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("unreadCount")
    public Long unreadCount;

    /**
     * <p>本次标记条数</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("updatedCount")
    public Long updatedCount;

    public static MarkTodosReadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        MarkTodosReadResponseBody self = new MarkTodosReadResponseBody();
        return TeaModel.build(map, self);
    }

    public MarkTodosReadResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public MarkTodosReadResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public MarkTodosReadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public MarkTodosReadResponseBody setUnreadCount(Long unreadCount) {
        this.unreadCount = unreadCount;
        return this;
    }
    public Long getUnreadCount() {
        return this.unreadCount;
    }

    public MarkTodosReadResponseBody setUpdatedCount(Long updatedCount) {
        this.updatedCount = updatedCount;
        return this;
    }
    public Long getUpdatedCount() {
        return this.updatedCount;
    }

}
