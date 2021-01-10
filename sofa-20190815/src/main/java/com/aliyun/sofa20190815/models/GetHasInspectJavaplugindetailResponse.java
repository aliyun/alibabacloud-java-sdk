// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetHasInspectJavaplugindetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetHasInspectJavaplugindetailResponseBody body;

    public static GetHasInspectJavaplugindetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHasInspectJavaplugindetailResponse self = new GetHasInspectJavaplugindetailResponse();
        return TeaModel.build(map, self);
    }

    public GetHasInspectJavaplugindetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHasInspectJavaplugindetailResponse setBody(GetHasInspectJavaplugindetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHasInspectJavaplugindetailResponseBody getBody() {
        return this.body;
    }

}
