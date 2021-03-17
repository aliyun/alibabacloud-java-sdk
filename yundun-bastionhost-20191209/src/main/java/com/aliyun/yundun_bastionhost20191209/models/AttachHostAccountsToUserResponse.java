// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class AttachHostAccountsToUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AttachHostAccountsToUserResponseBody body;

    public static AttachHostAccountsToUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AttachHostAccountsToUserResponse self = new AttachHostAccountsToUserResponse();
        return TeaModel.build(map, self);
    }

    public AttachHostAccountsToUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AttachHostAccountsToUserResponse setBody(AttachHostAccountsToUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AttachHostAccountsToUserResponseBody getBody() {
        return this.body;
    }

}
