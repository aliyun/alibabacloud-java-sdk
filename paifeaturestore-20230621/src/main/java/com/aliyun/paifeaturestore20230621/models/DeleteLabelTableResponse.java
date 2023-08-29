// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteLabelTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteLabelTableResponseBody body;

    public static DeleteLabelTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteLabelTableResponse self = new DeleteLabelTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteLabelTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteLabelTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteLabelTableResponse setBody(DeleteLabelTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteLabelTableResponseBody getBody() {
        return this.body;
    }

}
