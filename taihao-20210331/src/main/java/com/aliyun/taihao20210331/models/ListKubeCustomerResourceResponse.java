// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.taihao20210331.models;

import com.aliyun.tea.*;

public class ListKubeCustomerResourceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StringResponse body;

    public static ListKubeCustomerResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListKubeCustomerResourceResponse self = new ListKubeCustomerResourceResponse();
        return TeaModel.build(map, self);
    }

    public ListKubeCustomerResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListKubeCustomerResourceResponse setBody(StringResponse body) {
        this.body = body;
        return this;
    }
    public StringResponse getBody() {
        return this.body;
    }

}
