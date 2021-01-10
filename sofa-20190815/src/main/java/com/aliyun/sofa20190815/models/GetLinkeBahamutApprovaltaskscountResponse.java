// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutApprovaltaskscountResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutApprovaltaskscountResponseBody body;

    public static GetLinkeBahamutApprovaltaskscountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutApprovaltaskscountResponse self = new GetLinkeBahamutApprovaltaskscountResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutApprovaltaskscountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutApprovaltaskscountResponse setBody(GetLinkeBahamutApprovaltaskscountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutApprovaltaskscountResponseBody getBody() {
        return this.body;
    }

}
