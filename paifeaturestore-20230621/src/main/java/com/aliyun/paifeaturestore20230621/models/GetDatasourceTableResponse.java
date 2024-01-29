// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetDatasourceTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatasourceTableResponseBody body;

    public static GetDatasourceTableResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasourceTableResponse self = new GetDatasourceTableResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasourceTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasourceTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatasourceTableResponse setBody(GetDatasourceTableResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasourceTableResponseBody getBody() {
        return this.body;
    }

}
