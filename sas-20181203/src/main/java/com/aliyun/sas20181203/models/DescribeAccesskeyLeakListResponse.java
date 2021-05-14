// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAccesskeyLeakListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeAccesskeyLeakListResponseBody body;

    public static DescribeAccesskeyLeakListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccesskeyLeakListResponse self = new DescribeAccesskeyLeakListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeAccesskeyLeakListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeAccesskeyLeakListResponse setBody(DescribeAccesskeyLeakListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeAccesskeyLeakListResponseBody getBody() {
        return this.body;
    }

}
