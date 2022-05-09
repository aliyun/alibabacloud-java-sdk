// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateLayoutDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLayoutDataResponseBody body;

    public static UpdateLayoutDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLayoutDataResponse self = new UpdateLayoutDataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLayoutDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLayoutDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateLayoutDataResponse setBody(UpdateLayoutDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLayoutDataResponseBody getBody() {
        return this.body;
    }

}
