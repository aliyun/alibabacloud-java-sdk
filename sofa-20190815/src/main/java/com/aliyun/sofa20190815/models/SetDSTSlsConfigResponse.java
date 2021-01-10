// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetDSTSlsConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDSTSlsConfigResponseBody body;

    public static SetDSTSlsConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDSTSlsConfigResponse self = new SetDSTSlsConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetDSTSlsConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDSTSlsConfigResponse setBody(SetDSTSlsConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDSTSlsConfigResponseBody getBody() {
        return this.body;
    }

}
