// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarFsAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarFsAttributeResponseBody body;

    public static DescribePolarFsAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarFsAttributeResponse self = new DescribePolarFsAttributeResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarFsAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarFsAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarFsAttributeResponse setBody(DescribePolarFsAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarFsAttributeResponseBody getBody() {
        return this.body;
    }

}
