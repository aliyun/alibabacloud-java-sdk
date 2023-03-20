// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicecatalog20210901.models;

import com.aliyun.tea.*;

public class ListProvisionedProductPlanApproversRequest extends TeaModel {
    @NameInMap("AccessLevelFilter")
    public String accessLevelFilter;

    @NameInMap("ApprovalFilter")
    public String approvalFilter;

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
        @NameInMap("Key")
        public String key;

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
