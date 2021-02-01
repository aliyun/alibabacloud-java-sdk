// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateStereoImageDepthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EstimateStereoImageDepthResponseBody body;

    public static EstimateStereoImageDepthResponse build(java.util.Map<String, ?> map) throws Exception {
        EstimateStereoImageDepthResponse self = new EstimateStereoImageDepthResponse();
        return TeaModel.build(map, self);
    }

    public EstimateStereoImageDepthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EstimateStereoImageDepthResponse setBody(EstimateStereoImageDepthResponseBody body) {
        this.body = body;
        return this;
    }
    public EstimateStereoImageDepthResponseBody getBody() {
        return this.body;
    }

}
