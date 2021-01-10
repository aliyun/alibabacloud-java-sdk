// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryTSChunksRequest extends TeaModel {
    @NameInMap("CurrentPage")
    public Long currentPage;

    @NameInMap("ExecuteHandler")
    public String executeHandler;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("JobRequestId")
    public String jobRequestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("ParentId")
    public Long parentId;

    public static QueryTSChunksRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryTSChunksRequest self = new QueryTSChunksRequest();
        return TeaModel.build(map, self);
    }

    public QueryTSChunksRequest setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public QueryTSChunksRequest setExecuteHandler(String executeHandler) {
        this.executeHandler = executeHandler;
        return this;
    }
    public String getExecuteHandler() {
        return this.executeHandler;
    }

    public QueryTSChunksRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryTSChunksRequest setJobRequestId(String jobRequestId) {
        this.jobRequestId = jobRequestId;
        return this;
    }
    public String getJobRequestId() {
        return this.jobRequestId;
    }

    public QueryTSChunksRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public QueryTSChunksRequest setParentId(Long parentId) {
        this.parentId = parentId;
        return this;
    }
    public Long getParentId() {
        return this.parentId;
    }

}
