// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeRestorableTenantsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestorableTenantsResponseBody body;

    public static DescribeRestorableTenantsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestorableTenantsResponse self = new DescribeRestorableTenantsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestorableTenantsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestorableTenantsResponse setBody(DescribeRestorableTenantsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestorableTenantsResponseBody getBody() {
        return this.body;
    }

}
