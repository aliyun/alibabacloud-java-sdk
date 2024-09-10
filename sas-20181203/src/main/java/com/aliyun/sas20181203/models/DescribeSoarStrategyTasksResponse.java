// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTasksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSoarStrategyTasksResponseBody body;

    public static DescribeSoarStrategyTasksResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyTasksResponse self = new DescribeSoarStrategyTasksResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyTasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarStrategyTasksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarStrategyTasksResponse setBody(DescribeSoarStrategyTasksResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarStrategyTasksResponseBody getBody() {
        return this.body;
    }

}
