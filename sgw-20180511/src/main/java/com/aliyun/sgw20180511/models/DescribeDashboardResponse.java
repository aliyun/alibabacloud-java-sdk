// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DescribeDashboardResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDashboardResponseBody body;

    public static DescribeDashboardResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDashboardResponse self = new DescribeDashboardResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDashboardResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDashboardResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeDashboardResponse setBody(DescribeDashboardResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDashboardResponseBody getBody() {
        return this.body;
    }

}
