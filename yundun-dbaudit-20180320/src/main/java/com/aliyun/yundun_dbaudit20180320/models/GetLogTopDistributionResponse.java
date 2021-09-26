// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetLogTopDistributionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLogTopDistributionResponseBody body;

    public static GetLogTopDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogTopDistributionResponse self = new GetLogTopDistributionResponse();
        return TeaModel.build(map, self);
    }

    public GetLogTopDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogTopDistributionResponse setBody(GetLogTopDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLogTopDistributionResponseBody getBody() {
        return this.body;
    }

}
