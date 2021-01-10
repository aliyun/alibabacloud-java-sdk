// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskSubscriberResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClriskSubscriberResponseBody body;

    public static DeleteClriskSubscriberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskSubscriberResponse self = new DeleteClriskSubscriberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClriskSubscriberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClriskSubscriberResponse setBody(DeleteClriskSubscriberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClriskSubscriberResponseBody getBody() {
        return this.body;
    }

}
