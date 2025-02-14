// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UpdateWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateWhiteListResponseBody body;

    public static UpdateWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateWhiteListResponse self = new UpdateWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateWhiteListResponse setBody(UpdateWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateWhiteListResponseBody getBody() {
        return this.body;
    }

}
