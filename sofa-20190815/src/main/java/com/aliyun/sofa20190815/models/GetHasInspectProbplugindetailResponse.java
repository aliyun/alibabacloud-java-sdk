// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectProbplugindetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectProbplugindetailResponseBody body;

    public static GetHasInspectProbplugindetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectProbplugindetailResponse self = new GetHasInspectProbplugindetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectProbplugindetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectProbplugindetailResponse setBody(GetHasInspectProbplugindetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectProbplugindetailResponseBody getBody() {
        return this.body;
    }

}
