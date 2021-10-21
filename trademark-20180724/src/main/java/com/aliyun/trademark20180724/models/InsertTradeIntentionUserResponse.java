// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class InsertTradeIntentionUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InsertTradeIntentionUserResponseBody body;

    public static InsertTradeIntentionUserResponse build(java.util.Map<String, ?> map) throws Exception {
        InsertTradeIntentionUserResponse self = new InsertTradeIntentionUserResponse();
        return TeaModel.build(map, self);
    }

    public InsertTradeIntentionUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InsertTradeIntentionUserResponse setBody(InsertTradeIntentionUserResponseBody body) {
        this.body = body;
        return this;
    }
    public InsertTradeIntentionUserResponseBody getBody() {
        return this.body;
    }

}
