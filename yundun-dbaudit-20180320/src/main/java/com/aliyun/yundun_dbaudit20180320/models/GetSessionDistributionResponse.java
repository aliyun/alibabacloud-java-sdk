// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetSessionDistributionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetSessionDistributionResponseBody body;

    public static GetSessionDistributionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSessionDistributionResponse self = new GetSessionDistributionResponse();
        return TeaModel.build(map, self);
    }

    public GetSessionDistributionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSessionDistributionResponse setBody(GetSessionDistributionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSessionDistributionResponseBody getBody() {
        return this.body;
    }

}
