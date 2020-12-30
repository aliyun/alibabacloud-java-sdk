// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToCenResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("CenGrantRules")
    public DescribeGrantRulesToCenResponseBodyCenGrantRules cenGrantRules;

    public static DescribeGrantRulesToCenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToCenResponseBody self = new DescribeGrantRulesToCenResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToCenResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
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

    public DescribeGrantRulesToCenResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGrantRulesToCenResponseBody setCenGrantRules(DescribeGrantRulesToCenResponseBodyCenGrantRules cenGrantRules) {
        this.cenGrantRules = cenGrantRules;
        return this;
    }
    public DescribeGrantRulesToCenResponseBodyCenGrantRules getCenGrantRules() {
        return this.cenGrantRules;
    }

    public static class DescribeGrantRulesToCenResponseBodyCenGrantRulesCbnGrantRule extends TeaModel {
        @NameInMap("CenInstanceId")
        public String cenInstanceId;

        @NameInMap("CenOwnerId")
        public Long cenOwnerId;

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
