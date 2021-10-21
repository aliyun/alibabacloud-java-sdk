// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class UpdateTrademarkNameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateTrademarkNameResponseBody body;

    public static UpdateTrademarkNameResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateTrademarkNameResponse self = new UpdateTrademarkNameResponse();
        return TeaModel.build(map, self);
    }

    public UpdateTrademarkNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateTrademarkNameResponse setBody(UpdateTrademarkNameResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateTrademarkNameResponseBody getBody() {
        return this.body;
    }

}
