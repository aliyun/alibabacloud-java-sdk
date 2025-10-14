// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CreateGdnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateGdnInstanceResponseBody body;

    public static CreateGdnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateGdnInstanceResponse self = new CreateGdnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateGdnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateGdnInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateGdnInstanceResponse setBody(CreateGdnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateGdnInstanceResponseBody getBody() {
        return this.body;
    }

}
