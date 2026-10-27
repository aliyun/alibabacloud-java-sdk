// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeletePxfsUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePxfsUserResponseBody body;

    public static DeletePxfsUserResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePxfsUserResponse self = new DeletePxfsUserResponse();
        return TeaModel.build(map, self);
    }

    public DeletePxfsUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePxfsUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePxfsUserResponse setBody(DeletePxfsUserResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePxfsUserResponseBody getBody() {
        return this.body;
    }

}
