// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTaskResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSoarStrategyTaskResultResponseBody body;

    public static DescribeSoarStrategyTaskResultResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyTaskResultResponse self = new DescribeSoarStrategyTaskResultResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyTaskResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarStrategyTaskResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarStrategyTaskResultResponse setBody(DescribeSoarStrategyTaskResultResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarStrategyTaskResultResponseBody getBody() {
        return this.body;
    }

}
