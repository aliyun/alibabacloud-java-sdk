// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class ListInstancesV2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstancesV2ResponseBody body;

    public static ListInstancesV2Response build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesV2Response self = new ListInstancesV2Response();
        return TeaModel.build(map, self);
    }

    public ListInstancesV2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesV2Response setBody(ListInstancesV2ResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesV2ResponseBody getBody() {
        return this.body;
    }

}
