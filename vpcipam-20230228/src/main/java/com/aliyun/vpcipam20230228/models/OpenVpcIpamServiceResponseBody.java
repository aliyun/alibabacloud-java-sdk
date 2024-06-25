// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpcipam20230228.models;

import com.aliyun.tea.*;

public class OpenVpcIpamServiceResponseBody extends TeaModel {
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
     * <p>3F814C37-B032-5477-AF5A-2925D0593CD4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OpenVpcIpamServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenVpcIpamServiceResponseBody self = new OpenVpcIpamServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenVpcIpamServiceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public OpenVpcIpamServiceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public OpenVpcIpamServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
