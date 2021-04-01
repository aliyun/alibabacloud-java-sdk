// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pam20200930.models;

import com.aliyun.tea.*;

public class GenerateDirectOperationTokenResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Token")
    public String token;

    public static GenerateDirectOperationTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateDirectOperationTokenResponseBody self = new GenerateDirectOperationTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateDirectOperationTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateDirectOperationTokenResponseBody setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

}
