// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmergerequestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutVcsmergerequestResponseBody body;

    public static GetLinkeBahamutVcsmergerequestResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmergerequestResponse self = new GetLinkeBahamutVcsmergerequestResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmergerequestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutVcsmergerequestResponse setBody(GetLinkeBahamutVcsmergerequestResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutVcsmergerequestResponseBody getBody() {
        return this.body;
    }

}
