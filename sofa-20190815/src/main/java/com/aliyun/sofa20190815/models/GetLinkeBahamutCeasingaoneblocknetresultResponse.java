// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutCeasingaoneblocknetresultResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody body;

    public static GetLinkeBahamutCeasingaoneblocknetresultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutCeasingaoneblocknetresultResponse self = new GetLinkeBahamutCeasingaoneblocknetresultResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutCeasingaoneblocknetresultResponse setBody(GetLinkeBahamutCeasingaoneblocknetresultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutCeasingaoneblocknetresultResponseBody getBody() {
        return this.body;
    }

}
