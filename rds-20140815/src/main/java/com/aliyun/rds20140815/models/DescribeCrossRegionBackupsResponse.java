// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCrossRegionBackupsResponseBody body;

    public static DescribeCrossRegionBackupsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionBackupsResponse self = new DescribeCrossRegionBackupsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionBackupsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrossRegionBackupsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCrossRegionBackupsResponse setBody(DescribeCrossRegionBackupsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossRegionBackupsResponseBody getBody() {
        return this.body;
    }

}
