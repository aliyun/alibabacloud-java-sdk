// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppFollowCallRuleResponseBody extends TeaModel {
    // 获取用户体验阈值规则相关数据
    @NameInMap("AppFollowCallRule")
    public DescribeAppFollowCallRuleResponseBodyAppFollowCallRule appFollowCallRule;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppFollowCallRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppFollowCallRuleResponseBody self = new DescribeAppFollowCallRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppFollowCallRuleResponseBody setAppFollowCallRule(DescribeAppFollowCallRuleResponseBodyAppFollowCallRule appFollowCallRule) {
        this.appFollowCallRule = appFollowCallRule;
        return this;
    }
    public DescribeAppFollowCallRuleResponseBodyAppFollowCallRule getAppFollowCallRule() {
        return this.appFollowCallRule;
    }

    public DescribeAppFollowCallRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppFollowCallRuleResponseBodyAppFollowCallRule extends TeaModel {
        // 应用ID
        @NameInMap("AppId")
        public String appId;

        // 具体规则，JSON格式
        @NameInMap("Rule")
        public String rule;

        // 创建时间，秒级时间戳，如1614936817
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 修改时间，秒级时间戳，如1614936817
        @NameInMap("ModifiedTs")
        public Long modifiedTs;

        @NameInMap("GmtCreateTs")
        public Long gmtCreateTs;

        @NameInMap("GmtModifiedTs")
        public Long gmtModifiedTs;

        public static DescribeAppFollowCallRuleResponseBodyAppFollowCallRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppFollowCallRuleResponseBodyAppFollowCallRule self = new DescribeAppFollowCallRuleResponseBodyAppFollowCallRule();
            return TeaModel.build(map, self);
        }

        public DescribeAppFollowCallRuleResponseBodyAppFollowCallRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppFollowCallRuleResponseBodyAppFollowCallRule setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public DescribeAppFollowCallRuleResponseBodyAppFollowCallRule setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeAppFollowCallRuleResponseBodyAppFollowCallRule setModifiedTs(Long modifiedTs) {
            this.modifiedTs = modifiedTs;
            return this;
        }
        public Long getModifiedTs() {
            return this.modifiedTs;
        }

        public DescribeAppFollowCallRuleResponseBodyAppFollowCallRule setGmtCreateTs(Long gmtCreateTs) {
            this.gmtCreateTs = gmtCreateTs;
            return this;
        }
        public Long getGmtCreateTs() {
            return this.gmtCreateTs;
        }

        public DescribeAppFollowCallRuleResponseBodyAppFollowCallRule setGmtModifiedTs(Long gmtModifiedTs) {
            this.gmtModifiedTs = gmtModifiedTs;
            return this;
        }
        public Long getGmtModifiedTs() {
            return this.gmtModifiedTs;
        }

    }

}
