// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveEffectiveDaysResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveEffectiveDaysResponseBody body;

    public static SaveEffectiveDaysResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveEffectiveDaysResponse self = new SaveEffectiveDaysResponse();
        return TeaModel.build(map, self);
    }

    public SaveEffectiveDaysResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveEffectiveDaysResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveEffectiveDaysResponse setBody(SaveEffectiveDaysResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveEffectiveDaysResponseBody getBody() {
        return this.body;
    }

}
