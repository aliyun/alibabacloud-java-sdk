// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribePbrInterfacesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribePbrInterfacesResponseBody body;

    public static DescribePbrInterfacesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePbrInterfacesResponse self = new DescribePbrInterfacesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePbrInterfacesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePbrInterfacesResponse setBody(DescribePbrInterfacesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePbrInterfacesResponseBody getBody() {
        return this.body;
    }

}
