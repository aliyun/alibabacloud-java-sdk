// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateAccessTokenResponseBody extends TeaModel {
    /**
     * <p>The value of the activation code. The value is returned only once after the CreateAccessToken operation is called and cannot be subsequently queried. Make sure that you properly save the returned value.</p>
     * 
     * <strong>example:</strong>
     * <p>B57QoTXEA2Tytr0uZWoNY5Aju5Jt****</p>
     */
    @NameInMap("AccessTokenCode")
    public String accessTokenCode;

    /**
     * <p>The ID of the activation code.</p>
     * 
     * <strong>example:</strong>
     * <p>at-bp1akz2zp67r0k6r****</p>
     */
    @NameInMap("AccessTokenId")
    public String accessTokenId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DB4A7EA2-6FDA-5655-B067-854532FB****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessTokenResponseBody self = new CreateAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateAccessTokenResponseBody setAccessTokenCode(String accessTokenCode) {
        this.accessTokenCode = accessTokenCode;
        return this;
    }
    public String getAccessTokenCode() {
        return this.accessTokenCode;
    }

    public CreateAccessTokenResponseBody setAccessTokenId(String accessTokenId) {
        this.accessTokenId = accessTokenId;
        return this;
    }
    public String getAccessTokenId() {
        return this.accessTokenId;
    }

    public CreateAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
