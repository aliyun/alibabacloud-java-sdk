// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSupportRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSupportRegionResponseBody body;

    public static DescribeSupportRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSupportRegionResponse self = new DescribeSupportRegionResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSupportRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSupportRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSupportRegionResponse setBody(DescribeSupportRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSupportRegionResponseBody getBody() {
        return this.body;
    }

}
