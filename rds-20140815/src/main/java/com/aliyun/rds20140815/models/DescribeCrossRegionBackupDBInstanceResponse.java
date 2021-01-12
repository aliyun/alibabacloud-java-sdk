// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossRegionBackupDBInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCrossRegionBackupDBInstanceResponseBody body;

    public static DescribeCrossRegionBackupDBInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossRegionBackupDBInstanceResponse self = new DescribeCrossRegionBackupDBInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossRegionBackupDBInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrossRegionBackupDBInstanceResponse setBody(DescribeCrossRegionBackupDBInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossRegionBackupDBInstanceResponseBody getBody() {
        return this.body;
    }

}
