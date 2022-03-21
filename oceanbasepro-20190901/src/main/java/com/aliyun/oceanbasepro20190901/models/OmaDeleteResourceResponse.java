// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmaDeleteResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OmaDeleteResourceResponseBody body;

    public static OmaDeleteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        OmaDeleteResourceResponse self = new OmaDeleteResourceResponse();
        return TeaModel.build(map, self);
    }

    public OmaDeleteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OmaDeleteResourceResponse setBody(OmaDeleteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public OmaDeleteResourceResponseBody getBody() {
        return this.body;
    }

}
