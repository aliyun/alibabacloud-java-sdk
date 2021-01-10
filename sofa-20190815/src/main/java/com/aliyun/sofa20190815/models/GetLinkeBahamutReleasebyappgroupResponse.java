// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutReleasebyappgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutReleasebyappgroupResponseBody body;

    public static GetLinkeBahamutReleasebyappgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutReleasebyappgroupResponse self = new GetLinkeBahamutReleasebyappgroupResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutReleasebyappgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutReleasebyappgroupResponse setBody(GetLinkeBahamutReleasebyappgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutReleasebyappgroupResponseBody getBody() {
        return this.body;
    }

}
