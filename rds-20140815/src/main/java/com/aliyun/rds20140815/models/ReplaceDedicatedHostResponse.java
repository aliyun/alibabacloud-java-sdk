// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ReplaceDedicatedHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ReplaceDedicatedHostResponseBody body;

    public static ReplaceDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ReplaceDedicatedHostResponse self = new ReplaceDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

    public ReplaceDedicatedHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReplaceDedicatedHostResponse setBody(ReplaceDedicatedHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ReplaceDedicatedHostResponseBody getBody() {
        return this.body;
    }

}
