// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBeebotIntentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBeebotIntentResponseBody body;

    public static CreateBeebotIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBeebotIntentResponse self = new CreateBeebotIntentResponse();
        return TeaModel.build(map, self);
    }

    public CreateBeebotIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBeebotIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBeebotIntentResponse setBody(CreateBeebotIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBeebotIntentResponseBody getBody() {
        return this.body;
    }

}
