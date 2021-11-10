// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class UserConfigQueryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UserConfigQueryResponseBody body;

    public static UserConfigQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        UserConfigQueryResponse self = new UserConfigQueryResponse();
        return TeaModel.build(map, self);
    }

    public UserConfigQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserConfigQueryResponse setBody(UserConfigQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public UserConfigQueryResponseBody getBody() {
        return this.body;
    }

}
