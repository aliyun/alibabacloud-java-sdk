// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenFlowLogServiceResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The information returned after the flow log feature is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>28CF47AB-B6C0-5FA2-80C7-2B28826A92CB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenFlowLogServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenFlowLogServiceResponseBody self = new OpenFlowLogServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenFlowLogServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenFlowLogServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenFlowLogServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
