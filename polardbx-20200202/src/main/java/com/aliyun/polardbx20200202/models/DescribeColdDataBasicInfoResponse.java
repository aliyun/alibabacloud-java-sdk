// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DescribeColdDataBasicInfoResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeColdDataBasicInfoResponseBody body;

    public static DescribeColdDataBasicInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeColdDataBasicInfoResponse self = new DescribeColdDataBasicInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeColdDataBasicInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeColdDataBasicInfoResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeColdDataBasicInfoResponse setBody(DescribeColdDataBasicInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeColdDataBasicInfoResponseBody getBody() {
        return this.body;
    }

}
