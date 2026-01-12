// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xrengine20221111.models;

import com.aliyun.tea.*;

public class DeleteSourceFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSourceFileResponseBody body;

    public static DeleteSourceFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSourceFileResponse self = new DeleteSourceFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSourceFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSourceFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSourceFileResponse setBody(DeleteSourceFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSourceFileResponseBody getBody() {
        return this.body;
    }

}
