// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasBaselineNwapprovalprocessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteHasBaselineNwapprovalprocessResponseBody body;

    public static DeleteHasBaselineNwapprovalprocessResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasBaselineNwapprovalprocessResponse self = new DeleteHasBaselineNwapprovalprocessResponse();
        return TeaModel.build(map, self);
    }

    public DeleteHasBaselineNwapprovalprocessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteHasBaselineNwapprovalprocessResponse setBody(DeleteHasBaselineNwapprovalprocessResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteHasBaselineNwapprovalprocessResponseBody getBody() {
        return this.body;
    }

}
