// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToCenResponseBody extends TeaModel {
    /**
     * <p>The information about the authorization.</p>
     */
    @NameInMap("CenGrantRules")
    public DescribeGrantRulesToCenResponseBodyCenGrantRules cenGrantRules;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>F5BB78C8-5F41-464F-B9FF-5E0A7198BA26</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeGrantRulesToCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToCenResponseBody self = new DescribeGrantRulesToCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToCenResponseBody setCenGrantRules(DescribeGrantRulesToCenResponseBodyCenGrantRules cenGrantRules) {
        this.cenGrantRules = cenGrantRules;
        return this;
    }
    public DescribeGrantRulesToCenResponseBodyCenGrantRules getCenGrantRules() {
        return this.cenGrantRules;
    }

    public DescribeGrantRulesToCenResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGrantRulesToCenResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGrantRulesToCenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGrantRulesToCenResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule extends TeaModel {
        /**
         * <p>The ID of the authorized CEN instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cen-9gsm1q2yh1prpt****</p>
         */
        @NameInMap("CenInstanceId")
        public String cenInstanceId;

        /**
         * <p>The UID of the Alibaba Cloud account to which the authorized CEN instance belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>132193271328****</p>
         */
        @NameInMap("CenOwnerId")
        public Long cenOwnerId;

        /**
         * <p>The time when the instance was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-11-15T09:26:36Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        public static DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule self = new DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule setCenInstanceId(String cenInstanceId) {
            this.cenInstanceId = cenInstanceId;
            return this;
        }
        public String getCenInstanceId() {
            return this.cenInstanceId;
        }

        public DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule setCenOwnerId(Long cenOwnerId) {
            this.cenOwnerId = cenOwnerId;
            return this;
        }
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        public DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

    }

    public static class DescribeGrantRulesToCenResponseBodyCenGrantRules extends TeaModel {
        @NameInMap("CbnGrantRule")
        public java.util.List<DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule> cbnGrantRule;

        public static DescribeGrantRulesToCenResponseBodyCenGrantRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToCenResponseBodyCenGrantRules self = new DescribeGrantRulesToCenResponseBodyCenGrantRules();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesToCenResponseBodyCenGrantRules setCbnGrantRule(java.util.List<DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule> cbnGrantRule) {
            this.cbnGrantRule = cbnGrantRule;
            return this;
        }
        public java.util.List<DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule> getCbnGrantRule() {
            return this.cbnGrantRule;
        }

    }

}
