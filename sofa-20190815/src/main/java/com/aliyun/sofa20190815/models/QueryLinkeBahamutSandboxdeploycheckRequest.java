// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutSandboxdeploycheckRequest extends TeaModel {
    @NameInMap("Params")
    public String params;

    public static QueryLinkeBahamutSandboxdeploycheckRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutSandboxdeploycheckRequest self = new QueryLinkeBahamutSandboxdeploycheckRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutSandboxdeploycheckRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
