// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSimulationTaskCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSimulationTaskCountResponseBody body;

    public static DescribeSimulationTaskCountResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimulationTaskCountResponse self = new DescribeSimulationTaskCountResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSimulationTaskCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSimulationTaskCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSimulationTaskCountResponse setBody(DescribeSimulationTaskCountResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSimulationTaskCountResponseBody getBody() {
        return this.body;
    }

}
