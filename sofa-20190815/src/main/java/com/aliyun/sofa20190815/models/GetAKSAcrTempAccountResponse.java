// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSAcrTempAccountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSAcrTempAccountResponseBody body;

    public static GetAKSAcrTempAccountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSAcrTempAccountResponse self = new GetAKSAcrTempAccountResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSAcrTempAccountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSAcrTempAccountResponse setBody(GetAKSAcrTempAccountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSAcrTempAccountResponseBody getBody() {
        return this.body;
    }

}
