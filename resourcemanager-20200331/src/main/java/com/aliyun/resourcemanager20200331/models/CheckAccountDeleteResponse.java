// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class CheckAccountDeleteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckAccountDeleteResponseBody body;

    public static CheckAccountDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckAccountDeleteResponse self = new CheckAccountDeleteResponse();
        return TeaModel.build(map, self);
    }

    public CheckAccountDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckAccountDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckAccountDeleteResponse setBody(CheckAccountDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckAccountDeleteResponseBody getBody() {
        return this.body;
    }

}
