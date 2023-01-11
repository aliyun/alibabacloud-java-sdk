// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class PreviewMCTableRequest extends TeaModel {
    @NameInMap("Endpoint")
    public String endpoint;

    @NameInMap("Limit")
    public Integer limit;

    @NameInMap("Partition")
    public String partition;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static PreviewMCTableRequest build(java.util.Map<String, ?> map) throws Exception {
        PreviewMCTableRequest self = new PreviewMCTableRequest();
        return TeaModel.build(map, self);
    }

    public PreviewMCTableRequest setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }
    public String getEndpoint() {
        return this.endpoint;
    }

    public PreviewMCTableRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public PreviewMCTableRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public PreviewMCTableRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
