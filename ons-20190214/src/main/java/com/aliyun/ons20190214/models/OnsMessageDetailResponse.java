// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsMessageDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OnsMessageDetailResponseBody body;

    public static OnsMessageDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsMessageDetailResponse self = new OnsMessageDetailResponse();
        return TeaModel.build(map, self);
    }

    public OnsMessageDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsMessageDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OnsMessageDetailResponse setBody(OnsMessageDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsMessageDetailResponseBody getBody() {
        return this.body;
    }

}
