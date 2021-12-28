// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeCrTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCrTemplatesResponseBody body;

    public static DescribeCrTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrTemplatesResponse self = new DescribeCrTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrTemplatesResponse setBody(DescribeCrTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrTemplatesResponseBody getBody() {
        return this.body;
    }

}
