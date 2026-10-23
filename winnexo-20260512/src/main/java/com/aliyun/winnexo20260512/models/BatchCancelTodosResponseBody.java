// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class BatchCancelTodosResponseBody extends TeaModel {
    /**
     * <p>The actual number of canceled items. The value is 0 for idempotent repeated calls.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("cancelledCount")
    public Long cancelledCount;

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
     * <p>The request tracking ID.</p>
     * 
     * <strong>example:</strong>
     * <p>019FF406-1B10-0065-A97D-2D1920C2A03D</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static BatchCancelTodosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchCancelTodosResponseBody self = new BatchCancelTodosResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchCancelTodosResponseBody setCancelledCount(Long cancelledCount) {
        this.cancelledCount = cancelledCount;
        return this;
    }
    public Long getCancelledCount() {
        return this.cancelledCount;
    }

    public BatchCancelTodosResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchCancelTodosResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchCancelTodosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
