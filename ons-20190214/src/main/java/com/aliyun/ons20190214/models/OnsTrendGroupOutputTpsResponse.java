// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTrendGroupOutputTpsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnsTrendGroupOutputTpsResponseBody body;

    public static OnsTrendGroupOutputTpsResponse build(java.util.Map<String, ?> map) throws Exception {
        OnsTrendGroupOutputTpsResponse self = new OnsTrendGroupOutputTpsResponse();
        return TeaModel.build(map, self);
    }

    public OnsTrendGroupOutputTpsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnsTrendGroupOutputTpsResponse setBody(OnsTrendGroupOutputTpsResponseBody body) {
        this.body = body;
        return this;
    }
    public OnsTrendGroupOutputTpsResponseBody getBody() {
        return this.body;
    }

}
