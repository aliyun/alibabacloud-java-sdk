// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetreleasebytimeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutOpengetreleasebytimeResponseBody body;

    public static GetLinkeBahamutOpengetreleasebytimeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetreleasebytimeResponse self = new GetLinkeBahamutOpengetreleasebytimeResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetreleasebytimeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutOpengetreleasebytimeResponse setBody(GetLinkeBahamutOpengetreleasebytimeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutOpengetreleasebytimeResponseBody getBody() {
        return this.body;
    }

}
