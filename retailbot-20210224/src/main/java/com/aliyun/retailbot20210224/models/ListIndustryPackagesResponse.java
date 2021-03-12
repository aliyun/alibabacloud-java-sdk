// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class ListIndustryPackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListIndustryPackagesResponseBody body;

    public static ListIndustryPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIndustryPackagesResponse self = new ListIndustryPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListIndustryPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIndustryPackagesResponse setBody(ListIndustryPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIndustryPackagesResponseBody getBody() {
        return this.body;
    }

}
