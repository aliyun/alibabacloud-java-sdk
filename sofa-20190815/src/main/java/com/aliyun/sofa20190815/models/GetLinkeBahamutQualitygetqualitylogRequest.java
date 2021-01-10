// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutQualitygetqualitylogRequest extends TeaModel {
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

    public static GetLinkeBahamutQualitygetqualitylogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutQualitygetqualitylogRequest self = new GetLinkeBahamutQualitygetqualitylogRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutQualitygetqualitylogRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutQualitygetqualitylogRequest setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public String getBranch() {
        return this.branch;
    }

    public GetLinkeBahamutQualitygetqualitylogRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public GetLinkeBahamutQualitygetqualitylogRequest setQualityItem(String qualityItem) {
        this.qualityItem = qualityItem;
        return this;
    }
    public String getQualityItem() {
        return this.qualityItem;
    }

    public GetLinkeBahamutQualitygetqualitylogRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public GetLinkeBahamutQualitygetqualitylogRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
