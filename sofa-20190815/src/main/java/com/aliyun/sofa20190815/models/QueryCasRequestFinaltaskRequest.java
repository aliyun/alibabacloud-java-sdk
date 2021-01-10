// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasRequestFinaltaskRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryCasRequestFinaltaskRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasRequestFinaltaskRequest self = new QueryCasRequestFinaltaskRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasRequestFinaltaskRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public QueryCasRequestFinaltaskRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
