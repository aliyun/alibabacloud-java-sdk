// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class QueryDashboardNl2sqlRequest extends TeaModel {
    /**
     * <p>User ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3d7ebb8***********500078f4</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>Workspace ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>3d7ebb8***********500078f4</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryDashboardNl2sqlRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryDashboardNl2sqlRequest self = new QueryDashboardNl2sqlRequest();
        return TeaModel.build(map, self);
    }

    public QueryDashboardNl2sqlRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDashboardNl2sqlRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
