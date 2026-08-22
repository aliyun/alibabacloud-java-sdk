// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeOpenSearchTopologyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeOpenSearchTopologyResponseBody body;

    public static DescribeOpenSearchTopologyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeOpenSearchTopologyResponse self = new DescribeOpenSearchTopologyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeOpenSearchTopologyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeOpenSearchTopologyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeOpenSearchTopologyResponse setBody(DescribeOpenSearchTopologyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeOpenSearchTopologyResponseBody getBody() {
        return this.body;
    }

}
