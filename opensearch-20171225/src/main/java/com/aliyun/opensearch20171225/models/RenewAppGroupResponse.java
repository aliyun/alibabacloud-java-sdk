// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class RenewAppGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RenewAppGroupResponseBody body;

    public static RenewAppGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewAppGroupResponse self = new RenewAppGroupResponse();
        return TeaModel.build(map, self);
    }

    public RenewAppGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewAppGroupResponse setBody(RenewAppGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewAppGroupResponseBody getBody() {
        return this.body;
    }

}
