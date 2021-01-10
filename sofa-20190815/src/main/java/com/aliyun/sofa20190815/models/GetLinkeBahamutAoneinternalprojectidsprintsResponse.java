// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAoneinternalprojectidsprintsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAoneinternalprojectidsprintsResponseBody body;

    public static GetLinkeBahamutAoneinternalprojectidsprintsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAoneinternalprojectidsprintsResponse self = new GetLinkeBahamutAoneinternalprojectidsprintsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAoneinternalprojectidsprintsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAoneinternalprojectidsprintsResponse setBody(GetLinkeBahamutAoneinternalprojectidsprintsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAoneinternalprojectidsprintsResponseBody getBody() {
        return this.body;
    }

}
