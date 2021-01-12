// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ClearDedicatedHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ClearDedicatedHostResponseBody body;

    public static ClearDedicatedHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ClearDedicatedHostResponse self = new ClearDedicatedHostResponse();
        return TeaModel.build(map, self);
    }

    public ClearDedicatedHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ClearDedicatedHostResponse setBody(ClearDedicatedHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ClearDedicatedHostResponseBody getBody() {
        return this.body;
    }

}
