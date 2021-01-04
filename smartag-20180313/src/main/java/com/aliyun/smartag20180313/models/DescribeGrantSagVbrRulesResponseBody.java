// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DescribeGrantSagVbrRulesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("GrantRules")
    public DescribeGrantSagVbrRulesResponseBodyGrantRules grantRules;

    public static DescribeGrantSagVbrRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeGrantSagVbrRulesResponseBody self = new DescribeGrantSagVbrRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeGrantSagVbrRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeGrantSagVbrRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeGrantSagVbrRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeGrantSagVbrRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeGrantSagVbrRulesResponseBody setGrantRules(DescribeGrantSagVbrRulesResponseBodyGrantRules grantRules) {
        this.grantRules = grantRules;
        return this;
    }
    public DescribeGrantSagVbrRulesResponseBodyGrantRules getGrantRules() {
        return this.grantRules;
    }

    public static class DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule extends TeaModel {
        @NameInMap("VbrInstanceId")
        public String vbrInstanceId;

        @NameInMap("VbrUid")
        public Long vbrUid;

        @NameInMap("VbrRegionId")
        public String vbrRegionId;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("SmartAGId")
        public String smartAGId;

        @NameInMap("Bound")
        public Boolean bound;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SmartAGUid")
        public Long smartAGUid;

        public static DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule self = new DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule();
            return TeaModel.build(map, self);
        }

        public DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule setVbrInstanceId(String vbrInstanceId) {
            this.vbrInstanceId = vbrInstanceId;
            return this;
        }
        public String getVbrInstanceId() {
            return this.vbrInstanceId;
        }

        public DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule setVbrUid(Long vbrUid) {
            this.vbrUid = vbrUid;
            return this;
        }
        public Long getVbrUid() {
            return this.vbrUid;
        }

        public DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule setVbrRegionId(String vbrRegionId) {
            this.vbrRegionId = vbrRegionId;
            return this;
        }
        public String getVbrRegionId() {
            return this.vbrRegionId;
        }

        public DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule setSmartAGId(String smartAGId) {
            this.smartAGId = smartAGId;
            return this;
        }
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule setBound(Boolean bound) {
            this.bound = bound;
            return this;
        }
        public Boolean getBound() {
            return this.bound;
        }

        public DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule setSmartAGUid(Long smartAGUid) {
            this.smartAGUid = smartAGUid;
            return this;
        }
        public Long getSmartAGUid() {
            return this.smartAGUid;
        }

    }

    public static class DescribeGrantSagVbrRulesResponseBodyGrantRules extends TeaModel {
        @NameInMap("GrantRule")
        public java.util.List<DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule> grantRule;

        public static DescribeGrantSagVbrRulesResponseBodyGrantRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeGrantSagVbrRulesResponseBodyGrantRules self = new DescribeGrantSagVbrRulesResponseBodyGrantRules();
            return TeaModel.build(map, self);
        }

        public DescribeGrantSagVbrRulesResponseBodyGrantRules setGrantRule(java.util.List<DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule> grantRule) {
            this.grantRule = grantRule;
            return this;
        }
        public java.util.List<DescribeGrantSagVbrRulesResponseBodyGrantRulesGrantRule> getGrantRule() {
            return this.grantRule;
        }

    }

}
