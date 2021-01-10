// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasApprovalNwprocesstaskdetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasApprovalNwprocesstaskdetailResponseBody body;

    public static GetHasApprovalNwprocesstaskdetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasApprovalNwprocesstaskdetailResponse self = new GetHasApprovalNwprocesstaskdetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasApprovalNwprocesstaskdetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasApprovalNwprocesstaskdetailResponse setBody(GetHasApprovalNwprocesstaskdetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasApprovalNwprocesstaskdetailResponseBody getBody() {
        return this.body;
    }

}
