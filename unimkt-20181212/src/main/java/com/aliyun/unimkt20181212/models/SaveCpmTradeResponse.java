// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class SaveCpmTradeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveCpmTradeResponseBody body;

    public static SaveCpmTradeResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveCpmTradeResponse self = new SaveCpmTradeResponse();
        return TeaModel.build(map, self);
    }

    public SaveCpmTradeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveCpmTradeResponse setBody(SaveCpmTradeResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveCpmTradeResponseBody getBody() {
        return this.body;
    }

}
