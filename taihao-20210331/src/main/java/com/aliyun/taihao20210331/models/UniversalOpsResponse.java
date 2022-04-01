// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class UniversalOpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UniversalOpsResponseBody body;

    public static UniversalOpsResponse build(java.util.Map<String, ?> map) throws Exception {
        UniversalOpsResponse self = new UniversalOpsResponse();
        return TeaModel.build(map, self);
    }

    public UniversalOpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UniversalOpsResponse setBody(UniversalOpsResponseBody body) {
        this.body = body;
        return this;
    }
    public UniversalOpsResponseBody getBody() {
        return this.body;
    }

}
