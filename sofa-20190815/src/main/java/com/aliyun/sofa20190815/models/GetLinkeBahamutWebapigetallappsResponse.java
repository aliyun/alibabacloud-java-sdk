// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetallappsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutWebapigetallappsResponseBody body;

    public static GetLinkeBahamutWebapigetallappsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetallappsResponse self = new GetLinkeBahamutWebapigetallappsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetallappsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutWebapigetallappsResponse setBody(GetLinkeBahamutWebapigetallappsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutWebapigetallappsResponseBody getBody() {
        return this.body;
    }

}
