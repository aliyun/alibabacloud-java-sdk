// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeSimulationTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSimulationTaskListResponseBody body;

    public static DescribeSimulationTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSimulationTaskListResponse self = new DescribeSimulationTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSimulationTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSimulationTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSimulationTaskListResponse setBody(DescribeSimulationTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSimulationTaskListResponseBody getBody() {
        return this.body;
    }

}
