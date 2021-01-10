// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSContainerservicesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSContainerservicesResponseBody body;

    public static DeleteAKSContainerservicesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSContainerservicesResponse self = new DeleteAKSContainerservicesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSContainerservicesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSContainerservicesResponse setBody(DeleteAKSContainerservicesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSContainerservicesResponseBody getBody() {
        return this.body;
    }

}
