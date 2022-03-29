// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.nbfkaifantest21_0_0.models;

import com.aliyun.tea.*;

public class KaifanHttpTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public KaifanHttpTestResponseBody body;

    public static KaifanHttpTestResponse build(java.util.Map<String, ?> map) throws Exception {
        KaifanHttpTestResponse self = new KaifanHttpTestResponse();
        return TeaModel.build(map, self);
    }

    public KaifanHttpTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public KaifanHttpTestResponse setBody(KaifanHttpTestResponseBody body) {
        this.body = body;
        return this;
    }
    public KaifanHttpTestResponseBody getBody() {
        return this.body;
    }

}
