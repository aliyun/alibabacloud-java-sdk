// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductPlansRequest extends TeaModel {
    /**
     * <p>The access filter. Valid values:</p>
     * <br>
     * <p>*   User (default): queries the plans that are created by the current requester.</p>
     * <p>*   Account: queries the plans that belong to the current Alibaba Cloud account.</p>
     * <p>*   ResourceDirectory: queries the plans that belong to the current resource directory.</p>
     */
    @NameInMap("AccessLevelFilter")
    public String accessLevelFilter;

    /**
     * <p>The access filter of the review dimension. Valid values:</p>
     * <br>
     * <p>*   ReceivedRequests: queries plans that are pending for review.</p>
     * <p>*   ApprovalHistory: queries review history.</p>
     * <p>*   AccountRequests: queries all plans that belong to the current Alibaba Cloud account.</p>
     * <p>*   AccountRequests: queries all plans that belong to the current Alibaba Cloud account.</p>
     */
    @NameInMap("ApprovalFilter")
    public String approvalFilter;

    /**
     * <p>An array that consists of filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListProvisionedProductPlansRequestFilters> filters;

    /**
     * <p>The number of the page to return.</p>
     * <br>
     * <p>Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the product instance.</p>
     */
    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

    /**
     * <p>The information based on which you want to sort the query results.</p>
     * <br>
     * <p>Set the value to CreateTime, which specifies the creation time of plans.</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The order in which you want to sort the query results. Valid values:</p>
     * <br>
     * <p>*   Asc: the ascending order</p>
     * <p>*   Desc (default): the descending order.</p>
     */
    @NameInMap("SortOrder")
    public String sortOrder;

    public static ListProvisionedProductPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionedProductPlansRequest self = new ListProvisionedProductPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListProvisionedProductPlansRequest setAccessLevelFilter(String accessLevelFilter) {
        this.accessLevelFilter = accessLevelFilter;
        return this;
    }
    public String getAccessLevelFilter() {
        return this.accessLevelFilter;
    }

    public ListProvisionedProductPlansRequest setApprovalFilter(String approvalFilter) {
        this.approvalFilter = approvalFilter;
        return this;
    }
    public String getApprovalFilter() {
        return this.approvalFilter;
    }

    public ListProvisionedProductPlansRequest setFilters(java.util.List<ListProvisionedProductPlansRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListProvisionedProductPlansRequestFilters> getFilters() {
        return this.filters;
    }

    public ListProvisionedProductPlansRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListProvisionedProductPlansRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListProvisionedProductPlansRequest setProvisionedProductId(String provisionedProductId) {
        this.provisionedProductId = provisionedProductId;
        return this;
    }
    public String getProvisionedProductId() {
        return this.provisionedProductId;
    }

    public ListProvisionedProductPlansRequest setSortBy(String sortBy) {
        this.sortBy = sortBy;
        return this;
    }
    public String getSortBy() {
        return this.sortBy;
    }

    public ListProvisionedProductPlansRequest setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static class ListProvisionedProductPlansRequestFilters extends TeaModel {
        /**
         * <p>The name of the filter condition. Valid values:</p>
         * <br>
         * <p>*   ProvisionedProductPlanName: performs exact matches by plan name. Plan names are not case-sensitive.</p>
         * <p>*   ProvisionedProductPlanApprover: performs exact matches by reviewer. You must specify a reviewer in the `RamUser/RamRole:<Name of the reviewer>` format. You can specify multiple reviewers.</p>
         * <p>*   ProvisionedProductPlanApproverName: performs matches by reviewer name. You must specify the Resource Access Management (RAM) entity name of the reviewer. You can specify multiple reviewer names.</p>
         * <p>*   ProvisionedProductPlanStatus: performs matches by plan status. You must specify the state of the plan. You can specify multiple states.</p>
         * <p>*   ProvisionedProductPlanOwnerUid: performs exact matches by ID of Alibaba Cloud account to which a plan belongs.</p>
         * <p>*   FullTextSearch: performs fuzzy full-text searches by plan name.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListProvisionedProductPlansRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionedProductPlansRequestFilters self = new ListProvisionedProductPlansRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListProvisionedProductPlansRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProvisionedProductPlansRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
