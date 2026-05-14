// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawTaskResponseBody body;

    public static DescribePolarClawTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawTaskResponse self = new DescribePolarClawTaskResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawTaskResponse setBody(DescribePolarClawTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawTaskResponseBody getBody() {
        return this.body;
    }

}
