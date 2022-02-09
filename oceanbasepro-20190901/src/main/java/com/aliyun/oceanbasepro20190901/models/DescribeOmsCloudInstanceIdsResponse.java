// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsCloudInstanceIdsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOmsCloudInstanceIdsResponseBody body;

    public static DescribeOmsCloudInstanceIdsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsCloudInstanceIdsResponse self = new DescribeOmsCloudInstanceIdsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOmsCloudInstanceIdsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsCloudInstanceIdsResponse setBody(DescribeOmsCloudInstanceIdsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsCloudInstanceIdsResponseBody getBody() {
        return this.body;
    }

}
