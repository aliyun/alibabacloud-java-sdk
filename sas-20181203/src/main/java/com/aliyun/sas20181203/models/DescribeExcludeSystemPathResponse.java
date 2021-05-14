// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExcludeSystemPathResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeExcludeSystemPathResponseBody body;

    public static DescribeExcludeSystemPathResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeExcludeSystemPathResponse self = new DescribeExcludeSystemPathResponse();
        return TeaModel.build(map, self);
    }

    public DescribeExcludeSystemPathResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeExcludeSystemPathResponse setBody(DescribeExcludeSystemPathResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeExcludeSystemPathResponseBody getBody() {
        return this.body;
    }

}
