// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetconfigbynameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutOpengetconfigbynameResponseBody body;

    public static GetLinkeBahamutOpengetconfigbynameResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetconfigbynameResponse self = new GetLinkeBahamutOpengetconfigbynameResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetconfigbynameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutOpengetconfigbynameResponse setBody(GetLinkeBahamutOpengetconfigbynameResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutOpengetconfigbynameResponseBody getBody() {
        return this.body;
    }

}
