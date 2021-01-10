// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutSandboxdeployRequest extends TeaModel {
    @NameInMap("Params")
    public String params;

    public static QueryLinkeBahamutSandboxdeployRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutSandboxdeployRequest self = new QueryLinkeBahamutSandboxdeployRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutSandboxdeployRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
