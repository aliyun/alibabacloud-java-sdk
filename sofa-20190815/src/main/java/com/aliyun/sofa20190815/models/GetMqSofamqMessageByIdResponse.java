// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqMessageByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMqSofamqMessageByIdResponseBody body;

    public static GetMqSofamqMessageByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqMessageByIdResponse self = new GetMqSofamqMessageByIdResponse();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqMessageByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMqSofamqMessageByIdResponse setBody(GetMqSofamqMessageByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMqSofamqMessageByIdResponseBody getBody() {
        return this.body;
    }

}
