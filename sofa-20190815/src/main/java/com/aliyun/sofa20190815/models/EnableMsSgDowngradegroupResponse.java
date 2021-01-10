// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableMsSgDowngradegroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableMsSgDowngradegroupResponseBody body;

    public static EnableMsSgDowngradegroupResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableMsSgDowngradegroupResponse self = new EnableMsSgDowngradegroupResponse();
        return TeaModel.build(map, self);
    }

    public EnableMsSgDowngradegroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableMsSgDowngradegroupResponse setBody(EnableMsSgDowngradegroupResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableMsSgDowngradegroupResponseBody getBody() {
        return this.body;
    }

}
