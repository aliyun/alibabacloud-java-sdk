// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCASAppserviceRequest extends TeaModel {
    @NameInMap("IdsRepeatList")
    public java.util.List<String> idsRepeatList;

    @NameInMap("WorkspaceId")
    public String workspaceId;

    public static QueryCASAppserviceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCASAppserviceRequest self = new QueryCASAppserviceRequest();
        return TeaModel.build(map, self);
    }

    public QueryCASAppserviceRequest setIdsRepeatList(java.util.List<String> idsRepeatList) {
        this.idsRepeatList = idsRepeatList;
        return this;
    }
    public java.util.List<String> getIdsRepeatList() {
        return this.idsRepeatList;
    }

    public QueryCASAppserviceRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

}
