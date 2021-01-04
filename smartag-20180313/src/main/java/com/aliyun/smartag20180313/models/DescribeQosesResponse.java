// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeQosesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeQosesResponseBody body;

    public static DescribeQosesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeQosesResponse self = new DescribeQosesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeQosesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeQosesResponse setBody(DescribeQosesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeQosesResponseBody getBody() {
        return this.body;
    }

}
