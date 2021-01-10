// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectMhsplugindetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectMhsplugindetailResponseBody body;

    public static GetHasInspectMhsplugindetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectMhsplugindetailResponse self = new GetHasInspectMhsplugindetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectMhsplugindetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectMhsplugindetailResponse setBody(GetHasInspectMhsplugindetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectMhsplugindetailResponseBody getBody() {
        return this.body;
    }

}
