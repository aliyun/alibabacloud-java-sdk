// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DenySupplementResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DenySupplementResponseBody body;

    public static DenySupplementResponse build(java.util.Map<String, ?> map) throws Exception {
        DenySupplementResponse self = new DenySupplementResponse();
        return TeaModel.build(map, self);
    }

    public DenySupplementResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DenySupplementResponse setBody(DenySupplementResponseBody body) {
        this.body = body;
        return this;
    }
    public DenySupplementResponseBody getBody() {
        return this.body;
    }

}
