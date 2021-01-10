// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCCellResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCCellResponseBody body;

    public static ListLDCCellResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCCellResponse self = new ListLDCCellResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCCellResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCCellResponse setBody(ListLDCCellResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCCellResponseBody getBody() {
        return this.body;
    }

}
