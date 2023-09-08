// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class GetDataSourceDeployResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataSourceDeployResponseBody body;

    public static GetDataSourceDeployResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceDeployResponse self = new GetDataSourceDeployResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceDeployResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSourceDeployResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataSourceDeployResponse setBody(GetDataSourceDeployResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSourceDeployResponseBody getBody() {
        return this.body;
    }

}
