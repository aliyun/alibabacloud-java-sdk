// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class BatchqueryODPOperationAuditRequest extends TeaModel {
    @NameInMap("Desc")
    public Boolean desc;

    @NameInMap("FilterKey")
    public String filterKey;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OrderByField")
    public String orderByField;

    @NameInMap("PageNum")
    public Long pageNum;

    @NameInMap("PageSize")
    public Long pageSize;

    public static BatchqueryODPOperationAuditRequest build(java.util.Map<String, ?> map) throws Exception {
        BatchqueryODPOperationAuditRequest self = new BatchqueryODPOperationAuditRequest();
        return TeaModel.build(map, self);
    }

    public BatchqueryODPOperationAuditRequest setDesc(Boolean desc) {
        this.desc = desc;
        return this;
    }
    public Boolean getDesc() {
        return this.desc;
    }

    public BatchqueryODPOperationAuditRequest setFilterKey(String filterKey) {
        this.filterKey = filterKey;
        return this;
    }
    public String getFilterKey() {
        return this.filterKey;
    }

    public BatchqueryODPOperationAuditRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public BatchqueryODPOperationAuditRequest setOrderByField(String orderByField) {
        this.orderByField = orderByField;
        return this;
    }
    public String getOrderByField() {
        return this.orderByField;
    }

    public BatchqueryODPOperationAuditRequest setPageNum(Long pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Long getPageNum() {
        return this.pageNum;
    }

    public BatchqueryODPOperationAuditRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

}
