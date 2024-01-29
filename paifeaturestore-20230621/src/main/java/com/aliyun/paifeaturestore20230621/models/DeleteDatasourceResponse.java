// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class DeleteDatasourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDatasourceResponseBody body;

    public static DeleteDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDatasourceResponse self = new DeleteDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDatasourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDatasourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDatasourceResponse setBody(DeleteDatasourceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDatasourceResponseBody getBody() {
        return this.body;
    }

}
