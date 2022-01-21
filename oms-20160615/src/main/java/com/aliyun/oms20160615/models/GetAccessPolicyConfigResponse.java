// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oms20160615.models;

import com.aliyun.tea.*;

public class GetAccessPolicyConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAccessPolicyConfigResponseBody body;

    public static GetAccessPolicyConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAccessPolicyConfigResponse self = new GetAccessPolicyConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetAccessPolicyConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAccessPolicyConfigResponse setBody(GetAccessPolicyConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAccessPolicyConfigResponseBody getBody() {
        return this.body;
    }

}
