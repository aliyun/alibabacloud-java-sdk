// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCContainerservicePodResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCContainerservicePodResponseBody body;

    public static ListLDCContainerservicePodResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCContainerservicePodResponse self = new ListLDCContainerservicePodResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCContainerservicePodResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCContainerservicePodResponse setBody(ListLDCContainerservicePodResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCContainerservicePodResponseBody getBody() {
        return this.body;
    }

}
