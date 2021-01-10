// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateMqSofamqRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateMqSofamqRouterResponseBody body;

    public static UpdateMqSofamqRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMqSofamqRouterResponse self = new UpdateMqSofamqRouterResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMqSofamqRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMqSofamqRouterResponse setBody(UpdateMqSofamqRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMqSofamqRouterResponseBody getBody() {
        return this.body;
    }

}
