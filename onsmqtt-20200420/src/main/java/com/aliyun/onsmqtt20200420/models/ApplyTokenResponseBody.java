// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class ApplyTokenResponseBody extends TeaModel {
    @NameInMap("Token")
    public String token;

    @NameInMap("RequestId")
    public String requestId;

    public static ApplyTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ApplyTokenResponseBody self = new ApplyTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public ApplyTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public ApplyTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
