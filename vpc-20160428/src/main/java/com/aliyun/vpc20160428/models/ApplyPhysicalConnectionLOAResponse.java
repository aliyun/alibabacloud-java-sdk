// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ApplyPhysicalConnectionLOAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ApplyPhysicalConnectionLOAResponseBody body;

    public static ApplyPhysicalConnectionLOAResponse build(java.util.Map<String, ?> map) throws Exception {
        ApplyPhysicalConnectionLOAResponse self = new ApplyPhysicalConnectionLOAResponse();
        return TeaModel.build(map, self);
    }

    public ApplyPhysicalConnectionLOAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ApplyPhysicalConnectionLOAResponse setBody(ApplyPhysicalConnectionLOAResponseBody body) {
        this.body = body;
        return this;
    }
    public ApplyPhysicalConnectionLOAResponseBody getBody() {
        return this.body;
    }

}
