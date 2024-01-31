// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateServiceTrailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceTrailResponseBody body;

    public static CreateServiceTrailResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTrailResponse self = new CreateServiceTrailResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceTrailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceTrailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceTrailResponse setBody(CreateServiceTrailResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceTrailResponseBody getBody() {
        return this.body;
    }

}
