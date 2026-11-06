// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsPerformanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarFsPerformanceResponseBody body;

    public static DescribePolarFsPerformanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsPerformanceResponse self = new DescribePolarFsPerformanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsPerformanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarFsPerformanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarFsPerformanceResponse setBody(DescribePolarFsPerformanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarFsPerformanceResponseBody getBody() {
        return this.body;
    }

}
