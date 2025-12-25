// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class UpdateConnDataResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateConnDataResponseBody body;

    public static UpdateConnDataResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateConnDataResponse self = new UpdateConnDataResponse();
        return TeaModel.build(map, self);
    }

    public UpdateConnDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateConnDataResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateConnDataResponse setBody(UpdateConnDataResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateConnDataResponseBody getBody() {
        return this.body;
    }

}
