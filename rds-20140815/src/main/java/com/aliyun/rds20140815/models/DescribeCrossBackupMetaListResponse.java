// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossBackupMetaListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCrossBackupMetaListResponseBody body;

    public static DescribeCrossBackupMetaListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCrossBackupMetaListResponse self = new DescribeCrossBackupMetaListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCrossBackupMetaListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCrossBackupMetaListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCrossBackupMetaListResponse setBody(DescribeCrossBackupMetaListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossBackupMetaListResponseBody getBody() {
        return this.body;
    }

}
