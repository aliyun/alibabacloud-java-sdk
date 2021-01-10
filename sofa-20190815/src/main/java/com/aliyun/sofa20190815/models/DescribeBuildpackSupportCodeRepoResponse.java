// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DescribeBuildpackSupportCodeRepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DescribeBuildpackSupportCodeRepoResponseBody body;

    public static DescribeBuildpackSupportCodeRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBuildpackSupportCodeRepoResponse self = new DescribeBuildpackSupportCodeRepoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBuildpackSupportCodeRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeBuildpackSupportCodeRepoResponse setBody(DescribeBuildpackSupportCodeRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribeBuildpackSupportCodeRepoResponseBody getBody() {
        return this.body;
    }

}
