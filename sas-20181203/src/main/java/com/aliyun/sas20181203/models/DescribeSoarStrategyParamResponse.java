// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSoarStrategyParamResponseBody body;

    public static DescribeSoarStrategyParamResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyParamResponse self = new DescribeSoarStrategyParamResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarStrategyParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarStrategyParamResponse setBody(DescribeSoarStrategyParamResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarStrategyParamResponseBody getBody() {
        return this.body;
    }

}
