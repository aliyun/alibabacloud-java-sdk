// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.savingplan20200715.models;

import com.aliyun.tea.*;

public class CompleteTradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompleteTradeResponseBody body;

    public static CompleteTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteTradeResponse self = new CompleteTradeResponse();
        return TeaModel.build(map, self);
    }

    public CompleteTradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteTradeResponse setBody(CompleteTradeResponseBody body) {
        this.body = body;
        return this;
    }
    public CompleteTradeResponseBody getBody() {
        return this.body;
    }

}
