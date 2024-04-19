// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteDataSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataSetResponseBody body;

    public static DeleteDataSetResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSetResponse self = new DeleteDataSetResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataSetResponse setBody(DeleteDataSetResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataSetResponseBody getBody() {
        return this.body;
    }

}
