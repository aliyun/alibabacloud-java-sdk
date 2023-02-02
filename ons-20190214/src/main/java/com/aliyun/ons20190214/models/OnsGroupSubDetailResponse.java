// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsGroupSubDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsGroupSubDetailResponseBody body;

    public static OnsGroupSubDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsGroupSubDetailResponse self = new OnsGroupSubDetailResponse();
        return TeaModel.build(map, self);
    }

    public OnsGroupSubDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsGroupSubDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsGroupSubDetailResponse setBody(OnsGroupSubDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsGroupSubDetailResponseBody getBody() {
        return this.body;
    }

}
