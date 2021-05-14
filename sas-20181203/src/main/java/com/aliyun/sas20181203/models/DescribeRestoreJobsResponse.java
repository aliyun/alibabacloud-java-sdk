// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRestoreJobsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeRestoreJobsResponseBody body;

    public static DescribeRestoreJobsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeRestoreJobsResponse self = new DescribeRestoreJobsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeRestoreJobsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeRestoreJobsResponse setBody(DescribeRestoreJobsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeRestoreJobsResponseBody getBody() {
        return this.body;
    }

}
