// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetunitsbyexternalldResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationgetunitsbyexternalldResponseBody body;

    public static GetLinkeBahamutIterationgetunitsbyexternalldResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetunitsbyexternalldResponse self = new GetLinkeBahamutIterationgetunitsbyexternalldResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetunitsbyexternalldResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationgetunitsbyexternalldResponse setBody(GetLinkeBahamutIterationgetunitsbyexternalldResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationgetunitsbyexternalldResponseBody getBody() {
        return this.body;
    }

}
