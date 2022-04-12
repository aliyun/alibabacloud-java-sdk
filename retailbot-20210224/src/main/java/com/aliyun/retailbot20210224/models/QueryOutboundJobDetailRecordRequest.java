// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class QueryOutboundJobDetailRecordRequest extends TeaModel {
    @NameInMap("JobTaskDetailPaginatedQuery")
    public QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery jobTaskDetailPaginatedQuery;

    @NameInMap("SaasId")
    public String saasId;

    @NameInMap("UserProfile")
    public QueryOutboundJobDetailRecordRequestUserProfile userProfile;

    public static QueryOutboundJobDetailRecordRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryOutboundJobDetailRecordRequest self = new QueryOutboundJobDetailRecordRequest();
        return TeaModel.build(map, self);
    }

    public QueryOutboundJobDetailRecordRequest setJobTaskDetailPaginatedQuery(QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery jobTaskDetailPaginatedQuery) {
        this.jobTaskDetailPaginatedQuery = jobTaskDetailPaginatedQuery;
        return this;
    }
    public QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery getJobTaskDetailPaginatedQuery() {
        return this.jobTaskDetailPaginatedQuery;
    }

    public QueryOutboundJobDetailRecordRequest setSaasId(String saasId) {
        this.saasId = saasId;
        return this;
    }
    public String getSaasId() {
        return this.saasId;
    }

    public QueryOutboundJobDetailRecordRequest setUserProfile(QueryOutboundJobDetailRecordRequestUserProfile userProfile) {
        this.userProfile = userProfile;
        return this;
    }
    public QueryOutboundJobDetailRecordRequestUserProfile getUserProfile() {
        return this.userProfile;
    }

    public static class QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery extends TeaModel {
        @NameInMap("BatchNo")
        public String batchNo;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("Order")
        public String order;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("SortField")
        public String sortField;

        @NameInMap("StatusSet")
        public java.util.List<Integer> statusSet;

        public static QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery self = new QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery();
            return TeaModel.build(map, self);
        }

        public QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery setBatchNo(String batchNo) {
            this.batchNo = batchNo;
            return this;
        }
        public String getBatchNo() {
            return this.batchNo;
        }

        public QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery setSortField(String sortField) {
            this.sortField = sortField;
            return this;
        }
        public String getSortField() {
            return this.sortField;
        }

        public QueryOutboundJobDetailRecordRequestJobTaskDetailPaginatedQuery setStatusSet(java.util.List<Integer> statusSet) {
            this.statusSet = statusSet;
            return this;
        }
        public java.util.List<Integer> getStatusSet() {
            return this.statusSet;
        }

    }

    public static class QueryOutboundJobDetailRecordRequestUserProfile extends TeaModel {
        @NameInMap("AppCode")
        public String appCode;

        @NameInMap("BuId")
        public Long buId;

        @NameInMap("PlatformCode")
        public String platformCode;

        @NameInMap("TenantId")
        public Long tenantId;

        @NameInMap("UserId")
        public Long userId;

        @NameInMap("UserNick")
        public String userNick;

        public static QueryOutboundJobDetailRecordRequestUserProfile build(java.util.Map<String, ?> map) throws Exception {
            QueryOutboundJobDetailRecordRequestUserProfile self = new QueryOutboundJobDetailRecordRequestUserProfile();
            return TeaModel.build(map, self);
        }

        public QueryOutboundJobDetailRecordRequestUserProfile setAppCode(String appCode) {
            this.appCode = appCode;
            return this;
        }
        public String getAppCode() {
            return this.appCode;
        }

        public QueryOutboundJobDetailRecordRequestUserProfile setBuId(Long buId) {
            this.buId = buId;
            return this;
        }
        public Long getBuId() {
            return this.buId;
        }

        public QueryOutboundJobDetailRecordRequestUserProfile setPlatformCode(String platformCode) {
            this.platformCode = platformCode;
            return this;
        }
        public String getPlatformCode() {
            return this.platformCode;
        }

        public QueryOutboundJobDetailRecordRequestUserProfile setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

        public QueryOutboundJobDetailRecordRequestUserProfile setUserId(Long userId) {
            this.userId = userId;
            return this;
        }
        public Long getUserId() {
            return this.userId;
        }

        public QueryOutboundJobDetailRecordRequestUserProfile setUserNick(String userNick) {
            this.userNick = userNick;
            return this;
        }
        public String getUserNick() {
            return this.userNick;
        }

    }

}
