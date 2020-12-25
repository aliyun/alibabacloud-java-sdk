// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhanceVideoQualityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnhanceVideoQualityResponseBody body;

    public static EnhanceVideoQualityResponse build(java.util.Map<String, ?> map) throws Exception {
        EnhanceVideoQualityResponse self = new EnhanceVideoQualityResponse();
        return TeaModel.build(map, self);
    }

    public EnhanceVideoQualityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnhanceVideoQualityResponse setBody(EnhanceVideoQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public EnhanceVideoQualityResponseBody getBody() {
        return this.body;
    }

}
