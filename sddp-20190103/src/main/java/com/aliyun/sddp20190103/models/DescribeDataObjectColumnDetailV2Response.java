// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataObjectColumnDetailV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDataObjectColumnDetailV2ResponseBody body;

    public static DescribeDataObjectColumnDetailV2Response build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataObjectColumnDetailV2Response self = new DescribeDataObjectColumnDetailV2Response();
        return TeaModel.build(map, self);
    }

    public DescribeDataObjectColumnDetailV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDataObjectColumnDetailV2Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDataObjectColumnDetailV2Response setBody(DescribeDataObjectColumnDetailV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDataObjectColumnDetailV2ResponseBody getBody() {
        return this.body;
    }

}
