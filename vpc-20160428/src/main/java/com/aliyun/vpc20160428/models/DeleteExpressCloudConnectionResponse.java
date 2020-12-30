// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteExpressCloudConnectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteExpressCloudConnectionResponseBody body;

    public static DeleteExpressCloudConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteExpressCloudConnectionResponse self = new DeleteExpressCloudConnectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteExpressCloudConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteExpressCloudConnectionResponse setBody(DeleteExpressCloudConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteExpressCloudConnectionResponseBody getBody() {
        return this.body;
    }

}
