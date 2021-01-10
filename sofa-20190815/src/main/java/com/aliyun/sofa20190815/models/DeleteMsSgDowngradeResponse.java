// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsSgDowngradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsSgDowngradeResponseBody body;

    public static DeleteMsSgDowngradeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsSgDowngradeResponse self = new DeleteMsSgDowngradeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsSgDowngradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsSgDowngradeResponse setBody(DeleteMsSgDowngradeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsSgDowngradeResponseBody getBody() {
        return this.body;
    }

}
