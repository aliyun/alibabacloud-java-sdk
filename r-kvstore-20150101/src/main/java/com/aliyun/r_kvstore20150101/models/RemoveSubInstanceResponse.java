// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RemoveSubInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveSubInstanceResponseBody body;

    public static RemoveSubInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSubInstanceResponse self = new RemoveSubInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSubInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSubInstanceResponse setBody(RemoveSubInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSubInstanceResponseBody getBody() {
        return this.body;
    }

}
