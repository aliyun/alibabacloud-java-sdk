// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListEcsSpecsV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListEcsSpecsV2ResponseBody body;

    public static ListEcsSpecsV2Response build(java.util.Map<String, ?> map) throws Exception {
        ListEcsSpecsV2Response self = new ListEcsSpecsV2Response();
        return TeaModel.build(map, self);
    }

    public ListEcsSpecsV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEcsSpecsV2Response setBody(ListEcsSpecsV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListEcsSpecsV2ResponseBody getBody() {
        return this.body;
    }

}
