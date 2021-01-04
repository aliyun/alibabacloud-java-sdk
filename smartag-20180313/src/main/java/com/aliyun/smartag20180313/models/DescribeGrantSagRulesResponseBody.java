// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeGrantSagRulesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("GrantRules")
    public DescribeGrantSagRulesResponseBodyGrantRules grantRules;

    public static DescribeGrantSagRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantSagRulesResponseBody self = new DescribeGrantSagRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGrantSagRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGrantSagRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGrantSagRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGrantSagRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGrantSagRulesResponseBody setGrantRules(DescribeGrantSagRulesResponseBodyGrantRules grantRules) {
        this.grantRules = grantRules;
        return this;
    }
    public DescribeGrantSagRulesResponseBodyGrantRules getGrantRules() {
        return this.grantRules;
    }

    public static class DescribeGrantSagRulesResponseBodyGrantRulesGrantRule extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("SmartAGId")
        public String smartAGId;

        @NameInMap("GrantTrafficService")
        public Boolean grantTrafficService;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("CcnUid")
        public Long ccnUid;

        @NameInMap("CcnInstanceId")
        public String ccnInstanceId;

        public static DescribeGrantSagRulesResponseBodyGrantRulesGrantRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantSagRulesResponseBodyGrantRulesGrantRule self = new DescribeGrantSagRulesResponseBodyGrantRulesGrantRule();
            return TeaModel.build(map, self);
        }

        public DescribeGrantSagRulesResponseBodyGrantRulesGrantRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGrantSagRulesResponseBodyGrantRulesGrantRule setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public DescribeGrantSagRulesResponseBodyGrantRulesGrantRule setGrantTrafficService(Boolean grantTrafficService) {
            this.grantTrafficService = grantTrafficService;
            return this;
        }
        public Boolean getGrantTrafficService() {
            return this.grantTrafficService;
        }

        public DescribeGrantSagRulesResponseBodyGrantRulesGrantRule setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGrantSagRulesResponseBodyGrantRulesGrantRule setCcnUid(Long ccnUid) {
            this.ccnUid = ccnUid;
            return this;
        }
        public Long getCcnUid() {
            return this.ccnUid;
        }

        public DescribeGrantSagRulesResponseBodyGrantRulesGrantRule setCcnInstanceId(String ccnInstanceId) {
            this.ccnInstanceId = ccnInstanceId;
            return this;
        }
        public String getCcnInstanceId() {
            return this.ccnInstanceId;
        }

    }

    public static class DescribeGrantSagRulesResponseBodyGrantRules extends TeaModel {
        @NameInMap("GrantRule")
        public java.util.List<DescribeGrantSagRulesResponseBodyGrantRulesGrantRule> grantRule;

        public static DescribeGrantSagRulesResponseBodyGrantRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantSagRulesResponseBodyGrantRules self = new DescribeGrantSagRulesResponseBodyGrantRules();
            return TeaModel.build(map, self);
        }

        public DescribeGrantSagRulesResponseBodyGrantRules setGrantRule(java.util.List<DescribeGrantSagRulesResponseBodyGrantRulesGrantRule> grantRule) {
            this.grantRule = grantRule;
            return this;
        }
        public java.util.List<DescribeGrantSagRulesResponseBodyGrantRulesGrantRule> getGrantRule() {
            return this.grantRule;
        }

    }

}
