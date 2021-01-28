// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeIntranetAttributeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeIntranetAttributeResponseBody body;

    public static DescribeIntranetAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeIntranetAttributeResponse self = new DescribeIntranetAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribeIntranetAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeIntranetAttributeResponse setBody(DescribeIntranetAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeIntranetAttributeResponseBody getBody() {
        return this.body;
    }

}
