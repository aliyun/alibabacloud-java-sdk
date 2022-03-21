// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class OmaListTasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OmaListTasksResponseBody body;

    public static OmaListTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        OmaListTasksResponse self = new OmaListTasksResponse();
        return TeaModel.build(map, self);
    }

    public OmaListTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OmaListTasksResponse setBody(OmaListTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public OmaListTasksResponseBody getBody() {
        return this.body;
    }

}
