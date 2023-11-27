// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtrace20190808.models;

import com.aliyun.tea.*;

public class CheckCommercialStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CheckCommercialStatusResponseBody body;

    public static CheckCommercialStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        CheckCommercialStatusResponse self = new CheckCommercialStatusResponse();
        return TeaModel.build(map, self);
    }

    public CheckCommercialStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CheckCommercialStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CheckCommercialStatusResponse setBody(CheckCommercialStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public CheckCommercialStatusResponseBody getBody() {
        return this.body;
    }

}
