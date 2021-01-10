// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchQueryRmsMonitorMetricsRequest extends TeaModel {
    @NameInMap("QueryBatchJsonStr")
    public String queryBatchJsonStr;

    @NameInMap("TenantName")
    public String tenantName;

    @NameInMap("WorkspaceName")
    public String workspaceName;

    public static BatchQueryRmsMonitorMetricsRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchQueryRmsMonitorMetricsRequest self = new BatchQueryRmsMonitorMetricsRequest();
        return TeaModel.build(map, self);
    }

    public BatchQueryRmsMonitorMetricsRequest setQueryBatchJsonStr(String queryBatchJsonStr) {
        this.queryBatchJsonStr = queryBatchJsonStr;
        return this;
    }
    public String getQueryBatchJsonStr() {
        return this.queryBatchJsonStr;
    }

    public BatchQueryRmsMonitorMetricsRequest setTenantName(String tenantName) {
        this.tenantName = tenantName;
        return this;
    }
    public String getTenantName() {
        return this.tenantName;
    }

    public BatchQueryRmsMonitorMetricsRequest setWorkspaceName(String workspaceName) {
        this.workspaceName = workspaceName;
        return this;
    }
    public String getWorkspaceName() {
        return this.workspaceName;
    }

}
