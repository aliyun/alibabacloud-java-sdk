// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMqSofamqTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMqSofamqTopicResponseBody body;

    public static DeleteMqSofamqTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMqSofamqTopicResponse self = new DeleteMqSofamqTopicResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMqSofamqTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMqSofamqTopicResponse setBody(DeleteMqSofamqTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMqSofamqTopicResponseBody getBody() {
        return this.body;
    }

}
