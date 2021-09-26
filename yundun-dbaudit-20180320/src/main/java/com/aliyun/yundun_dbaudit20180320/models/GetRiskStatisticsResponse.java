// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetRiskStatisticsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRiskStatisticsResponseBody body;

    public static GetRiskStatisticsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskStatisticsResponse self = new GetRiskStatisticsResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskStatisticsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskStatisticsResponse setBody(GetRiskStatisticsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskStatisticsResponseBody getBody() {
        return this.body;
    }

}
