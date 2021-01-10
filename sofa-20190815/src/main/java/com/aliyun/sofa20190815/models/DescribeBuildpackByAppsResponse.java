// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackByAppsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBuildpackByAppsResponseBody body;

    public static DescribeBuildpackByAppsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackByAppsResponse self = new DescribeBuildpackByAppsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackByAppsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBuildpackByAppsResponse setBody(DescribeBuildpackByAppsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBuildpackByAppsResponseBody getBody() {
        return this.body;
    }

}
