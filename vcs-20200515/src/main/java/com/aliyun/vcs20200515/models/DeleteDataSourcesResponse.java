// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDataSourcesResponseBody body;

    public static DeleteDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataSourcesResponse self = new DeleteDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataSourcesResponse setBody(DeleteDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataSourcesResponseBody getBody() {
        return this.body;
    }

}
