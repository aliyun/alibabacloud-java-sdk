// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogHitspercentagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogHitspercentagesResponseBody body;

    public static GetLinkeLinklogHitspercentagesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogHitspercentagesResponse self = new GetLinkeLinklogHitspercentagesResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogHitspercentagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogHitspercentagesResponse setBody(GetLinkeLinklogHitspercentagesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogHitspercentagesResponseBody getBody() {
        return this.body;
    }

}
