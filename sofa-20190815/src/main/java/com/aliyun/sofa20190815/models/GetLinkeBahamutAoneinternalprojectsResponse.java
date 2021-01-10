// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternalprojectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAoneinternalprojectsResponseBody body;

    public static GetLinkeBahamutAoneinternalprojectsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternalprojectsResponse self = new GetLinkeBahamutAoneinternalprojectsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternalprojectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAoneinternalprojectsResponse setBody(GetLinkeBahamutAoneinternalprojectsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAoneinternalprojectsResponseBody getBody() {
        return this.body;
    }

}
