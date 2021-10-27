// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListInstancesTrafficPackagesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstancesTrafficPackagesResponseBody body;

    public static ListInstancesTrafficPackagesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstancesTrafficPackagesResponse self = new ListInstancesTrafficPackagesResponse();
        return TeaModel.build(map, self);
    }

    public ListInstancesTrafficPackagesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstancesTrafficPackagesResponse setBody(ListInstancesTrafficPackagesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstancesTrafficPackagesResponseBody getBody() {
        return this.body;
    }

}
