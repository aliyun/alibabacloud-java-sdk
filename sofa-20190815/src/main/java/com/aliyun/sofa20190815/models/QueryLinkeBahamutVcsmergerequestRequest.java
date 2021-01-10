// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutVcsmergerequestRequest extends TeaModel {
    @NameInMap("MergeRequestId")
    public String mergeRequestId;

    @NameInMap("PipelineTag")
    public String pipelineTag;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutVcsmergerequestRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutVcsmergerequestRequest self = new QueryLinkeBahamutVcsmergerequestRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutVcsmergerequestRequest setMergeRequestId(String mergeRequestId) {
        this.mergeRequestId = mergeRequestId;
        return this;
    }
    public String getMergeRequestId() {
        return this.mergeRequestId;
    }

    public QueryLinkeBahamutVcsmergerequestRequest setPipelineTag(String pipelineTag) {
        this.pipelineTag = pipelineTag;
        return this;
    }
    public String getPipelineTag() {
        return this.pipelineTag;
    }

    public QueryLinkeBahamutVcsmergerequestRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public QueryLinkeBahamutVcsmergerequestRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
