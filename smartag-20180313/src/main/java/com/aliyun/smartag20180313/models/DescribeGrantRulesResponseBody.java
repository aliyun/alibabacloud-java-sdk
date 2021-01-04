// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeGrantRulesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("GrantRules")
    public DescribeGrantRulesResponseBodyGrantRules grantRules;

    public static DescribeGrantRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantRulesResponseBody self = new DescribeGrantRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGrantRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGrantRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGrantRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGrantRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGrantRulesResponseBody setGrantRules(DescribeGrantRulesResponseBodyGrantRules grantRules) {
        this.grantRules = grantRules;
        return this;
    }
    public DescribeGrantRulesResponseBodyGrantRules getGrantRules() {
        return this.grantRules;
    }

    public static class DescribeGrantRulesResponseBodyGrantRulesGrantRule extends TeaModel {
        @NameInMap("CenInstanceId")
        public String cenInstanceId;

        @NameInMap("CenUid")
        public Long cenUid;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GrantRuleId")
        public String grantRuleId;

        @NameInMap("GrantTrafficService")
        public Boolean grantTrafficService;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("CcnUid")
        public Long ccnUid;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("CcnInstanceId")
        public String ccnInstanceId;

        public static DescribeGrantRulesResponseBodyGrantRulesGrantRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesResponseBodyGrantRulesGrantRule self = new DescribeGrantRulesResponseBodyGrantRulesGrantRule();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesResponseBodyGrantRulesGrantRule setCenInstanceId(String cenInstanceId) {
            this.cenInstanceId = cenInstanceId;
            return this;
        }
        public String getCenInstanceId() {
            return this.cenInstanceId;
        }

        public DescribeGrantRulesResponseBodyGrantRulesGrantRule setCenUid(Long cenUid) {
            this.cenUid = cenUid;
            return this;
        }
        public Long getCenUid() {
            return this.cenUid;
        }

        public DescribeGrantRulesResponseBodyGrantRulesGrantRule setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeGrantRulesResponseBodyGrantRulesGrantRule setGrantRuleId(String grantRuleId) {
            this.grantRuleId = grantRuleId;
            return this;
        }
        public String getGrantRuleId() {
            return this.grantRuleId;
        }

        public DescribeGrantRulesResponseBodyGrantRulesGrantRule setGrantTrafficService(Boolean grantTrafficService) {
            this.grantTrafficService = grantTrafficService;
            return this;
        }
        public Boolean getGrantTrafficService() {
            return this.grantTrafficService;
        }

        public DescribeGrantRulesResponseBodyGrantRulesGrantRule setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeGrantRulesResponseBodyGrantRulesGrantRule setCcnUid(Long ccnUid) {
            this.ccnUid = ccnUid;
            return this;
        }
        public Long getCcnUid() {
            return this.ccnUid;
        }

        public DescribeGrantRulesResponseBodyGrantRulesGrantRule setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeGrantRulesResponseBodyGrantRulesGrantRule setCcnInstanceId(String ccnInstanceId) {
            this.ccnInstanceId = ccnInstanceId;
            return this;
        }
        public String getCcnInstanceId() {
            return this.ccnInstanceId;
        }

    }

    public static class DescribeGrantRulesResponseBodyGrantRules extends TeaModel {
        @NameInMap("GrantRule")
        public java.util.List<DescribeGrantRulesResponseBodyGrantRulesGrantRule> grantRule;

        public static DescribeGrantRulesResponseBodyGrantRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantRulesResponseBodyGrantRules self = new DescribeGrantRulesResponseBodyGrantRules();
            return TeaModel.build(map, self);
        }

        public DescribeGrantRulesResponseBodyGrantRules setGrantRule(java.util.List<DescribeGrantRulesResponseBodyGrantRulesGrantRule> grantRule) {
            this.grantRule = grantRule;
            return this;
        }
        public java.util.List<DescribeGrantRulesResponseBodyGrantRulesGrantRule> getGrantRule() {
            return this.grantRule;
        }

    }

}
