// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class OpenPublicIpAddressPoolServiceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>28CF47AB-B6C0-5FA2-80C7-2B37726A92CB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenPublicIpAddressPoolServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenPublicIpAddressPoolServiceResponseBody self = new OpenPublicIpAddressPoolServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenPublicIpAddressPoolServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenPublicIpAddressPoolServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenPublicIpAddressPoolServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
