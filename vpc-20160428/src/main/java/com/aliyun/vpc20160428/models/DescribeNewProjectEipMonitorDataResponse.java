// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeNewProjectEipMonitorDataResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeNewProjectEipMonitorDataResponseBody body;

    public static DescribeNewProjectEipMonitorDataResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeNewProjectEipMonitorDataResponse self = new DescribeNewProjectEipMonitorDataResponse();
        return TeaModel.build(map, self);
    }

    public DescribeNewProjectEipMonitorDataResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeNewProjectEipMonitorDataResponse setBody(DescribeNewProjectEipMonitorDataResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeNewProjectEipMonitorDataResponseBody getBody() {
        return this.body;
    }

}
