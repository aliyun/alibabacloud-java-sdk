// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSuspiciousTargetConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OperateSuspiciousTargetConfigResponseBody body;

    public static OperateSuspiciousTargetConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        OperateSuspiciousTargetConfigResponse self = new OperateSuspiciousTargetConfigResponse();
        return TeaModel.build(map, self);
    }

    public OperateSuspiciousTargetConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OperateSuspiciousTargetConfigResponse setBody(OperateSuspiciousTargetConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public OperateSuspiciousTargetConfigResponseBody getBody() {
        return this.body;
    }

}
