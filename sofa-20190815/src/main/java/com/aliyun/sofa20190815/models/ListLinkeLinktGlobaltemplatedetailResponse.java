// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeLinktGlobaltemplatedetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLinkeLinktGlobaltemplatedetailResponseBody body;

    public static ListLinkeLinktGlobaltemplatedetailResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeLinktGlobaltemplatedetailResponse self = new ListLinkeLinktGlobaltemplatedetailResponse();
        return TeaModel.build(map, self);
    }

    public ListLinkeLinktGlobaltemplatedetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLinkeLinktGlobaltemplatedetailResponse setBody(ListLinkeLinktGlobaltemplatedetailResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLinkeLinktGlobaltemplatedetailResponseBody getBody() {
        return this.body;
    }

}
