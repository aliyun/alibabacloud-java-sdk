// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class RemoveCloudAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveCloudAccountResponseBody body;

    public static RemoveCloudAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveCloudAccountResponse self = new RemoveCloudAccountResponse();
        return TeaModel.build(map, self);
    }

    public RemoveCloudAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveCloudAccountResponse setBody(RemoveCloudAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveCloudAccountResponseBody getBody() {
        return this.body;
    }

}
