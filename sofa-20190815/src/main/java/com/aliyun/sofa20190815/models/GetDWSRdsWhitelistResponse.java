// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSRdsWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSRdsWhitelistResponseBody body;

    public static GetDWSRdsWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSRdsWhitelistResponse self = new GetDWSRdsWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSRdsWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSRdsWhitelistResponse setBody(GetDWSRdsWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSRdsWhitelistResponseBody getBody() {
        return this.body;
    }

}
