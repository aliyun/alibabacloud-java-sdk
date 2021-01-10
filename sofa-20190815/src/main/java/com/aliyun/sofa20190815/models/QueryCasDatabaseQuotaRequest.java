// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryCasDatabaseQuotaRequest extends TeaModel {
    @NameInMap("Workspace")
    public String workspace;

    public static QueryCasDatabaseQuotaRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryCasDatabaseQuotaRequest self = new QueryCasDatabaseQuotaRequest();
        return TeaModel.build(map, self);
    }

    public QueryCasDatabaseQuotaRequest setWorkspace(String workspace) {
        this.workspace = workspace;
        return this;
    }
    public String getWorkspace() {
        return this.workspace;
    }

}
