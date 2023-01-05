// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveContactWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveContactWhiteListResponseBody body;

    public static SaveContactWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveContactWhiteListResponse self = new SaveContactWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public SaveContactWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveContactWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveContactWhiteListResponse setBody(SaveContactWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveContactWhiteListResponseBody getBody() {
        return this.body;
    }

}
