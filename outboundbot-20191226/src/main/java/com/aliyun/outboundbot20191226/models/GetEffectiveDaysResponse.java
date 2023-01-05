// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetEffectiveDaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetEffectiveDaysResponseBody body;

    public static GetEffectiveDaysResponse build(java.util.Map<String, ?> map) throws Exception {
        GetEffectiveDaysResponse self = new GetEffectiveDaysResponse();
        return TeaModel.build(map, self);
    }

    public GetEffectiveDaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetEffectiveDaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetEffectiveDaysResponse setBody(GetEffectiveDaysResponseBody body) {
        this.body = body;
        return this;
    }
    public GetEffectiveDaysResponseBody getBody() {
        return this.body;
    }

}
