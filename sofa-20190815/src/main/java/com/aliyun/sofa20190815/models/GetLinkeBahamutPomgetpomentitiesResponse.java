// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutPomgetpomentitiesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutPomgetpomentitiesResponseBody body;

    public static GetLinkeBahamutPomgetpomentitiesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutPomgetpomentitiesResponse self = new GetLinkeBahamutPomgetpomentitiesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutPomgetpomentitiesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutPomgetpomentitiesResponse setBody(GetLinkeBahamutPomgetpomentitiesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutPomgetpomentitiesResponseBody getBody() {
        return this.body;
    }

}
