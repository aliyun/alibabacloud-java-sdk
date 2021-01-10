// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutCloudtenantresetcloudaccessResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkeBahamutCloudtenantresetcloudaccessResponseBody body;

    public static QueryLinkeBahamutCloudtenantresetcloudaccessResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutCloudtenantresetcloudaccessResponse self = new QueryLinkeBahamutCloudtenantresetcloudaccessResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutCloudtenantresetcloudaccessResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkeBahamutCloudtenantresetcloudaccessResponse setBody(QueryLinkeBahamutCloudtenantresetcloudaccessResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkeBahamutCloudtenantresetcloudaccessResponseBody getBody() {
        return this.body;
    }

}
