// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectImageplugindetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectImageplugindetailResponseBody body;

    public static GetHasInspectImageplugindetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectImageplugindetailResponse self = new GetHasInspectImageplugindetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectImageplugindetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectImageplugindetailResponse setBody(GetHasInspectImageplugindetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectImageplugindetailResponseBody getBody() {
        return this.body;
    }

}
