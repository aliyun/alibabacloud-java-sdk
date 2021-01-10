// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutStcresultRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("RepoPath")
    public String repoPath;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutStcresultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutStcresultRequest self = new GetLinkeBahamutStcresultRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutStcresultRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutStcresultRequest setRepoPath(String repoPath) {
        this.repoPath = repoPath;
        return this;
    }
    public String getRepoPath() {
        return this.repoPath;
    }

    public GetLinkeBahamutStcresultRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
