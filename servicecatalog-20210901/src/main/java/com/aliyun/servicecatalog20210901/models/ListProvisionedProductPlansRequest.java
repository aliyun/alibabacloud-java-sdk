// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductPlansRequest extends TeaModel {
    @NameInMap("AccessLevelFilter")
    public String accessLevelFilter;

    @NameInMap("ApprovalFilter")
    public String approvalFilter;

    @NameInMap("Filters")
    public java.util.List<ListProvisionedProductPlansRequestFilters> filters;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ProvisionedProductId")
    public String provisionedProductId;

    @NameInMap("SortBy")
    public String sortBy;

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
        @NameInMap("Key")
        public String key;

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
