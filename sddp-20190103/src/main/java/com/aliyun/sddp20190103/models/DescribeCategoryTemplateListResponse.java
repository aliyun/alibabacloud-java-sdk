// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCategoryTemplateListResponseBody body;

    public static DescribeCategoryTemplateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoryTemplateListResponse self = new DescribeCategoryTemplateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCategoryTemplateListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCategoryTemplateListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCategoryTemplateListResponse setBody(DescribeCategoryTemplateListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCategoryTemplateListResponseBody getBody() {
        return this.body;
    }

}
