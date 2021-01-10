// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetlterationunitResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutOpengetlterationunitResponseBody body;

    public static GetLinkeBahamutOpengetlterationunitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetlterationunitResponse self = new GetLinkeBahamutOpengetlterationunitResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetlterationunitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutOpengetlterationunitResponse setBody(GetLinkeBahamutOpengetlterationunitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutOpengetlterationunitResponseBody getBody() {
        return this.body;
    }

}
