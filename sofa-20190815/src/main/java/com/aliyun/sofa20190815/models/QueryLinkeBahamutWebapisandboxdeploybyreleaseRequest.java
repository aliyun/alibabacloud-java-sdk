// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutWebapisandboxdeploybyreleaseRequest extends TeaModel {
    @NameInMap("ReleaseId")
    public String releaseId;

    public static QueryLinkeBahamutWebapisandboxdeploybyreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutWebapisandboxdeploybyreleaseRequest self = new QueryLinkeBahamutWebapisandboxdeploybyreleaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutWebapisandboxdeploybyreleaseRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
