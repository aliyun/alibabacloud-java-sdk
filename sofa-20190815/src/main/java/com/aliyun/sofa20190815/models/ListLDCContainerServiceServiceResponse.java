// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCContainerServiceServiceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCContainerServiceServiceResponseBody body;

    public static ListLDCContainerServiceServiceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCContainerServiceServiceResponse self = new ListLDCContainerServiceServiceResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCContainerServiceServiceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCContainerServiceServiceResponse setBody(ListLDCContainerServiceServiceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCContainerServiceServiceResponseBody getBody() {
        return this.body;
    }

}
