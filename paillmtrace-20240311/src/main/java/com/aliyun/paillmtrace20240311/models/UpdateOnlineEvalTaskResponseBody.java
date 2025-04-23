// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paillmtrace20240311.models;

import com.aliyun.tea.*;

public class UpdateOnlineEvalTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>InvalidInputParams</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>cannot modify a stopped task</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the POP request</p>
     * 
     * <strong>example:</strong>
     * <p>6A87228C-969A-1381-98CF-AE07AE630FA5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateOnlineEvalTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateOnlineEvalTaskResponseBody self = new UpdateOnlineEvalTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateOnlineEvalTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateOnlineEvalTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateOnlineEvalTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
