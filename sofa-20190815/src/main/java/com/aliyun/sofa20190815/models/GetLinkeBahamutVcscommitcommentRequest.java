// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcscommitcommentRequest extends TeaModel {
    @NameInMap("CommitId")
    public String commitId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcscommitcommentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcscommitcommentRequest self = new GetLinkeBahamutVcscommitcommentRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcscommitcommentRequest setCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }
    public String getCommitId() {
        return this.commitId;
    }

    public GetLinkeBahamutVcscommitcommentRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLinkeBahamutVcscommitcommentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
