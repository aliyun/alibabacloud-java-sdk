// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeContainerScanConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeContainerScanConfigResponseBody body;

    public static DescribeContainerScanConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeContainerScanConfigResponse self = new DescribeContainerScanConfigResponse();
        return TeaModel.build(map, self);
    }

    public DescribeContainerScanConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeContainerScanConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeContainerScanConfigResponse setBody(DescribeContainerScanConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeContainerScanConfigResponseBody getBody() {
        return this.body;
    }

}
