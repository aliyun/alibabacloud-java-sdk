// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class GetAppInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAppInstanceResponseBody body;

    public static GetAppInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAppInstanceResponse self = new GetAppInstanceResponse();
        return TeaModel.build(map, self);
    }

    public GetAppInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAppInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAppInstanceResponse setBody(GetAppInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAppInstanceResponseBody getBody() {
        return this.body;
    }

}
