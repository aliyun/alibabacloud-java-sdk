// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmrcommentRequest extends TeaModel {
    @NameInMap("MergeRequestId")
    public String mergeRequestId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsmrcommentRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmrcommentRequest self = new GetLinkeBahamutVcsmrcommentRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmrcommentRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public GetLinkeBahamutVcsmrcommentRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLinkeBahamutVcsmrcommentRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
