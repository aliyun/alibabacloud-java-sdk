// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppcustomciqualityRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutAppcustomciqualityRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppcustomciqualityRequest self = new QueryLinkeBahamutAppcustomciqualityRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppcustomciqualityRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutAppcustomciqualityRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public QueryLinkeBahamutAppcustomciqualityRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public QueryLinkeBahamutAppcustomciqualityRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
