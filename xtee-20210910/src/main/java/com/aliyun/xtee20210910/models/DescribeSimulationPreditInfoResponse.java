// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSimulationPreditInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSimulationPreditInfoResponseBody body;

    public static DescribeSimulationPreditInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimulationPreditInfoResponse self = new DescribeSimulationPreditInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSimulationPreditInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSimulationPreditInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSimulationPreditInfoResponse setBody(DescribeSimulationPreditInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSimulationPreditInfoResponseBody getBody() {
        return this.body;
    }

}
