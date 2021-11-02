// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class QueryIndustryLabelBagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryIndustryLabelBagResponseBody body;

    public static QueryIndustryLabelBagResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryIndustryLabelBagResponse self = new QueryIndustryLabelBagResponse();
        return TeaModel.build(map, self);
    }

    public QueryIndustryLabelBagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryIndustryLabelBagResponse setBody(QueryIndustryLabelBagResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryIndustryLabelBagResponseBody getBody() {
        return this.body;
    }

}
