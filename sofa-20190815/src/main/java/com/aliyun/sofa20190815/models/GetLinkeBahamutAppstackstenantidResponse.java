// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppstackstenantidResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAppstackstenantidResponseBody body;

    public static GetLinkeBahamutAppstackstenantidResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppstackstenantidResponse self = new GetLinkeBahamutAppstackstenantidResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppstackstenantidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAppstackstenantidResponse setBody(GetLinkeBahamutAppstackstenantidResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAppstackstenantidResponseBody getBody() {
        return this.body;
    }

}
