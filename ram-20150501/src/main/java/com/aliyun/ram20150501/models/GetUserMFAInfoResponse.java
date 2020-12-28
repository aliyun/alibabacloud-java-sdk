// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class GetUserMFAInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserMFAInfoResponseBody body;

    public static GetUserMFAInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserMFAInfoResponse self = new GetUserMFAInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserMFAInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserMFAInfoResponse setBody(GetUserMFAInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserMFAInfoResponseBody getBody() {
        return this.body;
    }

}
