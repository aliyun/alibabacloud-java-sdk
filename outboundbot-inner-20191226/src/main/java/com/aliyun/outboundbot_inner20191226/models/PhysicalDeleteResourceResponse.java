// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot_inner20191226.models;

import com.aliyun.tea.*;

public class PhysicalDeleteResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public PhysicalDeleteResourceResponseBody body;

    public static PhysicalDeleteResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        PhysicalDeleteResourceResponse self = new PhysicalDeleteResourceResponse();
        return TeaModel.build(map, self);
    }

    public PhysicalDeleteResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PhysicalDeleteResourceResponse setBody(PhysicalDeleteResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public PhysicalDeleteResourceResponseBody getBody() {
        return this.body;
    }

}
