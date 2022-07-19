// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateMqSofamqTopicResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMqSofamqTopicResponseBody body;

    public static CreateMqSofamqTopicResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMqSofamqTopicResponse self = new CreateMqSofamqTopicResponse();
        return TeaModel.build(map, self);
    }

    public CreateMqSofamqTopicResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMqSofamqTopicResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMqSofamqTopicResponse setBody(CreateMqSofamqTopicResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMqSofamqTopicResponseBody getBody() {
        return this.body;
    }

}
