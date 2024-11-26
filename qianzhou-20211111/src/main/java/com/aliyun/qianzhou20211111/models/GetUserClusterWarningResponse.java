// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qianzhou20211111.models;

import com.aliyun.tea.*;

public class GetUserClusterWarningResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetUserClusterWarningResponseBody body;

    public static GetUserClusterWarningResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserClusterWarningResponse self = new GetUserClusterWarningResponse();
        return TeaModel.build(map, self);
    }

    public GetUserClusterWarningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserClusterWarningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetUserClusterWarningResponse setBody(GetUserClusterWarningResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserClusterWarningResponseBody getBody() {
        return this.body;
    }

}
