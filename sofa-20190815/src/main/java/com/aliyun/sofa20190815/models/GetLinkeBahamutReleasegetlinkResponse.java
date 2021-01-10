// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleasegetlinkResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutReleasegetlinkResponseBody body;

    public static GetLinkeBahamutReleasegetlinkResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleasegetlinkResponse self = new GetLinkeBahamutReleasegetlinkResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleasegetlinkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutReleasegetlinkResponse setBody(GetLinkeBahamutReleasegetlinkResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutReleasegetlinkResponseBody getBody() {
        return this.body;
    }

}
