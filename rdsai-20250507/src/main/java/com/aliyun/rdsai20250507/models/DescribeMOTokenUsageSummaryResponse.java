// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rdsai20250507.models;

import com.aliyun.tea.*;

public class DescribeMOTokenUsageSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeMOTokenUsageSummaryResponseBody body;

    public static DescribeMOTokenUsageSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeMOTokenUsageSummaryResponse self = new DescribeMOTokenUsageSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribeMOTokenUsageSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeMOTokenUsageSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeMOTokenUsageSummaryResponse setBody(DescribeMOTokenUsageSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeMOTokenUsageSummaryResponseBody getBody() {
        return this.body;
    }

}
