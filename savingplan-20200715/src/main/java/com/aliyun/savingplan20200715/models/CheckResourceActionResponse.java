// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class CheckResourceActionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CheckResourceActionResponseBody body;

    public static CheckResourceActionResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckResourceActionResponse self = new CheckResourceActionResponse();
        return TeaModel.build(map, self);
    }

    public CheckResourceActionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckResourceActionResponse setBody(CheckResourceActionResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckResourceActionResponseBody getBody() {
        return this.body;
    }

}
