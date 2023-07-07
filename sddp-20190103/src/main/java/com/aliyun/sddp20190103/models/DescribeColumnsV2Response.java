// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeColumnsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeColumnsV2ResponseBody body;

    public static DescribeColumnsV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeColumnsV2Response self = new DescribeColumnsV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeColumnsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeColumnsV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeColumnsV2Response setBody(DescribeColumnsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeColumnsV2ResponseBody getBody() {
        return this.body;
    }

}
