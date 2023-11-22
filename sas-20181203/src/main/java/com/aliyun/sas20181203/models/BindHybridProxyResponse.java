// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class BindHybridProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BindHybridProxyResponseBody body;

    public static BindHybridProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        BindHybridProxyResponse self = new BindHybridProxyResponse();
        return TeaModel.build(map, self);
    }

    public BindHybridProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindHybridProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindHybridProxyResponse setBody(BindHybridProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public BindHybridProxyResponseBody getBody() {
        return this.body;
    }

}
