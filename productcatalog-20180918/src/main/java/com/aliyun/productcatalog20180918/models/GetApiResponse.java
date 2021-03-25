// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.productcatalog20180918.models;

import com.aliyun.tea.*;

public class GetApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    public static GetApiResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApiResponse self = new GetApiResponse();
        return TeaModel.build(map, self);
    }

    public GetApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

}
