// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentsStatisticsRequest extends TeaModel {
    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    @NameInMap("Source")
    public String source;

    public static GetExperimentsStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentsStatisticsRequest self = new GetExperimentsStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentsStatisticsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

    public GetExperimentsStatisticsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

}
