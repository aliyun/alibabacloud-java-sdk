// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsbranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsbranchResponseBody body;

    public static GetLinkeBahamutVcsbranchResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsbranchResponse self = new GetLinkeBahamutVcsbranchResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsbranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsbranchResponse setBody(GetLinkeBahamutVcsbranchResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsbranchResponseBody getBody() {
        return this.body;
    }

}
