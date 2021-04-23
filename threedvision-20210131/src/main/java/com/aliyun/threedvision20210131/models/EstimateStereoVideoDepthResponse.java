// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.threedvision20210131.models;

import com.aliyun.tea.*;

public class EstimateStereoVideoDepthResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EstimateStereoVideoDepthResponseBody body;

    public static EstimateStereoVideoDepthResponse build(java.util.Map<String, ?> map) throws Exception {
        EstimateStereoVideoDepthResponse self = new EstimateStereoVideoDepthResponse();
        return TeaModel.build(map, self);
    }

    public EstimateStereoVideoDepthResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EstimateStereoVideoDepthResponse setBody(EstimateStereoVideoDepthResponseBody body) {
        this.body = body;
        return this;
    }
    public EstimateStereoVideoDepthResponseBody getBody() {
        return this.body;
    }

}
