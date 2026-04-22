// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class DescribePvtzStatisticsHistoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePvtzStatisticsHistoryResponseBody body;

    public static DescribePvtzStatisticsHistoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePvtzStatisticsHistoryResponse self = new DescribePvtzStatisticsHistoryResponse();
        return TeaModel.build(map, self);
    }

    public DescribePvtzStatisticsHistoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePvtzStatisticsHistoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePvtzStatisticsHistoryResponse setBody(DescribePvtzStatisticsHistoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePvtzStatisticsHistoryResponseBody getBody() {
        return this.body;
    }

}
