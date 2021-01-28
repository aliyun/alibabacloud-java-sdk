// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DeleteUserClusterHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteUserClusterHostResponseBody body;

    public static DeleteUserClusterHostResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteUserClusterHostResponse self = new DeleteUserClusterHostResponse();
        return TeaModel.build(map, self);
    }

    public DeleteUserClusterHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteUserClusterHostResponse setBody(DeleteUserClusterHostResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteUserClusterHostResponseBody getBody() {
        return this.body;
    }

}
