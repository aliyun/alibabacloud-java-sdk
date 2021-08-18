// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppExpMetricRuleListResponseBody extends TeaModel {
    // 用户体验阈值规则相关数据列表
    @NameInMap("AppExpMetricRuleList")
    public java.util.List<DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList> appExpMetricRuleList;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppExpMetricRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppExpMetricRuleListResponseBody self = new DescribeAppExpMetricRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppExpMetricRuleListResponseBody setAppExpMetricRuleList(java.util.List<DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList> appExpMetricRuleList) {
        this.appExpMetricRuleList = appExpMetricRuleList;
        return this;
    }
    public java.util.List<DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList> getAppExpMetricRuleList() {
        return this.appExpMetricRuleList;
    }

    public DescribeAppExpMetricRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList extends TeaModel {
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

        public static DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList self = new DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList setModifiedTs(Long modifiedTs) {
            this.modifiedTs = modifiedTs;
            return this;
        }
        public Long getModifiedTs() {
            return this.modifiedTs;
        }

        public DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList setGmtCreateTs(Long gmtCreateTs) {
            this.gmtCreateTs = gmtCreateTs;
            return this;
        }
        public Long getGmtCreateTs() {
            return this.gmtCreateTs;
        }

        public DescribeAppExpMetricRuleListResponseBodyAppExpMetricRuleList setGmtModifiedTs(Long gmtModifiedTs) {
            this.gmtModifiedTs = gmtModifiedTs;
            return this;
        }
        public Long getGmtModifiedTs() {
            return this.gmtModifiedTs;
        }

    }

}
