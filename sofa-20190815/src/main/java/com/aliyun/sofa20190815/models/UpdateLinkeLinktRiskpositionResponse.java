// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeLinktRiskpositionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateLinkeLinktRiskpositionResponseBody body;

    public static UpdateLinkeLinktRiskpositionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeLinktRiskpositionResponse self = new UpdateLinkeLinktRiskpositionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeLinktRiskpositionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateLinkeLinktRiskpositionResponse setBody(UpdateLinkeLinktRiskpositionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateLinkeLinktRiskpositionResponseBody getBody() {
        return this.body;
    }

}
