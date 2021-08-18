// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppExpMetricRuleResponseBody extends TeaModel {
    // 获取用户体验阈值规则相关数据
    @NameInMap("AppExpMetricRule")
    public DescribeAppExpMetricRuleResponseBodyAppExpMetricRule appExpMetricRule;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppExpMetricRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppExpMetricRuleResponseBody self = new DescribeAppExpMetricRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppExpMetricRuleResponseBody setAppExpMetricRule(DescribeAppExpMetricRuleResponseBodyAppExpMetricRule appExpMetricRule) {
        this.appExpMetricRule = appExpMetricRule;
        return this;
    }
    public DescribeAppExpMetricRuleResponseBodyAppExpMetricRule getAppExpMetricRule() {
        return this.appExpMetricRule;
    }

    public DescribeAppExpMetricRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppExpMetricRuleResponseBodyAppExpMetricRule extends TeaModel {
        // 应用ID
        @NameInMap("AppId")
        public String appId;

        // 具体规则，JSON格式
        @NameInMap("Rule")
        public String rule;

        // 创建时间，秒级时间戳，如1614912647
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 修改时间，秒级时间戳，如1615272998
        @NameInMap("ModifiedTs")
        public Long modifiedTs;

        @NameInMap("GmtCreateTs")
        public Long gmtCreateTs;

        @NameInMap("GmtModifiedTs")
        public Long gmtModifiedTs;

        public static DescribeAppExpMetricRuleResponseBodyAppExpMetricRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppExpMetricRuleResponseBodyAppExpMetricRule self = new DescribeAppExpMetricRuleResponseBodyAppExpMetricRule();
            return TeaModel.build(map, self);
        }

        public DescribeAppExpMetricRuleResponseBodyAppExpMetricRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppExpMetricRuleResponseBodyAppExpMetricRule setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public DescribeAppExpMetricRuleResponseBodyAppExpMetricRule setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeAppExpMetricRuleResponseBodyAppExpMetricRule setModifiedTs(Long modifiedTs) {
            this.modifiedTs = modifiedTs;
            return this;
        }
        public Long getModifiedTs() {
            return this.modifiedTs;
        }

        public DescribeAppExpMetricRuleResponseBodyAppExpMetricRule setGmtCreateTs(Long gmtCreateTs) {
            this.gmtCreateTs = gmtCreateTs;
            return this;
        }
        public Long getGmtCreateTs() {
            return this.gmtCreateTs;
        }

        public DescribeAppExpMetricRuleResponseBodyAppExpMetricRule setGmtModifiedTs(Long gmtModifiedTs) {
            this.gmtModifiedTs = gmtModifiedTs;
            return this;
        }
        public Long getGmtModifiedTs() {
            return this.gmtModifiedTs;
        }

    }

}
