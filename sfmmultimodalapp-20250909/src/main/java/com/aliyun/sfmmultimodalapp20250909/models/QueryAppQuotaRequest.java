// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QueryAppQuotaRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryAppQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryAppQuotaRequest self = new QueryAppQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryAppQuotaRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public QueryAppQuotaRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
