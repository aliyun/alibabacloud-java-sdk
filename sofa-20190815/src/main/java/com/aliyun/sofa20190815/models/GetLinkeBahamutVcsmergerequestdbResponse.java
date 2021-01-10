// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmergerequestdbResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsmergerequestdbResponseBody body;

    public static GetLinkeBahamutVcsmergerequestdbResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmergerequestdbResponse self = new GetLinkeBahamutVcsmergerequestdbResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmergerequestdbResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsmergerequestdbResponse setBody(GetLinkeBahamutVcsmergerequestdbResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsmergerequestdbResponseBody getBody() {
        return this.body;
    }

}
