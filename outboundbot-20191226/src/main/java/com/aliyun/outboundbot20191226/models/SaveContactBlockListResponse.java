// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveContactBlockListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveContactBlockListResponseBody body;

    public static SaveContactBlockListResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveContactBlockListResponse self = new SaveContactBlockListResponse();
        return TeaModel.build(map, self);
    }

    public SaveContactBlockListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveContactBlockListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveContactBlockListResponse setBody(SaveContactBlockListResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveContactBlockListResponseBody getBody() {
        return this.body;
    }

}
