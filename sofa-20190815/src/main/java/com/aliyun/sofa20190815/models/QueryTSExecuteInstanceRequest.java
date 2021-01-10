// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSExecuteInstanceRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("Handler")
    public String handler;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("Sharding")
    public Long sharding;

    public static QueryTSExecuteInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSExecuteInstanceRequest self = new QueryTSExecuteInstanceRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSExecuteInstanceRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTSExecuteInstanceRequest setHandler(String handler) {
        this.handler = handler;
        return this;
    }
    public String getHandler() {
        return this.handler;
    }

    public QueryTSExecuteInstanceRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSExecuteInstanceRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

    public QueryTSExecuteInstanceRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSExecuteInstanceRequest setSharding(Long sharding) {
        this.sharding = sharding;
        return this;
    }
    public Long getSharding() {
        return this.sharding;
    }

}
