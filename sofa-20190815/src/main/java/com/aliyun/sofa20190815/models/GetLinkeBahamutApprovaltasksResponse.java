// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutApprovaltasksResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutApprovaltasksResponseBody body;

    public static GetLinkeBahamutApprovaltasksResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutApprovaltasksResponse self = new GetLinkeBahamutApprovaltasksResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutApprovaltasksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutApprovaltasksResponse setBody(GetLinkeBahamutApprovaltasksResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutApprovaltasksResponseBody getBody() {
        return this.body;
    }

}
