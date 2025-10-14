// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeComponentPropetiesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeComponentPropetiesResponseBody body;

    public static DescribeComponentPropetiesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeComponentPropetiesResponse self = new DescribeComponentPropetiesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeComponentPropetiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeComponentPropetiesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeComponentPropetiesResponse setBody(DescribeComponentPropetiesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeComponentPropetiesResponseBody getBody() {
        return this.body;
    }

}
