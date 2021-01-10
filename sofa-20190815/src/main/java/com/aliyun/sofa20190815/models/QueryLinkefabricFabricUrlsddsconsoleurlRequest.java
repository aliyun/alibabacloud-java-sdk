// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricUrlsddsconsoleurlRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("ProjectId")
    public String projectId;

    public static QueryLinkefabricFabricUrlsddsconsoleurlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricUrlsddsconsoleurlRequest self = new QueryLinkefabricFabricUrlsddsconsoleurlRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricUrlsddsconsoleurlRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricUrlsddsconsoleurlRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
