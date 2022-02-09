// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmaSubmitTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OmaSubmitTaskResponseBody body;

    public static OmaSubmitTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        OmaSubmitTaskResponse self = new OmaSubmitTaskResponse();
        return TeaModel.build(map, self);
    }

    public OmaSubmitTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OmaSubmitTaskResponse setBody(OmaSubmitTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public OmaSubmitTaskResponseBody getBody() {
        return this.body;
    }

}
