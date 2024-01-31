// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeScanTaskStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeScanTaskStatisticsResponseBody body;

    public static DescribeScanTaskStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeScanTaskStatisticsResponse self = new DescribeScanTaskStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeScanTaskStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeScanTaskStatisticsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeScanTaskStatisticsResponse setBody(DescribeScanTaskStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeScanTaskStatisticsResponseBody getBody() {
        return this.body;
    }

}
