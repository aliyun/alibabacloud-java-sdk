// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectArgdetailofmissionruleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectArgdetailofmissionruleResponseBody body;

    public static GetHasInspectArgdetailofmissionruleResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectArgdetailofmissionruleResponse self = new GetHasInspectArgdetailofmissionruleResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectArgdetailofmissionruleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectArgdetailofmissionruleResponse setBody(GetHasInspectArgdetailofmissionruleResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectArgdetailofmissionruleResponseBody getBody() {
        return this.body;
    }

}
