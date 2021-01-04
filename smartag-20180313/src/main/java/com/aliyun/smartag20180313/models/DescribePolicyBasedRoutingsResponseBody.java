// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribePolicyBasedRoutingsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PolicyBasedRoutings")
    public DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutings policyBasedRoutings;

    public static DescribePolicyBasedRoutingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePolicyBasedRoutingsResponseBody self = new DescribePolicyBasedRoutingsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePolicyBasedRoutingsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribePolicyBasedRoutingsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribePolicyBasedRoutingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePolicyBasedRoutingsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribePolicyBasedRoutingsResponseBody setPolicyBasedRoutings(DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutings policyBasedRoutings) {
        this.policyBasedRoutings = policyBasedRoutings;
        return this;
    }
    public DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutings getPolicyBasedRoutings() {
        return this.policyBasedRoutings;
    }

    public static class DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("PbrInstanceId")
        public String pbrInstanceId;

        @NameInMap("Priority")
        public Integer priority;

        @NameInMap("Name")
        public String name;

        public static DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting self = new DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting setPbrInstanceId(String pbrInstanceId) {
            this.pbrInstanceId = pbrInstanceId;
            return this;
        }
        public String getPbrInstanceId() {
            return this.pbrInstanceId;
        }

        public DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

        public DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutings extends TeaModel {
        @NameInMap("PolicyBasedRouting")
        public java.util.List<DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting> policyBasedRouting;

        public static DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutings build(java.util.Map<String, ?> map) throws Exception {
            DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutings self = new DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutings();
            return TeaModel.build(map, self);
        }

        public DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutings setPolicyBasedRouting(java.util.List<DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting> policyBasedRouting) {
            this.policyBasedRouting = policyBasedRouting;
            return this;
        }
        public java.util.List<DescribePolicyBasedRoutingsResponseBodyPolicyBasedRoutingsPolicyBasedRouting> getPolicyBasedRouting() {
            return this.policyBasedRouting;
        }

    }

}
