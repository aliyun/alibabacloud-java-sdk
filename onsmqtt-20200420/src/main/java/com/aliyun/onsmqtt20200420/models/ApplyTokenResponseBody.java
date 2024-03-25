// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ApplyTokenResponseBody extends TeaModel {
    /**
     * <p>The request ID. This parameter is a common parameter.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The token that is returned by the ApsaraMQ for MQTT broker.</p>
     * <br>
     * <p>>  Do not assume the length, format, or rule of the token to return. The actual returned token shall prevail.</p>
     */
    @NameInMap("Token")
    public String token;

    public static ApplyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyTokenResponseBody self = new ApplyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ApplyTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
