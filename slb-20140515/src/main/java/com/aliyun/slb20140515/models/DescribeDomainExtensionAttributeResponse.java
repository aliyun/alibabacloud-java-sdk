// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DescribeDomainExtensionAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDomainExtensionAttributeResponseBody body;

    public static DescribeDomainExtensionAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainExtensionAttributeResponse self = new DescribeDomainExtensionAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDomainExtensionAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDomainExtensionAttributeResponse setBody(DescribeDomainExtensionAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDomainExtensionAttributeResponseBody getBody() {
        return this.body;
    }

}
