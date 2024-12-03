// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class DeleteInstancePolicyResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
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
     * <p>The request ID, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>3104C83E-6E82-57FB-BB88-8C64CCFDEF89</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteInstancePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstancePolicyResponseBody self = new DeleteInstancePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInstancePolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteInstancePolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteInstancePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
