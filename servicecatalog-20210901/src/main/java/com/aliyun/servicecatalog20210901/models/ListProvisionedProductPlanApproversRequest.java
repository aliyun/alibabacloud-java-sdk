// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductPlanApproversRequest extends TeaModel {
    /**
     * <p>The access filter. Valid values:</p>
     * <br>
     * <p>*   User (default): queries the plans that are created by the current requester.</p>
     * <p>*   Account: queries the plans that belong to the current Alibaba Cloud account.</p>
     * <p>*   ResourceDirectory: queries the plans that belong to the current resource directory.</p>
     * <br>
     * <p>>  You must specify one of the `ApprovalFilter` and `AccessLevelFilter` parameters, but not both.</p>
     */
    @NameInMap("AccessLevelFilter")
    public String accessLevelFilter;

    /**
     * <p>The access filter of the review dimension. Valid values:</p>
     * <br>
     * <p>*   AccountRequests: queries all reviewed plans that belong to the current Alibaba Cloud account.</p>
     * <p>*   ResourceDirectoryRequests: queries all plans that belong to the current resource directory.</p>
     * <br>
     * <p>>  You must specify one of the `ApprovalFilter` and `AccessLevelFilter` parameters, but not both.</p>
     */
    @NameInMap("ApprovalFilter")
    public String approvalFilter;

    /**
     * <p>An array that consists of filter conditions.</p>
     */
    @NameInMap("Filters")
    public java.util.List<ListProvisionedProductPlanApproversRequestFilters> filters;

    public static ListProvisionedProductPlanApproversRequest build(java.util.Map<String, ?> map) throws Exception {
        ListProvisionedProductPlanApproversRequest self = new ListProvisionedProductPlanApproversRequest();
        return TeaModel.build(map, self);
    }

    public ListProvisionedProductPlanApproversRequest setAccessLevelFilter(String accessLevelFilter) {
        this.accessLevelFilter = accessLevelFilter;
        return this;
    }
    public String getAccessLevelFilter() {
        return this.accessLevelFilter;
    }

    public ListProvisionedProductPlanApproversRequest setApprovalFilter(String approvalFilter) {
        this.approvalFilter = approvalFilter;
        return this;
    }
    public String getApprovalFilter() {
        return this.approvalFilter;
    }

    public ListProvisionedProductPlanApproversRequest setFilters(java.util.List<ListProvisionedProductPlanApproversRequestFilters> filters) {
        this.filters = filters;
        return this;
    }
    public java.util.List<ListProvisionedProductPlanApproversRequestFilters> getFilters() {
        return this.filters;
    }

    public static class ListProvisionedProductPlanApproversRequestFilters extends TeaModel {
        /**
         * <p>The name of the filter condition. Valid values:</p>
         * <br>
         * <p>*   ProvisionedProductPlanApproverName: performs fuzzy match by reviewer name.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the filter condition.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListProvisionedProductPlanApproversRequestFilters build(java.util.Map<String, ?> map) throws Exception {
            ListProvisionedProductPlanApproversRequestFilters self = new ListProvisionedProductPlanApproversRequestFilters();
            return TeaModel.build(map, self);
        }

        public ListProvisionedProductPlanApproversRequestFilters setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListProvisionedProductPlanApproversRequestFilters setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
