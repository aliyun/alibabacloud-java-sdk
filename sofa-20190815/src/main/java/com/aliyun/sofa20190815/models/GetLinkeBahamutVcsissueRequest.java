// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsissueRequest extends TeaModel {
    @NameInMap("IssueId")
    public String issueId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsissueRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsissueRequest self = new GetLinkeBahamutVcsissueRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsissueRequest setIssueId(String issueId) {
        this.issueId = issueId;
        return this;
    }
    public String getIssueId() {
        return this.issueId;
    }

    public GetLinkeBahamutVcsissueRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLinkeBahamutVcsissueRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
