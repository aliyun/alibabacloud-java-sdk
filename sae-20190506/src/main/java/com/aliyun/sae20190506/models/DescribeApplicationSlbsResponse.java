// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeApplicationSlbsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeApplicationSlbsResponseBody body;

    public static DescribeApplicationSlbsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationSlbsResponse self = new DescribeApplicationSlbsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationSlbsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeApplicationSlbsResponse setBody(DescribeApplicationSlbsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeApplicationSlbsResponseBody getBody() {
        return this.body;
    }

}
