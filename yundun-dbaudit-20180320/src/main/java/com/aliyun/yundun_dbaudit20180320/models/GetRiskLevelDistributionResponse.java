// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetRiskLevelDistributionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetRiskLevelDistributionResponseBody body;

    public static GetRiskLevelDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRiskLevelDistributionResponse self = new GetRiskLevelDistributionResponse();
        return TeaModel.build(map, self);
    }

    public GetRiskLevelDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRiskLevelDistributionResponse setBody(GetRiskLevelDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRiskLevelDistributionResponseBody getBody() {
        return this.body;
    }

}
