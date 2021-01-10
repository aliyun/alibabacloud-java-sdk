// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SetDWSConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SetDWSConfigResponseBody body;

    public static SetDWSConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDWSConfigResponse self = new SetDWSConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetDWSConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDWSConfigResponse setBody(SetDWSConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDWSConfigResponseBody getBody() {
        return this.body;
    }

}
