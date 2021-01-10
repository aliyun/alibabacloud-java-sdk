// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetlterationbytimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutOpengetlterationbytimeResponseBody body;

    public static GetLinkeBahamutOpengetlterationbytimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetlterationbytimeResponse self = new GetLinkeBahamutOpengetlterationbytimeResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetlterationbytimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutOpengetlterationbytimeResponse setBody(GetLinkeBahamutOpengetlterationbytimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutOpengetlterationbytimeResponseBody getBody() {
        return this.body;
    }

}
