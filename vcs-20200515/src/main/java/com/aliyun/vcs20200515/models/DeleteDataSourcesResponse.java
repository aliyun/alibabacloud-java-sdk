// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vcs20200515.models;

import com.aliyun.tea.*;

public class DeleteDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DeleteDataSourcesResponse setBody(DeleteDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataSourcesResponseBody getBody() {
        return this.body;
    }

}
