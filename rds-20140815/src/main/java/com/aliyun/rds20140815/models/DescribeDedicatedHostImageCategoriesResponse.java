// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostImageCategoriesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeDedicatedHostImageCategoriesResponseBody body;

    public static DescribeDedicatedHostImageCategoriesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostImageCategoriesResponse self = new DescribeDedicatedHostImageCategoriesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostImageCategoriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeDedicatedHostImageCategoriesResponse setBody(DescribeDedicatedHostImageCategoriesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeDedicatedHostImageCategoriesResponseBody getBody() {
        return this.body;
    }

}
