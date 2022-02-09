// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsEndpointsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeOmsEndpointsV2ResponseBody body;

    public static DescribeOmsEndpointsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsEndpointsV2Response self = new DescribeOmsEndpointsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeOmsEndpointsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOmsEndpointsV2Response setBody(DescribeOmsEndpointsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOmsEndpointsV2ResponseBody getBody() {
        return this.body;
    }

}
