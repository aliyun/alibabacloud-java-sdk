// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20210202.models;

import com.aliyun.tea.*;

public class GetExperimentsUsersStatisticsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PaiStudio</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static GetExperimentsUsersStatisticsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetExperimentsUsersStatisticsRequest self = new GetExperimentsUsersStatisticsRequest();
        return TeaModel.build(map, self);
    }

    public GetExperimentsUsersStatisticsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public GetExperimentsUsersStatisticsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
