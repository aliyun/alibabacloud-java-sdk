// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DeleteDataLimitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataLimitResponseBody body;

    public static DeleteDataLimitResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataLimitResponse self = new DeleteDataLimitResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataLimitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataLimitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataLimitResponse setBody(DeleteDataLimitResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataLimitResponseBody getBody() {
        return this.body;
    }

}
