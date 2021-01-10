// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqDLQMessageByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMqSofamqDLQMessageByIdResponseBody body;

    public static GetMqSofamqDLQMessageByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqDLQMessageByIdResponse self = new GetMqSofamqDLQMessageByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqDLQMessageByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqSofamqDLQMessageByIdResponse setBody(GetMqSofamqDLQMessageByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqSofamqDLQMessageByIdResponseBody getBody() {
        return this.body;
    }

}
