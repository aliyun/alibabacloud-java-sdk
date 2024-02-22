// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20220101.models;

import com.aliyun.tea.*;

public class CreateIdleInstanceCullerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIdleInstanceCullerResponseBody body;

    public static CreateIdleInstanceCullerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIdleInstanceCullerResponse self = new CreateIdleInstanceCullerResponse();
        return TeaModel.build(map, self);
    }

    public CreateIdleInstanceCullerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIdleInstanceCullerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIdleInstanceCullerResponse setBody(CreateIdleInstanceCullerResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIdleInstanceCullerResponseBody getBody() {
        return this.body;
    }

}
