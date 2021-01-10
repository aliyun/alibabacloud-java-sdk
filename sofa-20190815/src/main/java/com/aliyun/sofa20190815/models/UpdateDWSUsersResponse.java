// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateDWSUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateDWSUsersResponseBody body;

    public static UpdateDWSUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDWSUsersResponse self = new UpdateDWSUsersResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDWSUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDWSUsersResponse setBody(UpdateDWSUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDWSUsersResponseBody getBody() {
        return this.body;
    }

}
