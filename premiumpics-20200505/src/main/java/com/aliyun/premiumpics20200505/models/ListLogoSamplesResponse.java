// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListLogoSamplesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLogoSamplesResponseBody body;

    public static ListLogoSamplesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogoSamplesResponse self = new ListLogoSamplesResponse();
        return TeaModel.build(map, self);
    }

    public ListLogoSamplesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogoSamplesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogoSamplesResponse setBody(ListLogoSamplesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogoSamplesResponseBody getBody() {
        return this.body;
    }

}
