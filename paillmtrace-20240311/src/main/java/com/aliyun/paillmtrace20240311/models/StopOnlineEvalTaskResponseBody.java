// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class StopOnlineEvalTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>task id is empty</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the POP request</p>
     * 
     * <strong>example:</strong>
     * <p>31E5FBC2-792D-5B5C-A5EB-3019984ABFC8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static StopOnlineEvalTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StopOnlineEvalTaskResponseBody self = new StopOnlineEvalTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public StopOnlineEvalTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public StopOnlineEvalTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public StopOnlineEvalTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
