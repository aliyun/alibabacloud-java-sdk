// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProfileResponseBody body;

    public static DeleteProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProfileResponse self = new DeleteProfileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProfileResponse setBody(DeleteProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProfileResponseBody getBody() {
        return this.body;
    }

}
