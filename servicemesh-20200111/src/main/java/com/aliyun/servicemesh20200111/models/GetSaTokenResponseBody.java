// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GetSaTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    // Token of service account
    @NameInMap("Token")
    public String token;

    public static GetSaTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSaTokenResponseBody self = new GetSaTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSaTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSaTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
