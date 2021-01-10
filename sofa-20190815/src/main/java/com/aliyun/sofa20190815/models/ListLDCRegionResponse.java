// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCRegionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCRegionResponseBody body;

    public static ListLDCRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCRegionResponse self = new ListLDCRegionResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCRegionResponse setBody(ListLDCRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCRegionResponseBody getBody() {
        return this.body;
    }

}
