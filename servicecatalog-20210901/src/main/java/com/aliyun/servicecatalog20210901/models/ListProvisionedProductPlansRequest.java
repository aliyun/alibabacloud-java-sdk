// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductPlansRequest extends TeaModel {
    /**
     * <p>The access filter. Valid values:</p>
     * <ul>
     * <li>User (default): queries the plans that are created by the current requester.</li>
     * <li>Account: queries the plans that belong to the current Alibaba Cloud account.</li>
     * <li>ResourceDirectory: queries the plans that belong to the current resource directory.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>User</p>
     */
    @NameInMap("AccessLevelFilter")
    public String accessLevelFilter;

    /**
     * <p>The access filter of the review dimension. Valid values:</p>
     * <ul>
     * <li>ReceivedRequests: queries plans that are pending for review.</li>
     * <li>ApprovalHistory: queries review history.</li>
     * <li>AccountRequests: queries all plans that belong to the current Alibaba Cloud account.</li>
     * <li>AccountRequests: queries all plans that belong to the current Alibaba Cloud account.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ReceivedRequests</p>
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
     * <p>Pages start from page 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Valid values: 1 to 100. Minimum value: 1. Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the product instance.</p>
     * 
     * <strong>example:</strong>
     * <p>pp-bp1ddg1n2a****</p>
     */
    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

    /**
     * <p>The information based on which you want to sort the query results.</p>
     * <p>Set the value to CreateTime, which specifies the creation time of plans.</p>
     * 
     * <strong>example:</strong>
     * <p>CreateTime</p>
     */
    @NameInMap("SortBy")
    public String sortBy;

    /**
     * <p>The order in which you want to sort the query results. Valid values:</p>
     * <ul>
     * <li>Asc: the ascending order</li>
     * <li>Desc (default): the descending order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Desc</p>
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
         * <ul>
         * <li>ProvisionedProductPlanName: performs exact matches by plan name. Plan names are not case-sensitive.</li>
         * <li>ProvisionedProductPlanApprover: performs exact matches by reviewer. You must specify a reviewer in the <code>RamUser/RamRole:&lt;Name of the reviewer&gt;</code> format. You can specify multiple reviewers.</li>
         * <li>ProvisionedProductPlanApproverName: performs matches by reviewer name. You must specify the Resource Access Management (RAM) entity name of the reviewer. You can specify multiple reviewer names.</li>
         * <li>ProvisionedProductPlanStatus: performs matches by plan status. You must specify the state of the plan. You can specify multiple states.</li>
         * <li>ProvisionedProductPlanOwnerUid: performs exact matches by ID of Alibaba Cloud account to which a plan belongs.</li>
         * <li>FullTextSearch: performs fuzzy full-text searches by plan name.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FullTextSearch</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
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
