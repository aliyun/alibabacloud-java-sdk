// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class GetUserDatabasesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserDatabasesResponseBody body;

    public static GetUserDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserDatabasesResponse self = new GetUserDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public GetUserDatabasesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserDatabasesResponse setBody(GetUserDatabasesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserDatabasesResponseBody getBody() {
        return this.body;
    }

}
