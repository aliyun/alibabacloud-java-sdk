// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class TransferToThirdCallResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public TransferToThirdCallResponseBody body;

    public static TransferToThirdCallResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferToThirdCallResponse self = new TransferToThirdCallResponse();
        return TeaModel.build(map, self);
    }

    public TransferToThirdCallResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferToThirdCallResponse setBody(TransferToThirdCallResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferToThirdCallResponseBody getBody() {
        return this.body;
    }

}
