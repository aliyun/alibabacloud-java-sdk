// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class CreateTCInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTCInstanceResponseBody body;

    public static CreateTCInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTCInstanceResponse self = new CreateTCInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreateTCInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTCInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTCInstanceResponse setBody(CreateTCInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTCInstanceResponseBody getBody() {
        return this.body;
    }

}
