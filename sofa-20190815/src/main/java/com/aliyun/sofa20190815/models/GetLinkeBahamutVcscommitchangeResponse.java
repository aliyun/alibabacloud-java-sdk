// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcscommitchangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcscommitchangeResponseBody body;

    public static GetLinkeBahamutVcscommitchangeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcscommitchangeResponse self = new GetLinkeBahamutVcscommitchangeResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcscommitchangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcscommitchangeResponse setBody(GetLinkeBahamutVcscommitchangeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcscommitchangeResponseBody getBody() {
        return this.body;
    }

}
