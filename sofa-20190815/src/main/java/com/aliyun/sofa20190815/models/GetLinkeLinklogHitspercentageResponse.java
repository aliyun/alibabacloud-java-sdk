// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogHitspercentageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogHitspercentageResponseBody body;

    public static GetLinkeLinklogHitspercentageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogHitspercentageResponse self = new GetLinkeLinklogHitspercentageResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogHitspercentageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogHitspercentageResponse setBody(GetLinkeLinklogHitspercentageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogHitspercentageResponseBody getBody() {
        return this.body;
    }

}
