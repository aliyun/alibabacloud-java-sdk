// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class MarkTodosReadResponseBody extends TeaModel {
    /**
     * <p>The business status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The requested resource does not exist</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The number of unread to-do items remaining after the operation.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("unreadCount")
    public Long unreadCount;

    /**
     * <p>The number of to-do items marked as read in this request.</p>
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
