// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeCronJobPolicyServerlessResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCronJobPolicyServerlessResponseBody body;

    public static DescribeCronJobPolicyServerlessResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCronJobPolicyServerlessResponse self = new DescribeCronJobPolicyServerlessResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCronJobPolicyServerlessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCronJobPolicyServerlessResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCronJobPolicyServerlessResponse setBody(DescribeCronJobPolicyServerlessResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCronJobPolicyServerlessResponseBody getBody() {
        return this.body;
    }

}
