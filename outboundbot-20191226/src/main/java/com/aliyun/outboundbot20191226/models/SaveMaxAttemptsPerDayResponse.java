// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveMaxAttemptsPerDayResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveMaxAttemptsPerDayResponseBody body;

    public static SaveMaxAttemptsPerDayResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveMaxAttemptsPerDayResponse self = new SaveMaxAttemptsPerDayResponse();
        return TeaModel.build(map, self);
    }

    public SaveMaxAttemptsPerDayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveMaxAttemptsPerDayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveMaxAttemptsPerDayResponse setBody(SaveMaxAttemptsPerDayResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveMaxAttemptsPerDayResponseBody getBody() {
        return this.body;
    }

}
