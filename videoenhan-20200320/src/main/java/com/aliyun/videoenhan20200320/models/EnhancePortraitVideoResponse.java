// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.videoenhan20200320.models;

import com.aliyun.tea.*;

public class EnhancePortraitVideoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnhancePortraitVideoResponseBody body;

    public static EnhancePortraitVideoResponse build(java.util.Map<String, ?> map) throws Exception {
        EnhancePortraitVideoResponse self = new EnhancePortraitVideoResponse();
        return TeaModel.build(map, self);
    }

    public EnhancePortraitVideoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnhancePortraitVideoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnhancePortraitVideoResponse setBody(EnhancePortraitVideoResponseBody body) {
        this.body = body;
        return this;
    }
    public EnhancePortraitVideoResponseBody getBody() {
        return this.body;
    }

}
