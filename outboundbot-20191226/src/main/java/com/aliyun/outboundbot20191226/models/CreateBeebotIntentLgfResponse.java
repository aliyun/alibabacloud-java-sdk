// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateBeebotIntentLgfResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBeebotIntentLgfResponseBody body;

    public static CreateBeebotIntentLgfResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBeebotIntentLgfResponse self = new CreateBeebotIntentLgfResponse();
        return TeaModel.build(map, self);
    }

    public CreateBeebotIntentLgfResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBeebotIntentLgfResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBeebotIntentLgfResponse setBody(CreateBeebotIntentLgfResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBeebotIntentLgfResponseBody getBody() {
        return this.body;
    }

}
