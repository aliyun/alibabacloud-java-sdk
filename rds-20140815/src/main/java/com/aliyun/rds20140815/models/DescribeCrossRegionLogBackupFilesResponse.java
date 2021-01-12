// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionLogBackupFilesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCrossRegionLogBackupFilesResponse setBody(DescribeCrossRegionLogBackupFilesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossRegionLogBackupFilesResponseBody getBody() {
        return this.body;
    }

}
