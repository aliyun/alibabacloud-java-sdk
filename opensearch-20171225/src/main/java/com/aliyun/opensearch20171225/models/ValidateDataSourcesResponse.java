// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class ValidateDataSourcesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ValidateDataSourcesResponseBody body;

    public static ValidateDataSourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateDataSourcesResponse self = new ValidateDataSourcesResponse();
        return TeaModel.build(map, self);
    }

    public ValidateDataSourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateDataSourcesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidateDataSourcesResponse setBody(ValidateDataSourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateDataSourcesResponseBody getBody() {
        return this.body;
    }

}
