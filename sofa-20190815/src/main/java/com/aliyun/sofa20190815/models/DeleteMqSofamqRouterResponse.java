// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMqSofamqRouterResponseBody body;

    public static DeleteMqSofamqRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqRouterResponse self = new DeleteMqSofamqRouterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMqSofamqRouterResponse setBody(DeleteMqSofamqRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMqSofamqRouterResponseBody getBody() {
        return this.body;
    }

}
