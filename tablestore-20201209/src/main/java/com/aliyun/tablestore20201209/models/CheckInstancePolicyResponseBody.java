// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CheckInstancePolicyResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
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
     * <p>The request ID, which can be used to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>757E172A-F94B-5E78-8A23-D9068E42F2E9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CheckInstancePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckInstancePolicyResponseBody self = new CheckInstancePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckInstancePolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CheckInstancePolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CheckInstancePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
