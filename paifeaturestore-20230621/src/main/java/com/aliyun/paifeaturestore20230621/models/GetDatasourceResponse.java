// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paifeaturestore20230621.models;

import com.aliyun.tea.*;

public class GetDatasourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDatasourceResponseBody body;

    public static GetDatasourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatasourceResponse self = new GetDatasourceResponse();
        return TeaModel.build(map, self);
    }

    public GetDatasourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDatasourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDatasourceResponse setBody(GetDatasourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDatasourceResponseBody getBody() {
        return this.body;
    }

}
