// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetrelatelterationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutOpengetrelatelterationResponseBody body;

    public static GetLinkeBahamutOpengetrelatelterationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetrelatelterationResponse self = new GetLinkeBahamutOpengetrelatelterationResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetrelatelterationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutOpengetrelatelterationResponse setBody(GetLinkeBahamutOpengetrelatelterationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutOpengetrelatelterationResponseBody getBody() {
        return this.body;
    }

}
