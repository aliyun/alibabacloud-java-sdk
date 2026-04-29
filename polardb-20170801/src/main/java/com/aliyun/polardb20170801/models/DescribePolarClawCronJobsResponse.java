// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawCronJobsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawCronJobsResponseBody body;

    public static DescribePolarClawCronJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawCronJobsResponse self = new DescribePolarClawCronJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawCronJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawCronJobsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawCronJobsResponse setBody(DescribePolarClawCronJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawCronJobsResponseBody getBody() {
        return this.body;
    }

}
