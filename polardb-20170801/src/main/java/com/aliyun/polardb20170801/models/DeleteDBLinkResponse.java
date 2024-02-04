// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteDBLinkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDBLinkResponseBody body;

    public static DeleteDBLinkResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDBLinkResponse self = new DeleteDBLinkResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDBLinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDBLinkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDBLinkResponse setBody(DeleteDBLinkResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDBLinkResponseBody getBody() {
        return this.body;
    }

}
