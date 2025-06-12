// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteBeebotIntentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteBeebotIntentResponseBody body;

    public static DeleteBeebotIntentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBeebotIntentResponse self = new DeleteBeebotIntentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBeebotIntentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBeebotIntentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBeebotIntentResponse setBody(DeleteBeebotIntentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBeebotIntentResponseBody getBody() {
        return this.body;
    }

}
