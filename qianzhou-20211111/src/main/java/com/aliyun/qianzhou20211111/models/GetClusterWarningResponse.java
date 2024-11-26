// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetClusterWarningResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClusterWarningResponseBody body;

    public static GetClusterWarningResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClusterWarningResponse self = new GetClusterWarningResponse();
        return TeaModel.build(map, self);
    }

    public GetClusterWarningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClusterWarningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClusterWarningResponse setBody(GetClusterWarningResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClusterWarningResponseBody getBody() {
        return this.body;
    }

}
