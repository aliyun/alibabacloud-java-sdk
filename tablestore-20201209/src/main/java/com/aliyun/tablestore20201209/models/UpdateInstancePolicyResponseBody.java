// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class UpdateInstancePolicyResponseBody extends TeaModel {
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
     * <p>31D8120C-AC52-5CA9-BE4A-E4C6316E19AD</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static UpdateInstancePolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstancePolicyResponseBody self = new UpdateInstancePolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateInstancePolicyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateInstancePolicyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateInstancePolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
