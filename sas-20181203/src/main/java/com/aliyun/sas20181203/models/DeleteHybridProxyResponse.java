// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteHybridProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteHybridProxyResponseBody body;

    public static DeleteHybridProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHybridProxyResponse self = new DeleteHybridProxyResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHybridProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHybridProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteHybridProxyResponse setBody(DeleteHybridProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHybridProxyResponseBody getBody() {
        return this.body;
    }

}
