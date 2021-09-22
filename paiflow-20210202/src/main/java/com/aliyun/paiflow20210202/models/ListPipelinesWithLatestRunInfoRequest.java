// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelinesWithLatestRunInfoRequest extends TeaModel {
    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PipelineIdentifier")
    public String pipelineIdentifier;

    @NameInMap("PipelineProvider")
    public String pipelineProvider;

    @NameInMap("PipelineVersion")
    public String pipelineVersion;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static ListPipelinesWithLatestRunInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesWithLatestRunInfoRequest self = new ListPipelinesWithLatestRunInfoRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelinesWithLatestRunInfoRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPipelinesWithLatestRunInfoRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelinesWithLatestRunInfoRequest setPipelineIdentifier(String pipelineIdentifier) {
        this.pipelineIdentifier = pipelineIdentifier;
        return this;
    }
    public String getPipelineIdentifier() {
        return this.pipelineIdentifier;
    }

    public ListPipelinesWithLatestRunInfoRequest setPipelineProvider(String pipelineProvider) {
        this.pipelineProvider = pipelineProvider;
        return this;
    }
    public String getPipelineProvider() {
        return this.pipelineProvider;
    }

    public ListPipelinesWithLatestRunInfoRequest setPipelineVersion(String pipelineVersion) {
        this.pipelineVersion = pipelineVersion;
        return this;
    }
    public String getPipelineVersion() {
        return this.pipelineVersion;
    }

    public ListPipelinesWithLatestRunInfoRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
