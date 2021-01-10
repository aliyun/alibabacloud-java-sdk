// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsmergerequestdbRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("MergeRequestId")
    public String mergeRequestId;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsmergerequestdbRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsmergerequestdbRequest self = new GetLinkeBahamutVcsmergerequestdbRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsmergerequestdbRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutVcsmergerequestdbRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public GetLinkeBahamutVcsmergerequestdbRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public GetLinkeBahamutVcsmergerequestdbRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
