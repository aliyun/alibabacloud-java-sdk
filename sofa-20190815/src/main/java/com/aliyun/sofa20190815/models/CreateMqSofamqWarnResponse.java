// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateMqSofamqWarnResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMqSofamqWarnResponseBody body;

    public static CreateMqSofamqWarnResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMqSofamqWarnResponse self = new CreateMqSofamqWarnResponse();
        return TeaModel.build(map, self);
    }

    public CreateMqSofamqWarnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMqSofamqWarnResponse setBody(CreateMqSofamqWarnResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMqSofamqWarnResponseBody getBody() {
        return this.body;
    }

}
