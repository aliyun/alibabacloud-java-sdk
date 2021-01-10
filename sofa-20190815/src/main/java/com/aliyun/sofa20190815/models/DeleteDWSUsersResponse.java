// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDWSUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDWSUsersResponseBody body;

    public static DeleteDWSUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDWSUsersResponse self = new DeleteDWSUsersResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDWSUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDWSUsersResponse setBody(DeleteDWSUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDWSUsersResponseBody getBody() {
        return this.body;
    }

}
