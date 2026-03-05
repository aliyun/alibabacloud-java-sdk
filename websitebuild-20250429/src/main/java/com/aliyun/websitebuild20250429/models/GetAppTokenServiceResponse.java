// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppTokenServiceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppTokenServiceResponseBody body;

    public static GetAppTokenServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppTokenServiceResponse self = new GetAppTokenServiceResponse();
        return TeaModel.build(map, self);
    }

    public GetAppTokenServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppTokenServiceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppTokenServiceResponse setBody(GetAppTokenServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppTokenServiceResponseBody getBody() {
        return this.body;
    }

}
