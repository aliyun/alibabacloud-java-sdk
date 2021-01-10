// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutServernotificationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutServernotificationResponseBody body;

    public static GetLinkeBahamutServernotificationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutServernotificationResponse self = new GetLinkeBahamutServernotificationResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutServernotificationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutServernotificationResponse setBody(GetLinkeBahamutServernotificationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutServernotificationResponseBody getBody() {
        return this.body;
    }

}
