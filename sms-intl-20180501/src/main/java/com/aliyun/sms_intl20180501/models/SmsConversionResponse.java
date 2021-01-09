// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sms_intl20180501.models;

import com.aliyun.tea.*;

public class SmsConversionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SmsConversionResponseBody body;

    public static SmsConversionResponse build(java.util.Map<String, ?> map) throws Exception {
        SmsConversionResponse self = new SmsConversionResponse();
        return TeaModel.build(map, self);
    }

    public SmsConversionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmsConversionResponse setBody(SmsConversionResponseBody body) {
        this.body = body;
        return this;
    }
    public SmsConversionResponseBody getBody() {
        return this.body;
    }

}
