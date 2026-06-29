// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tablestore20201209.models;

import com.aliyun.tea.*;

public class CreateAgentStorageResponseBody extends TeaModel {
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
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>request id</p>
     * 
     * <strong>example:</strong>
     * <p>18DD77BF-F967-576D-80D1-79121399AB53</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAgentStorageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentStorageResponseBody self = new CreateAgentStorageResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAgentStorageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateAgentStorageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateAgentStorageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
