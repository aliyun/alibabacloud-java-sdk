// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarSubscribedStrategyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSoarSubscribedStrategyResponseBody body;

    public static DescribeSoarSubscribedStrategyResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarSubscribedStrategyResponse self = new DescribeSoarSubscribedStrategyResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarSubscribedStrategyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarSubscribedStrategyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarSubscribedStrategyResponse setBody(DescribeSoarSubscribedStrategyResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarSubscribedStrategyResponseBody getBody() {
        return this.body;
    }

}
