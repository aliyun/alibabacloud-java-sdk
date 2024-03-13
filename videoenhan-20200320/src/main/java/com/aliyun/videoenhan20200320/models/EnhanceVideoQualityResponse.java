// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhanceVideoQualityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public EnhanceVideoQualityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnhanceVideoQualityResponse setBody(EnhanceVideoQualityResponseBody body) {
        this.body = body;
        return this;
    }
    public EnhanceVideoQualityResponseBody getBody() {
        return this.body;
    }

}
