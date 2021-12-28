// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeExtensionProviderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExtensionProviderResponseBody body;

    public static DescribeExtensionProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExtensionProviderResponse self = new DescribeExtensionProviderResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExtensionProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExtensionProviderResponse setBody(DescribeExtensionProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExtensionProviderResponseBody getBody() {
        return this.body;
    }

}
