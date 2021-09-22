// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiflow20210202.models;

import com.aliyun.tea.*;

public class ListPipelinesRequest extends TeaModel {
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

    public static ListPipelinesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPipelinesRequest self = new ListPipelinesRequest();
        return TeaModel.build(map, self);
    }

    public ListPipelinesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListPipelinesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPipelinesRequest setPipelineIdentifier(String pipelineIdentifier) {
        this.pipelineIdentifier = pipelineIdentifier;
        return this;
    }
    public String getPipelineIdentifier() {
        return this.pipelineIdentifier;
    }

    public ListPipelinesRequest setPipelineProvider(String pipelineProvider) {
        this.pipelineProvider = pipelineProvider;
        return this;
    }
    public String getPipelineProvider() {
        return this.pipelineProvider;
    }

    public ListPipelinesRequest setPipelineVersion(String pipelineVersion) {
        this.pipelineVersion = pipelineVersion;
        return this;
    }
    public String getPipelineVersion() {
        return this.pipelineVersion;
    }

    public ListPipelinesRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
