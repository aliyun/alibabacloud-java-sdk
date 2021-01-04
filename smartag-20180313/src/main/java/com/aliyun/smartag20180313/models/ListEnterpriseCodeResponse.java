// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class ListEnterpriseCodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEnterpriseCodeResponseBody body;

    public static ListEnterpriseCodeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnterpriseCodeResponse self = new ListEnterpriseCodeResponse();
        return TeaModel.build(map, self);
    }

    public ListEnterpriseCodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnterpriseCodeResponse setBody(ListEnterpriseCodeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEnterpriseCodeResponseBody getBody() {
        return this.body;
    }

}
