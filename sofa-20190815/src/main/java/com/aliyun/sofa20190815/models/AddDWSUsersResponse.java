// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddDWSUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddDWSUsersResponseBody body;

    public static AddDWSUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        AddDWSUsersResponse self = new AddDWSUsersResponse();
        return TeaModel.build(map, self);
    }

    public AddDWSUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddDWSUsersResponse setBody(AddDWSUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public AddDWSUsersResponseBody getBody() {
        return this.body;
    }

}
