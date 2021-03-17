// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class DetachHostAccountsFromUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DetachHostAccountsFromUserResponseBody body;

    public static DetachHostAccountsFromUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachHostAccountsFromUserResponse self = new DetachHostAccountsFromUserResponse();
        return TeaModel.build(map, self);
    }

    public DetachHostAccountsFromUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachHostAccountsFromUserResponse setBody(DetachHostAccountsFromUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachHostAccountsFromUserResponseBody getBody() {
        return this.body;
    }

}
