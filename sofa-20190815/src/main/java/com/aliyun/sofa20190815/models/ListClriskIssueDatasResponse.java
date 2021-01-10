// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskIssueDatasResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskIssueDatasResponseBody body;

    public static ListClriskIssueDatasResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskIssueDatasResponse self = new ListClriskIssueDatasResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskIssueDatasResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskIssueDatasResponse setBody(ListClriskIssueDatasResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskIssueDatasResponseBody getBody() {
        return this.body;
    }

}
