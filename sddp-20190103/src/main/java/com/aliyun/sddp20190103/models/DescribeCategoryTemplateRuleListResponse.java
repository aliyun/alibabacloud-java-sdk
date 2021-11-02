// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeCategoryTemplateRuleListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public DescribeCategoryTemplateRuleListResponse setBody(DescribeCategoryTemplateRuleListResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeCategoryTemplateRuleListResponseBody getBody() {
        return this.body;
    }

}
