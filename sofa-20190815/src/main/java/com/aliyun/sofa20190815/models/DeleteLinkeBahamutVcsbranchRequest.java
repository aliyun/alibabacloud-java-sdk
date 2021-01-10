// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteLinkeBahamutVcsbranchRequest extends TeaModel {
    @NameInMap("BranchName")
    public String branchName;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public String tenantId;

    public static DeleteLinkeBahamutVcsbranchRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteLinkeBahamutVcsbranchRequest self = new DeleteLinkeBahamutVcsbranchRequest();
        return TeaModel.build(map, self);
    }

    public DeleteLinkeBahamutVcsbranchRequest setBranchName(String branchName) {
        this.branchName = branchName;
        return this;
    }
    public String getBranchName() {
        return this.branchName;
    }

    public DeleteLinkeBahamutVcsbranchRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DeleteLinkeBahamutVcsbranchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
