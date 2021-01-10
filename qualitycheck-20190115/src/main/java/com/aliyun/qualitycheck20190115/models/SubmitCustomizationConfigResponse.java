// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitCustomizationConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitCustomizationConfigResponseBody body;

    public static SubmitCustomizationConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitCustomizationConfigResponse self = new SubmitCustomizationConfigResponse();
        return TeaModel.build(map, self);
    }

    public SubmitCustomizationConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitCustomizationConfigResponse setBody(SubmitCustomizationConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitCustomizationConfigResponseBody getBody() {
        return this.body;
    }

}
