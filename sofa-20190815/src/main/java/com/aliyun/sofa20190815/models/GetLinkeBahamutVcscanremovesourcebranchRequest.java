// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcscanremovesourcebranchRequest extends TeaModel {
    @NameInMap("MergeRequestId")
    public String mergeRequestId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcscanremovesourcebranchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcscanremovesourcebranchRequest self = new GetLinkeBahamutVcscanremovesourcebranchRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcscanremovesourcebranchRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public GetLinkeBahamutVcscanremovesourcebranchRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLinkeBahamutVcscanremovesourcebranchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
