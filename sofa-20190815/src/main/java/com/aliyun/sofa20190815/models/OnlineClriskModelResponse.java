// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OnlineClriskModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OnlineClriskModelResponseBody body;

    public static OnlineClriskModelResponse build(java.util.Map<String, ?> map) throws Exception {
        OnlineClriskModelResponse self = new OnlineClriskModelResponse();
        return TeaModel.build(map, self);
    }

    public OnlineClriskModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OnlineClriskModelResponse setBody(OnlineClriskModelResponseBody body) {
        this.body = body;
        return this;
    }
    public OnlineClriskModelResponseBody getBody() {
        return this.body;
    }

}
