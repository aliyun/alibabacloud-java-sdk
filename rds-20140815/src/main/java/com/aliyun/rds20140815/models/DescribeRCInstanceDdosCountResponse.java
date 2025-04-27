// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCInstanceDdosCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeRCInstanceDdosCountResponseBody body;

    public static DescribeRCInstanceDdosCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCInstanceDdosCountResponse self = new DescribeRCInstanceDdosCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRCInstanceDdosCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRCInstanceDdosCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeRCInstanceDdosCountResponse setBody(DescribeRCInstanceDdosCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRCInstanceDdosCountResponseBody getBody() {
        return this.body;
    }

}
