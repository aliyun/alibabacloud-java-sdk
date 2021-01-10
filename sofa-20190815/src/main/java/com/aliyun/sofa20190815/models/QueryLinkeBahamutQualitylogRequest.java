// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutQualitylogRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("Branch")
    public String branch;

    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("QualityItem")
    public String qualityItem;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutQualitylogRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutQualitylogRequest self = new QueryLinkeBahamutQualitylogRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutQualitylogRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutQualitylogRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public QueryLinkeBahamutQualitylogRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public QueryLinkeBahamutQualitylogRequest setQualityItem(String qualityItem) {
        this.qualityItem = qualityItem;
        return this;
    }
    public String getQualityItem() {
        return this.qualityItem;
    }

    public QueryLinkeBahamutQualitylogRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public QueryLinkeBahamutQualitylogRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
