// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class GetInstanceTwoFactorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetInstanceTwoFactorResponseBody body;

    public static GetInstanceTwoFactorResponse build(java.util.Map<String, ?> map) throws Exception {
        GetInstanceTwoFactorResponse self = new GetInstanceTwoFactorResponse();
        return TeaModel.build(map, self);
    }

    public GetInstanceTwoFactorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetInstanceTwoFactorResponse setBody(GetInstanceTwoFactorResponseBody body) {
        this.body = body;
        return this;
    }
    public GetInstanceTwoFactorResponseBody getBody() {
        return this.body;
    }

}
