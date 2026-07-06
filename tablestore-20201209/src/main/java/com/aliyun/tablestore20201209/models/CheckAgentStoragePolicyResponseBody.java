// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CheckAgentStoragePolicyResponseBody extends TeaModel {
    /**
     * <p>The response status code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>Verification passed.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID, which can be used for troubleshooting.</p>
     * 
     * <strong>example:</strong>
     * <p>E734979F-5A44-5993-9CE5-C23103576923</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckAgentStoragePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckAgentStoragePolicyResponseBody self = new CheckAgentStoragePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckAgentStoragePolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckAgentStoragePolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckAgentStoragePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
