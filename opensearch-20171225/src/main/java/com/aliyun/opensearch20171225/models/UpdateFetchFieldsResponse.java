// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFetchFieldsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateFetchFieldsResponseBody body;

    public static UpdateFetchFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFetchFieldsResponse self = new UpdateFetchFieldsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFetchFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFetchFieldsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateFetchFieldsResponse setBody(UpdateFetchFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFetchFieldsResponseBody getBody() {
        return this.body;
    }

}
