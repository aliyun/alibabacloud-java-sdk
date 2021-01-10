// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPJobsSqlbatchRequest extends TeaModel {
    @NameInMap("FilterStatus")
    public String filterStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static BatchqueryODPJobsSqlbatchRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPJobsSqlbatchRequest self = new BatchqueryODPJobsSqlbatchRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPJobsSqlbatchRequest setFilterStatus(String filterStatus) {
        this.filterStatus = filterStatus;
        return this;
    }
    public String getFilterStatus() {
        return this.filterStatus;
    }

    public BatchqueryODPJobsSqlbatchRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchqueryODPJobsSqlbatchRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BatchqueryODPJobsSqlbatchRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
