// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeCategoryTemplateRuleListResponseBody body;

    public static DescribeCategoryTemplateRuleListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoryTemplateRuleListResponse self = new DescribeCategoryTemplateRuleListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCategoryTemplateRuleListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeCategoryTemplateRuleListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeCategoryTemplateRuleListResponse setBody(DescribeCategoryTemplateRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCategoryTemplateRuleListResponseBody getBody() {
        return this.body;
    }

}
