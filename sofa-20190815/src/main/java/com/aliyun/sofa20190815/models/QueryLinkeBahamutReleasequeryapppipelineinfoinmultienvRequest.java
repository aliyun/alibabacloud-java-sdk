// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ReleaseId")
    public String releaseId;

    public static QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvRequest self = new QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutReleasequeryapppipelineinfoinmultienvRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

}
