// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgDowngradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMsSgDowngradeResponseBody body;

    public static EnableMsSgDowngradeResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgDowngradeResponse self = new EnableMsSgDowngradeResponse();
        return TeaModel.build(map, self);
    }

    public EnableMsSgDowngradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMsSgDowngradeResponse setBody(EnableMsSgDowngradeResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMsSgDowngradeResponseBody getBody() {
        return this.body;
    }

}
