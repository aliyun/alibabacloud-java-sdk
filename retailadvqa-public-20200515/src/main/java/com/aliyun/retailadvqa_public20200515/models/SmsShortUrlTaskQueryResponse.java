// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class SmsShortUrlTaskQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SmsShortUrlTaskQueryResponseBody body;

    public static SmsShortUrlTaskQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        SmsShortUrlTaskQueryResponse self = new SmsShortUrlTaskQueryResponse();
        return TeaModel.build(map, self);
    }

    public SmsShortUrlTaskQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SmsShortUrlTaskQueryResponse setBody(SmsShortUrlTaskQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public SmsShortUrlTaskQueryResponseBody getBody() {
        return this.body;
    }

}
