// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsSummaryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePvtzStatisticsSummaryResponseBody body;

    public static DescribePvtzStatisticsSummaryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsSummaryResponse self = new DescribePvtzStatisticsSummaryResponse();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsSummaryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePvtzStatisticsSummaryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePvtzStatisticsSummaryResponse setBody(DescribePvtzStatisticsSummaryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePvtzStatisticsSummaryResponseBody getBody() {
        return this.body;
    }

}
