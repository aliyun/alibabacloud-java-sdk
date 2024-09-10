// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSyncAssetTaskListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeSyncAssetTaskListResponseBody body;

    public static DescribeSyncAssetTaskListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeSyncAssetTaskListResponse self = new DescribeSyncAssetTaskListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeSyncAssetTaskListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeSyncAssetTaskListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeSyncAssetTaskListResponse setBody(DescribeSyncAssetTaskListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeSyncAssetTaskListResponseBody getBody() {
        return this.body;
    }

}
