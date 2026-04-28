// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeleteModelApiResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteModelApiResponseBody body;

    public static DeleteModelApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteModelApiResponse self = new DeleteModelApiResponse();
        return TeaModel.build(map, self);
    }

    public DeleteModelApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteModelApiResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteModelApiResponse setBody(DeleteModelApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteModelApiResponseBody getBody() {
        return this.body;
    }

}
