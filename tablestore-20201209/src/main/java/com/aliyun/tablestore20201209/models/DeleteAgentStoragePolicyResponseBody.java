// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteAgentStoragePolicyResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>39871ED2-62C0-578F-A32E-B88072D5582F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAgentStoragePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAgentStoragePolicyResponseBody self = new DeleteAgentStoragePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAgentStoragePolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteAgentStoragePolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteAgentStoragePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
