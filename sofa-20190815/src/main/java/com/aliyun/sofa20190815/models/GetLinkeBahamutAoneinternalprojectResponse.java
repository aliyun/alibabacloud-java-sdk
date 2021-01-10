// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternalprojectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAoneinternalprojectResponseBody body;

    public static GetLinkeBahamutAoneinternalprojectResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternalprojectResponse self = new GetLinkeBahamutAoneinternalprojectResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternalprojectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAoneinternalprojectResponse setBody(GetLinkeBahamutAoneinternalprojectResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAoneinternalprojectResponseBody getBody() {
        return this.body;
    }

}
