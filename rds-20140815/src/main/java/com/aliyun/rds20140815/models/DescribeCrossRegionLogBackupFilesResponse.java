// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionLogBackupFilesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCrossRegionLogBackupFilesResponseBody body;

    public static DescribeCrossRegionLogBackupFilesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionLogBackupFilesResponse self = new DescribeCrossRegionLogBackupFilesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionLogBackupFilesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrossRegionLogBackupFilesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCrossRegionLogBackupFilesResponse setBody(DescribeCrossRegionLogBackupFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossRegionLogBackupFilesResponseBody getBody() {
        return this.body;
    }

}
