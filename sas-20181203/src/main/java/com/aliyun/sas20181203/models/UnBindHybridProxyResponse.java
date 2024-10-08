// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnBindHybridProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnBindHybridProxyResponseBody body;

    public static UnBindHybridProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        UnBindHybridProxyResponse self = new UnBindHybridProxyResponse();
        return TeaModel.build(map, self);
    }

    public UnBindHybridProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnBindHybridProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnBindHybridProxyResponse setBody(UnBindHybridProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public UnBindHybridProxyResponseBody getBody() {
        return this.body;
    }

}
