// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCloudcacheappResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutCloudcacheappResponseBody body;

    public static GetLinkeBahamutCloudcacheappResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCloudcacheappResponse self = new GetLinkeBahamutCloudcacheappResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCloudcacheappResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutCloudcacheappResponse setBody(GetLinkeBahamutCloudcacheappResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutCloudcacheappResponseBody getBody() {
        return this.body;
    }

}
