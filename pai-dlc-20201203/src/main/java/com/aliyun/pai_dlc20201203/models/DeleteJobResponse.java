// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class DeleteJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteJobResponseBody body;

    public static DeleteJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteJobResponse self = new DeleteJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteJobResponse setBody(DeleteJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteJobResponseBody getBody() {
        return this.body;
    }

}
