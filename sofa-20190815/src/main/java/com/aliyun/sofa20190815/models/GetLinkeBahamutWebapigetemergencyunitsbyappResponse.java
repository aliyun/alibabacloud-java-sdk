// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutWebapigetemergencyunitsbyappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutWebapigetemergencyunitsbyappResponseBody body;

    public static GetLinkeBahamutWebapigetemergencyunitsbyappResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutWebapigetemergencyunitsbyappResponse self = new GetLinkeBahamutWebapigetemergencyunitsbyappResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutWebapigetemergencyunitsbyappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutWebapigetemergencyunitsbyappResponse setBody(GetLinkeBahamutWebapigetemergencyunitsbyappResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutWebapigetemergencyunitsbyappResponseBody getBody() {
        return this.body;
    }

}
