// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableMsSgDowngradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableMsSgDowngradeResponseBody body;

    public static DisableMsSgDowngradeResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableMsSgDowngradeResponse self = new DisableMsSgDowngradeResponse();
        return TeaModel.build(map, self);
    }

    public DisableMsSgDowngradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableMsSgDowngradeResponse setBody(DisableMsSgDowngradeResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableMsSgDowngradeResponseBody getBody() {
        return this.body;
    }

}
