// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateHasBaselineNwapprovalprocessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateHasBaselineNwapprovalprocessResponseBody body;

    public static UpdateHasBaselineNwapprovalprocessResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateHasBaselineNwapprovalprocessResponse self = new UpdateHasBaselineNwapprovalprocessResponse();
        return TeaModel.build(map, self);
    }

    public UpdateHasBaselineNwapprovalprocessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateHasBaselineNwapprovalprocessResponse setBody(UpdateHasBaselineNwapprovalprocessResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateHasBaselineNwapprovalprocessResponseBody getBody() {
        return this.body;
    }

}
