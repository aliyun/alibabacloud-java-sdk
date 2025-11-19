// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.wuying_personal_pc20251111.models;

import com.aliyun.tea.*;

public class DescribeCorePackageListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribeCorePackageListResponseBody body;

    public static DescribeCorePackageListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCorePackageListResponse self = new DescribeCorePackageListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCorePackageListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCorePackageListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCorePackageListResponse setBody(DescribeCorePackageListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCorePackageListResponseBody getBody() {
        return this.body;
    }

}
