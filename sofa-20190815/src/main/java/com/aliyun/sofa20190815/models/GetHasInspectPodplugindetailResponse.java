// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPodplugindetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectPodplugindetailResponseBody body;

    public static GetHasInspectPodplugindetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPodplugindetailResponse self = new GetHasInspectPodplugindetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPodplugindetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectPodplugindetailResponse setBody(GetHasInspectPodplugindetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectPodplugindetailResponseBody getBody() {
        return this.body;
    }

}
