// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddProfileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddProfileResponseBody body;

    public static AddProfileResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProfileResponse self = new AddProfileResponse();
        return TeaModel.build(map, self);
    }

    public AddProfileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProfileResponse setBody(AddProfileResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProfileResponseBody getBody() {
        return this.body;
    }

}
