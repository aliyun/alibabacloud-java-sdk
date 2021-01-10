// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DisableDSTAppBizLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DisableDSTAppBizLogResponseBody body;

    public static DisableDSTAppBizLogResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableDSTAppBizLogResponse self = new DisableDSTAppBizLogResponse();
        return TeaModel.build(map, self);
    }

    public DisableDSTAppBizLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableDSTAppBizLogResponse setBody(DisableDSTAppBizLogResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableDSTAppBizLogResponseBody getBody() {
        return this.body;
    }

}
