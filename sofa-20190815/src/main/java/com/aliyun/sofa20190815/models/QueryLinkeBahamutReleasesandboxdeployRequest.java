// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleasesandboxdeployRequest extends TeaModel {
    @NameInMap("Params")
    public String params;

    public static QueryLinkeBahamutReleasesandboxdeployRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleasesandboxdeployRequest self = new QueryLinkeBahamutReleasesandboxdeployRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleasesandboxdeployRequest setParams(String params) {
        this.params = params;
        return this;
    }
    public String getParams() {
        return this.params;
    }

}
