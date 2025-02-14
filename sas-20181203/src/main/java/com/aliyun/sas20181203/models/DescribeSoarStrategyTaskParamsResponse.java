// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSoarStrategyTaskParamsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSoarStrategyTaskParamsResponseBody body;

    public static DescribeSoarStrategyTaskParamsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSoarStrategyTaskParamsResponse self = new DescribeSoarStrategyTaskParamsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSoarStrategyTaskParamsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSoarStrategyTaskParamsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSoarStrategyTaskParamsResponse setBody(DescribeSoarStrategyTaskParamsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSoarStrategyTaskParamsResponseBody getBody() {
        return this.body;
    }

}
