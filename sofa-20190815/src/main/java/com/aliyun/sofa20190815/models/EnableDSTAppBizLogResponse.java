// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class EnableDSTAppBizLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableDSTAppBizLogResponseBody body;

    public static EnableDSTAppBizLogResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableDSTAppBizLogResponse self = new EnableDSTAppBizLogResponse();
        return TeaModel.build(map, self);
    }

    public EnableDSTAppBizLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableDSTAppBizLogResponse setBody(EnableDSTAppBizLogResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableDSTAppBizLogResponseBody getBody() {
        return this.body;
    }

}
