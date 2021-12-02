// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CompletePhysicalConnectionLOAResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CompletePhysicalConnectionLOAResponseBody body;

    public static CompletePhysicalConnectionLOAResponse build(java.util.Map<String, ?> map) throws Exception {
        CompletePhysicalConnectionLOAResponse self = new CompletePhysicalConnectionLOAResponse();
        return TeaModel.build(map, self);
    }

    public CompletePhysicalConnectionLOAResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompletePhysicalConnectionLOAResponse setBody(CompletePhysicalConnectionLOAResponseBody body) {
        this.body = body;
        return this;
    }
    public CompletePhysicalConnectionLOAResponseBody getBody() {
        return this.body;
    }

}
