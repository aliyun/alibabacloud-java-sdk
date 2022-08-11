// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class SdkOrderQosProductResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SdkOrderQosProductResponseBody body;

    public static SdkOrderQosProductResponse build(java.util.Map<String, ?> map) throws Exception {
        SdkOrderQosProductResponse self = new SdkOrderQosProductResponse();
        return TeaModel.build(map, self);
    }

    public SdkOrderQosProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SdkOrderQosProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SdkOrderQosProductResponse setBody(SdkOrderQosProductResponseBody body) {
        this.body = body;
        return this;
    }
    public SdkOrderQosProductResponseBody getBody() {
        return this.body;
    }

}
