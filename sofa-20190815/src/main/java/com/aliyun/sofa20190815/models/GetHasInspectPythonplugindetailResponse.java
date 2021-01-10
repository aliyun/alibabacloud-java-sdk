// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectPythonplugindetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectPythonplugindetailResponseBody body;

    public static GetHasInspectPythonplugindetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectPythonplugindetailResponse self = new GetHasInspectPythonplugindetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectPythonplugindetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectPythonplugindetailResponse setBody(GetHasInspectPythonplugindetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectPythonplugindetailResponseBody getBody() {
        return this.body;
    }

}
