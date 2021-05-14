// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckEcsWarningsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCheckEcsWarningsResponseBody body;

    public static DescribeCheckEcsWarningsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckEcsWarningsResponse self = new DescribeCheckEcsWarningsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCheckEcsWarningsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCheckEcsWarningsResponse setBody(DescribeCheckEcsWarningsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCheckEcsWarningsResponseBody getBody() {
        return this.body;
    }

}
