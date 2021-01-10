// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcstagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcstagResponseBody body;

    public static GetLinkeBahamutVcstagResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcstagResponse self = new GetLinkeBahamutVcstagResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcstagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcstagResponse setBody(GetLinkeBahamutVcstagResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcstagResponseBody getBody() {
        return this.body;
    }

}
