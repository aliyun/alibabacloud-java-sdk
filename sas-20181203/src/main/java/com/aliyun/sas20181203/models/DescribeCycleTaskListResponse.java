// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCycleTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCycleTaskListResponseBody body;

    public static DescribeCycleTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCycleTaskListResponse self = new DescribeCycleTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCycleTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCycleTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCycleTaskListResponse setBody(DescribeCycleTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCycleTaskListResponseBody getBody() {
        return this.body;
    }

}
