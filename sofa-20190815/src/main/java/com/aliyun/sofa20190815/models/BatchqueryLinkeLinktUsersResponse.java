// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryLinkeLinktUsersResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public BatchqueryLinkeLinktUsersResponseBody body;

    public static BatchqueryLinkeLinktUsersResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryLinkeLinktUsersResponse self = new BatchqueryLinkeLinktUsersResponse();
        return TeaModel.build(map, self);
    }

    public BatchqueryLinkeLinktUsersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchqueryLinkeLinktUsersResponse setBody(BatchqueryLinkeLinktUsersResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchqueryLinkeLinktUsersResponseBody getBody() {
        return this.body;
    }

}
