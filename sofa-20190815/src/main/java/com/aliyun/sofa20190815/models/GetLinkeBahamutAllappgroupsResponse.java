// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAllappgroupsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAllappgroupsResponseBody body;

    public static GetLinkeBahamutAllappgroupsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAllappgroupsResponse self = new GetLinkeBahamutAllappgroupsResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAllappgroupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAllappgroupsResponse setBody(GetLinkeBahamutAllappgroupsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAllappgroupsResponseBody getBody() {
        return this.body;
    }

}
