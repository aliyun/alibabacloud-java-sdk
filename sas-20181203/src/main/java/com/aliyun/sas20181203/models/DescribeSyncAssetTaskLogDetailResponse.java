// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSyncAssetTaskLogDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSyncAssetTaskLogDetailResponseBody body;

    public static DescribeSyncAssetTaskLogDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncAssetTaskLogDetailResponse self = new DescribeSyncAssetTaskLogDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncAssetTaskLogDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncAssetTaskLogDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSyncAssetTaskLogDetailResponse setBody(DescribeSyncAssetTaskLogDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncAssetTaskLogDetailResponseBody getBody() {
        return this.body;
    }

}
