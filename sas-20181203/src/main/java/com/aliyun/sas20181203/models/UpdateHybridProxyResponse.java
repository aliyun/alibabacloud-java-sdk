// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateHybridProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateHybridProxyResponseBody body;

    public static UpdateHybridProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHybridProxyResponse self = new UpdateHybridProxyResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHybridProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHybridProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateHybridProxyResponse setBody(UpdateHybridProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHybridProxyResponseBody getBody() {
        return this.body;
    }

}
