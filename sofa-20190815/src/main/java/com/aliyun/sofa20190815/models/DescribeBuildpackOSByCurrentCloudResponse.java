// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackOSByCurrentCloudResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBuildpackOSByCurrentCloudResponseBody body;

    public static DescribeBuildpackOSByCurrentCloudResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackOSByCurrentCloudResponse self = new DescribeBuildpackOSByCurrentCloudResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackOSByCurrentCloudResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBuildpackOSByCurrentCloudResponse setBody(DescribeBuildpackOSByCurrentCloudResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBuildpackOSByCurrentCloudResponseBody getBody() {
        return this.body;
    }

}
