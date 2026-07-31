// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sfmmultimodalapp20250909.models;

import com.aliyun.tea.*;

public class QuerySelectOptionsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QuerySelectOptionsRequest build(java.util.Map<String, ?> map) throws Exception {
        QuerySelectOptionsRequest self = new QuerySelectOptionsRequest();
        return TeaModel.build(map, self);
    }

    public QuerySelectOptionsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
