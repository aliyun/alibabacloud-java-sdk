// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreHcCheckWarningsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public IgnoreHcCheckWarningsResponseBody body;

    public static IgnoreHcCheckWarningsResponse build(java.util.Map<String, ?> map) throws Exception {
        IgnoreHcCheckWarningsResponse self = new IgnoreHcCheckWarningsResponse();
        return TeaModel.build(map, self);
    }

    public IgnoreHcCheckWarningsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public IgnoreHcCheckWarningsResponse setBody(IgnoreHcCheckWarningsResponseBody body) {
        this.body = body;
        return this;
    }
    public IgnoreHcCheckWarningsResponseBody getBody() {
        return this.body;
    }

}
