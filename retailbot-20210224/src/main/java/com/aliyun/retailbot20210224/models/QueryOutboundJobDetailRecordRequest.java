// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDetailRecordRequest extends TeaModel {
    @NameInMap("BatchNo")
    public String batchNo;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("JobId")
    public Long jobId;

    // ASC, DESC
    @NameInMap("Order")
    public String order;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SaasId")
    public String saasId;

    @NameInMap("SortField")
    public String sortField;

    @NameInMap("StatusSet")
    public java.util.List<Integer> statusSet;

    public static QueryOutboundJobDetailRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDetailRecordRequest self = new QueryOutboundJobDetailRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDetailRecordRequest setBatchNo(String batchNo) {
        this.batchNo = batchNo;
        return this;
    }
    public String getBatchNo() {
        return this.batchNo;
    }

    public QueryOutboundJobDetailRecordRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public QueryOutboundJobDetailRecordRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public QueryOutboundJobDetailRecordRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public QueryOutboundJobDetailRecordRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryOutboundJobDetailRecordRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public QueryOutboundJobDetailRecordRequest setSortField(String sortField) {
        this.sortField = sortField;
        return this;
    }
    public String getSortField() {
        return this.sortField;
    }

    public QueryOutboundJobDetailRecordRequest setStatusSet(java.util.List<Integer> statusSet) {
        this.statusSet = statusSet;
        return this;
    }
    public java.util.List<Integer> getStatusSet() {
        return this.statusSet;
    }

}
