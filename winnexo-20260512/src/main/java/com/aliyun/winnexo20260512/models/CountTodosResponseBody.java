// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class CountTodosResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error description.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The number of pending items with the primary status of PENDING.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("pendingCount")
    public Long pendingCount;

    /**
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of unread items where the readAt field of the handler is empty.</p>
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
