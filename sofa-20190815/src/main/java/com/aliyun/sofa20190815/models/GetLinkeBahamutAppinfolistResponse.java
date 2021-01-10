// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppinfolistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutAppinfolistResponseBody body;

    public static GetLinkeBahamutAppinfolistResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppinfolistResponse self = new GetLinkeBahamutAppinfolistResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppinfolistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutAppinfolistResponse setBody(GetLinkeBahamutAppinfolistResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutAppinfolistResponseBody getBody() {
        return this.body;
    }

}
