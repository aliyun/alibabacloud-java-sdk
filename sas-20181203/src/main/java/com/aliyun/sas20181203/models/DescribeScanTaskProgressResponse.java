// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskProgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeScanTaskProgressResponseBody body;

    public static DescribeScanTaskProgressResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskProgressResponse self = new DescribeScanTaskProgressResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskProgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScanTaskProgressResponse setBody(DescribeScanTaskProgressResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScanTaskProgressResponseBody getBody() {
        return this.body;
    }

}
