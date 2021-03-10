// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ConsumeMediaResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ConsumeMediaResourcePackageResponseBody body;

    public static ConsumeMediaResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        ConsumeMediaResourcePackageResponse self = new ConsumeMediaResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public ConsumeMediaResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConsumeMediaResourcePackageResponse setBody(ConsumeMediaResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public ConsumeMediaResourcePackageResponseBody getBody() {
        return this.body;
    }

}
