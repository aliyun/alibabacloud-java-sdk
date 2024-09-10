// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeBinarySecurityPoliciesResponseBody extends TeaModel {
    /**
     * <p>The information about security policies.</p>
     */
    @NameInMap("BinarySecurityPolicies")
    public java.util.List<DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies> binarySecurityPolicies;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeBinarySecurityPoliciesResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1EE7B150-D67E-53FD-A52D-3E8E669A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBinarySecurityPoliciesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBinarySecurityPoliciesResponseBody self = new DescribeBinarySecurityPoliciesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBinarySecurityPoliciesResponseBody setBinarySecurityPolicies(java.util.List<DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies> binarySecurityPolicies) {
        this.binarySecurityPolicies = binarySecurityPolicies;
        return this;
    }
    public java.util.List<DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies> getBinarySecurityPolicies() {
        return this.binarySecurityPolicies;
    }

    public DescribeBinarySecurityPoliciesResponseBody setPageInfo(DescribeBinarySecurityPoliciesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeBinarySecurityPoliciesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeBinarySecurityPoliciesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPoliciesClusters extends TeaModel {
        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c316702acdf5f45e1a9dc7fc52f21****</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespaces.</p>
         */
        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        public static DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPoliciesClusters build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPoliciesClusters self = new DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPoliciesClusters();
            return TeaModel.build(map, self);
        }

        public DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPoliciesClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPoliciesClusters setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

    }

    public static class DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies extends TeaModel {
        /**
         * <p>The information about clusters.</p>
         */
        @NameInMap("Clusters")
        public java.util.List<DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPoliciesClusters> clusters;

        /**
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>logtail</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The content of the policy. The value is in the JSON format. A key supports the following values:</p>
         * <ul>
         * <li><strong>policyMode</strong>: the type of the policy. Default value: requireAttestor.</li>
         * <li><strong>requiredAttestors</strong>: the required witnesses.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;PolicyMode\&quot;:\&quot;requireAttestor\&quot;,\&quot;RequiredAttestors\&quot;:[\&quot;test-xcs-04-11-hhht\&quot;]}</p>
         */
        @NameInMap("Policy")
        public java.util.Map<String, ?> policy;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The status of the policy. Valid values:</p>
         * <ul>
         * <li><strong>enabled</strong></li>
         * <li><strong>disabled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies self = new DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies();
            return TeaModel.build(map, self);
        }

        public DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies setClusters(java.util.List<DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPoliciesClusters> clusters) {
            this.clusters = clusters;
            return this;
        }
        public java.util.List<DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPoliciesClusters> getClusters() {
            return this.clusters;
        }

        public DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies setPolicy(java.util.Map<String, ?> policy) {
            this.policy = policy;
            return this;
        }
        public java.util.Map<String, ?> getPolicy() {
            return this.policy;
        }

        public DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public DescribeBinarySecurityPoliciesResponseBodyBinarySecurityPolicies setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeBinarySecurityPoliciesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>218</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeBinarySecurityPoliciesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeBinarySecurityPoliciesResponseBodyPageInfo self = new DescribeBinarySecurityPoliciesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeBinarySecurityPoliciesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeBinarySecurityPoliciesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeBinarySecurityPoliciesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeBinarySecurityPoliciesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
