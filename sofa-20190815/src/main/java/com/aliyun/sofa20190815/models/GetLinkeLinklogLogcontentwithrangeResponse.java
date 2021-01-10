// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinklogLogcontentwithrangeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinklogLogcontentwithrangeResponseBody body;

    public static GetLinkeLinklogLogcontentwithrangeResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinklogLogcontentwithrangeResponse self = new GetLinkeLinklogLogcontentwithrangeResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinklogLogcontentwithrangeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinklogLogcontentwithrangeResponse setBody(GetLinkeLinklogLogcontentwithrangeResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinklogLogcontentwithrangeResponseBody getBody() {
        return this.body;
    }

}
