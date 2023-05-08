// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class GetLogoImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogoImageResponseBody body;

    public static GetLogoImageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogoImageResponse self = new GetLogoImageResponse();
        return TeaModel.build(map, self);
    }

    public GetLogoImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogoImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogoImageResponse setBody(GetLogoImageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogoImageResponseBody getBody() {
        return this.body;
    }

}
