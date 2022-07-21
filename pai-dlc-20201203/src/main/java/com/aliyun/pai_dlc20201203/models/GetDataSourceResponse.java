// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class GetDataSourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDataSourceResponseBody body;

    public static GetDataSourceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataSourceResponse self = new GetDataSourceResponse();
        return TeaModel.build(map, self);
    }

    public GetDataSourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataSourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataSourceResponse setBody(GetDataSourceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataSourceResponseBody getBody() {
        return this.body;
    }

}
