// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentsStatisticsRequest extends TeaModel {
    @NameInMap("Source")
    public String source;

    @NameInMap("WorkspaceIds")
    public String workspaceIds;

    public static GetExperimentsStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentsStatisticsRequest self = new GetExperimentsStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentsStatisticsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetExperimentsStatisticsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
