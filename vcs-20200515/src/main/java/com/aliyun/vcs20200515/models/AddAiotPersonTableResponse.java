// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class AddAiotPersonTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAiotPersonTableResponseBody body;

    public static AddAiotPersonTableResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAiotPersonTableResponse self = new AddAiotPersonTableResponse();
        return TeaModel.build(map, self);
    }

    public AddAiotPersonTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAiotPersonTableResponse setBody(AddAiotPersonTableResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAiotPersonTableResponseBody getBody() {
        return this.body;
    }

}
