// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class InstallHybridProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InstallHybridProxyResponseBody body;

    public static InstallHybridProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        InstallHybridProxyResponse self = new InstallHybridProxyResponse();
        return TeaModel.build(map, self);
    }

    public InstallHybridProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InstallHybridProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InstallHybridProxyResponse setBody(InstallHybridProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public InstallHybridProxyResponseBody getBody() {
        return this.body;
    }

}
