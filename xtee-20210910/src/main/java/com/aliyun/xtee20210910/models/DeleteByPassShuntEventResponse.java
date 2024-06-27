// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DeleteByPassShuntEventResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteByPassShuntEventResponseBody body;

    public static DeleteByPassShuntEventResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteByPassShuntEventResponse self = new DeleteByPassShuntEventResponse();
        return TeaModel.build(map, self);
    }

    public DeleteByPassShuntEventResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteByPassShuntEventResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteByPassShuntEventResponse setBody(DeleteByPassShuntEventResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteByPassShuntEventResponseBody getBody() {
        return this.body;
    }

}
