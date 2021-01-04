// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quotas20200510.models;

import com.aliyun.tea.*;

public class GetQuotaApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetQuotaApplicationResponseBody body;

    public static GetQuotaApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetQuotaApplicationResponse self = new GetQuotaApplicationResponse();
        return TeaModel.build(map, self);
    }

    public GetQuotaApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetQuotaApplicationResponse setBody(GetQuotaApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetQuotaApplicationResponseBody getBody() {
        return this.body;
    }

}
