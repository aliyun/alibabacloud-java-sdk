// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutApprovaltasktypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutApprovaltasktypesResponseBody body;

    public static GetLinkeBahamutApprovaltasktypesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutApprovaltasktypesResponse self = new GetLinkeBahamutApprovaltasktypesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutApprovaltasktypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutApprovaltasktypesResponse setBody(GetLinkeBahamutApprovaltasktypesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutApprovaltasktypesResponseBody getBody() {
        return this.body;
    }

}
