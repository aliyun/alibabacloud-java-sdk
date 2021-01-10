// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ResendMqSofamqDLQMessageBatchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ResendMqSofamqDLQMessageBatchResponseBody body;

    public static ResendMqSofamqDLQMessageBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        ResendMqSofamqDLQMessageBatchResponse self = new ResendMqSofamqDLQMessageBatchResponse();
        return TeaModel.build(map, self);
    }

    public ResendMqSofamqDLQMessageBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResendMqSofamqDLQMessageBatchResponse setBody(ResendMqSofamqDLQMessageBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public ResendMqSofamqDLQMessageBatchResponseBody getBody() {
        return this.body;
    }

}
