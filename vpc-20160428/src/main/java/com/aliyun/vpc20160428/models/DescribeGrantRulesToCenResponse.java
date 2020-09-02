// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesToCenResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Integer totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Integer pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Integer pageSize;

    @NameInMap("CenGrantRules")
    @Validation(required = true)
    public DescribeGrantRulesToCenResponseCenGrantRules cenGrantRules;

    public static DescribeGrantRulesToCenResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesToCenResponse self = new DescribeGrantRulesToCenResponse();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesToCenResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGrantRulesToCenResponse setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGrantRulesToCenResponse setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGrantRulesToCenResponse setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGrantRulesToCenResponse setCenGrantRules(DescribeGrantRulesToCenResponseCenGrantRules cenGrantRules) {
        this.cenGrantRules = cenGrantRules;
        return this;
    }
    public DescribeGrantRulesToCenResponseCenGrantRules getCenGrantRules() {
        return this.cenGrantRules;
    }

    public static class DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule extends TeaModel {
        @NameInMap("CenInstanceId")
        @Validation(required = true)
        public String cenInstanceId;

        @NameInMap("CenOwnerId")
        @Validation(required = true)
        public Long cenOwnerId;

        @NameInMap("CreationTime")
        @Validation(required = true)
        public String creationTime;

        public static DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule self = new DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule setCenInstanceId(String cenInstanceId) {
            this.cenInstanceId = cenInstanceId;
            return this;
        }
        public String getCenInstanceId() {
            return this.cenInstanceId;
        }

        public DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule setCenOwnerId(Long cenOwnerId) {
            this.cenOwnerId = cenOwnerId;
            return this;
        }
        public Long getCenOwnerId() {
            return this.cenOwnerId;
        }

        public DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

    }

    public static class DescribeGrantRulesToCenResponseCenGrantRules extends TeaModel {
        @NameInMap("CbnGrantRule")
        @Validation(required = true)
        public java.util.List<DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule> cbnGrantRule;

        public static DescribeGrantRulesToCenResponseCenGrantRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesToCenResponseCenGrantRules self = new DescribeGrantRulesToCenResponseCenGrantRules();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesToCenResponseCenGrantRules setCbnGrantRule(java.util.List<DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule> cbnGrantRule) {
            this.cbnGrantRule = cbnGrantRule;
            return this;
        }
        public java.util.List<DescribeGrantRulesToCenResponseCenGrantRulesCbnGrantRule> getCbnGrantRule() {
            return this.cbnGrantRule;
        }

    }

}
