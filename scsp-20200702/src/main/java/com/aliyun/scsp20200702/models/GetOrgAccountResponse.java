// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class GetOrgAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOrgAccountResponseBody body;

    public static GetOrgAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrgAccountResponse self = new GetOrgAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetOrgAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrgAccountResponse setBody(GetOrgAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOrgAccountResponseBody getBody() {
        return this.body;
    }

}
