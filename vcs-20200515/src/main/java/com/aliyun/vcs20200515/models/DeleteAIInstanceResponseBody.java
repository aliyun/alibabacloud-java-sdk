// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteAIInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    /**
     * <p>RequestID</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAIInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAIInstanceResponseBody self = new DeleteAIInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAIInstanceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAIInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAIInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
