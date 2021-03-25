// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.productcatalog20180918.models;

import com.aliyun.tea.*;

public class ListApisResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static ListApisResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApisResponse self = new ListApisResponse();
        return TeaModel.build(map, self);
    }

    public ListApisResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
