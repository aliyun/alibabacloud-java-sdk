// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateHasBaselineNwapprovalprocessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateHasBaselineNwapprovalprocessResponseBody body;

    public static CreateHasBaselineNwapprovalprocessResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHasBaselineNwapprovalprocessResponse self = new CreateHasBaselineNwapprovalprocessResponse();
        return TeaModel.build(map, self);
    }

    public CreateHasBaselineNwapprovalprocessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHasBaselineNwapprovalprocessResponse setBody(CreateHasBaselineNwapprovalprocessResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHasBaselineNwapprovalprocessResponseBody getBody() {
        return this.body;
    }

}
