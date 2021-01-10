// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetDWSVpcAddrpoolResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetDWSVpcAddrpoolResponseBody body;

    public static GetDWSVpcAddrpoolResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDWSVpcAddrpoolResponse self = new GetDWSVpcAddrpoolResponse();
        return TeaModel.build(map, self);
    }

    public GetDWSVpcAddrpoolResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDWSVpcAddrpoolResponse setBody(GetDWSVpcAddrpoolResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDWSVpcAddrpoolResponseBody getBody() {
        return this.body;
    }

}
