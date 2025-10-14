// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribePolarxDataNodesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarxDataNodesResponseBody body;

    public static DescribePolarxDataNodesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarxDataNodesResponse self = new DescribePolarxDataNodesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarxDataNodesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarxDataNodesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarxDataNodesResponse setBody(DescribePolarxDataNodesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarxDataNodesResponseBody getBody() {
        return this.body;
    }

}
