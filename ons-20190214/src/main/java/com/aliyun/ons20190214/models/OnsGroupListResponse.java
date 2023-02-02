// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsGroupListResponseBody body;

    public static OnsGroupListResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupListResponse self = new OnsGroupListResponse();
        return TeaModel.build(map, self);
    }

    public OnsGroupListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsGroupListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsGroupListResponse setBody(OnsGroupListResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsGroupListResponseBody getBody() {
        return this.body;
    }

}
