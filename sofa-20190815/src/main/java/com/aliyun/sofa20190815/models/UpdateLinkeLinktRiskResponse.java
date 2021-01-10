// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktRiskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktRiskResponseBody body;

    public static UpdateLinkeLinktRiskResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktRiskResponse self = new UpdateLinkeLinktRiskResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktRiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktRiskResponse setBody(UpdateLinkeLinktRiskResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktRiskResponseBody getBody() {
        return this.body;
    }

}
