// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteConfigFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteConfigFileResponseBody body;

    public static DeleteConfigFileResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteConfigFileResponse self = new DeleteConfigFileResponse();
        return TeaModel.build(map, self);
    }

    public DeleteConfigFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteConfigFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteConfigFileResponse setBody(DeleteConfigFileResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteConfigFileResponseBody getBody() {
        return this.body;
    }

}
