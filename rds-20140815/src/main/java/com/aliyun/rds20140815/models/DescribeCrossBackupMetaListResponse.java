// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCrossBackupMetaListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DescribeCrossBackupMetaListResponse setBody(DescribeCrossBackupMetaListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCrossBackupMetaListResponseBody getBody() {
        return this.body;
    }

}
