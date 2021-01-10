// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPSqlAuditSummaryRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("QueryJsonStr")
    public String queryJsonStr;

    public static QueryODPSqlAuditSummaryRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryODPSqlAuditSummaryRequest self = new QueryODPSqlAuditSummaryRequest();
        return TeaModel.build(map, self);
    }

    public QueryODPSqlAuditSummaryRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryODPSqlAuditSummaryRequest setQueryJsonStr(String queryJsonStr) {
        this.queryJsonStr = queryJsonStr;
        return this;
    }
    public String getQueryJsonStr() {
        return this.queryJsonStr;
    }

}
