// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResendMqSofamqDLQMessageByIdResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResendMqSofamqDLQMessageByIdResponseBody body;

    public static ResendMqSofamqDLQMessageByIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendMqSofamqDLQMessageByIdResponse self = new ResendMqSofamqDLQMessageByIdResponse();
        return TeaModel.build(map, self);
    }

    public ResendMqSofamqDLQMessageByIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResendMqSofamqDLQMessageByIdResponse setBody(ResendMqSofamqDLQMessageByIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ResendMqSofamqDLQMessageByIdResponseBody getBody() {
        return this.body;
    }

}
