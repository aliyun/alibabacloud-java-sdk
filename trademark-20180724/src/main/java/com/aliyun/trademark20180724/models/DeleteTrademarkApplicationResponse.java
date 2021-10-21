// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class DeleteTrademarkApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTrademarkApplicationResponseBody body;

    public static DeleteTrademarkApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTrademarkApplicationResponse self = new DeleteTrademarkApplicationResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTrademarkApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTrademarkApplicationResponse setBody(DeleteTrademarkApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTrademarkApplicationResponseBody getBody() {
        return this.body;
    }

}
