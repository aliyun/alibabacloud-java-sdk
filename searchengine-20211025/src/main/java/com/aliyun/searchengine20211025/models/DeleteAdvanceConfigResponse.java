// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DeleteAdvanceConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteAdvanceConfigResponseBody body;

    public static DeleteAdvanceConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAdvanceConfigResponse self = new DeleteAdvanceConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAdvanceConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAdvanceConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteAdvanceConfigResponse setBody(DeleteAdvanceConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAdvanceConfigResponseBody getBody() {
        return this.body;
    }

}
