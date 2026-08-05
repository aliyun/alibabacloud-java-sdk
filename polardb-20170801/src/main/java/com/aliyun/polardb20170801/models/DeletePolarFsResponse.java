// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DeletePolarFsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePolarFsResponseBody body;

    public static DeletePolarFsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePolarFsResponse self = new DeletePolarFsResponse();
        return TeaModel.build(map, self);
    }

    public DeletePolarFsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePolarFsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePolarFsResponse setBody(DeletePolarFsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePolarFsResponseBody getBody() {
        return this.body;
    }

}
