// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlsopsslaurlRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ProjectId")
    public String projectId;

    public static QueryLinkefabricFabricUrlsopsslaurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlsopsslaurlRequest self = new QueryLinkefabricFabricUrlsopsslaurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlsopsslaurlRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricUrlsopsslaurlRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
