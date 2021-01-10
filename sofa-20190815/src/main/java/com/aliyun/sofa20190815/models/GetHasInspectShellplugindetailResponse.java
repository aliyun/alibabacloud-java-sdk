// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectShellplugindetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectShellplugindetailResponseBody body;

    public static GetHasInspectShellplugindetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectShellplugindetailResponse self = new GetHasInspectShellplugindetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectShellplugindetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectShellplugindetailResponse setBody(GetHasInspectShellplugindetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectShellplugindetailResponseBody getBody() {
        return this.body;
    }

}
