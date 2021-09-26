// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class GetDasUsageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDasUsageResponseBody body;

    public static GetDasUsageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDasUsageResponse self = new GetDasUsageResponse();
        return TeaModel.build(map, self);
    }

    public GetDasUsageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDasUsageResponse setBody(GetDasUsageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDasUsageResponseBody getBody() {
        return this.body;
    }

}
