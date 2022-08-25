// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DeleteSwimLaneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteSwimLaneResponseBody body;

    public static DeleteSwimLaneResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSwimLaneResponse self = new DeleteSwimLaneResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSwimLaneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSwimLaneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSwimLaneResponse setBody(DeleteSwimLaneResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSwimLaneResponseBody getBody() {
        return this.body;
    }

}
