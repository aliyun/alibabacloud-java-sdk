// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody body;

    public static QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse self = new QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponse setBody(QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryLinkefabricFabricSmartdeployconfigsdrmquerytenantidappnameResponseBody getBody() {
        return this.body;
    }

}
