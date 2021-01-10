// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationsgetlterationsbyappgroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeBahamutIterationsgetlterationsbyappgroupResponseBody body;

    public static GetLinkeBahamutIterationsgetlterationsbyappgroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationsgetlterationsbyappgroupResponse self = new GetLinkeBahamutIterationsgetlterationsbyappgroupResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationsgetlterationsbyappgroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeBahamutIterationsgetlterationsbyappgroupResponse setBody(GetLinkeBahamutIterationsgetlterationsbyappgroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeBahamutIterationsgetlterationsbyappgroupResponseBody getBody() {
        return this.body;
    }

}
