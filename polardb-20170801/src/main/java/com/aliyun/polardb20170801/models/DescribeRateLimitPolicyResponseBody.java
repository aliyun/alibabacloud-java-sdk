// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeRateLimitPolicyResponseBody extends TeaModel {
    @NameInMap("Items")
    public java.util.List<DescribeRateLimitPolicyResponseBodyItems> items;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageRecordCount")
    public String pageRecordCount;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CED079B7-A408-41A1-BFF1-EC608E******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalRecordCount")
    public String totalRecordCount;

    public static DescribeRateLimitPolicyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRateLimitPolicyResponseBody self = new DescribeRateLimitPolicyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRateLimitPolicyResponseBody setItems(java.util.List<DescribeRateLimitPolicyResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeRateLimitPolicyResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeRateLimitPolicyResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeRateLimitPolicyResponseBody setPageRecordCount(String pageRecordCount) {
        this.pageRecordCount = pageRecordCount;
        return this;
    }
    public String getPageRecordCount() {
        return this.pageRecordCount;
    }

    public DescribeRateLimitPolicyResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeRateLimitPolicyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRateLimitPolicyResponseBody setTotalRecordCount(String totalRecordCount) {
        this.totalRecordCount = totalRecordCount;
        return this;
    }
    public String getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static class DescribeRateLimitPolicyResponseBodyItems extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-12-01T17:52:05+08:00</p>
         */
        @NameInMap("GmtCreated")
        public String gmtCreated;

        /**
         * <strong>example:</strong>
         * <p>2026-01-19T16:47:25+08:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>pg-xxxxxxxx</p>
         */
        @NameInMap("GwClusterId")
        public String gwClusterId;

        /**
         * <strong>example:</strong>
         * <p>02eccf7c61cf4d05a543075ee907f3**</p>
         */
        @NameInMap("PolicyId")
        public String policyId;

        /**
         * <strong>example:</strong>
         * <p>RateLimit</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RateLimitRpm")
        public String rateLimitRpm;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RateLimitTpm")
        public String rateLimitTpm;

        /**
         * <strong>example:</strong>
         * <p>cg-xxxxxxx</p>
         */
        @NameInMap("ScopeRefId")
        public String scopeRefId;

        /**
         * <strong>example:</strong>
         * <p>ConsumerGroup</p>
         */
        @NameInMap("ScopeType")
        public String scopeType;

        /**
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeRateLimitPolicyResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeRateLimitPolicyResponseBodyItems self = new DescribeRateLimitPolicyResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeRateLimitPolicyResponseBodyItems setGmtCreated(String gmtCreated) {
            this.gmtCreated = gmtCreated;
            return this;
        }
        public String getGmtCreated() {
            return this.gmtCreated;
        }

        public DescribeRateLimitPolicyResponseBodyItems setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeRateLimitPolicyResponseBodyItems setGwClusterId(String gwClusterId) {
            this.gwClusterId = gwClusterId;
            return this;
        }
        public String getGwClusterId() {
            return this.gwClusterId;
        }

        public DescribeRateLimitPolicyResponseBodyItems setPolicyId(String policyId) {
            this.policyId = policyId;
            return this;
        }
        public String getPolicyId() {
            return this.policyId;
        }

        public DescribeRateLimitPolicyResponseBodyItems setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

        public DescribeRateLimitPolicyResponseBodyItems setRateLimitRpm(String rateLimitRpm) {
            this.rateLimitRpm = rateLimitRpm;
            return this;
        }
        public String getRateLimitRpm() {
            return this.rateLimitRpm;
        }

        public DescribeRateLimitPolicyResponseBodyItems setRateLimitTpm(String rateLimitTpm) {
            this.rateLimitTpm = rateLimitTpm;
            return this;
        }
        public String getRateLimitTpm() {
            return this.rateLimitTpm;
        }

        public DescribeRateLimitPolicyResponseBodyItems setScopeRefId(String scopeRefId) {
            this.scopeRefId = scopeRefId;
            return this;
        }
        public String getScopeRefId() {
            return this.scopeRefId;
        }

        public DescribeRateLimitPolicyResponseBodyItems setScopeType(String scopeType) {
            this.scopeType = scopeType;
            return this;
        }
        public String getScopeType() {
            return this.scopeType;
        }

        public DescribeRateLimitPolicyResponseBodyItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
