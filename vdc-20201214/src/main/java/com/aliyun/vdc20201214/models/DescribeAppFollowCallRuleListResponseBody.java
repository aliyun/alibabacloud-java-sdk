// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeAppFollowCallRuleListResponseBody extends TeaModel {
    // 通信监测关注规则相关数据列表
    @NameInMap("AppFollowCallRuleList")
    public java.util.List<DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList> appFollowCallRuleList;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeAppFollowCallRuleListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAppFollowCallRuleListResponseBody self = new DescribeAppFollowCallRuleListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAppFollowCallRuleListResponseBody setAppFollowCallRuleList(java.util.List<DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList> appFollowCallRuleList) {
        this.appFollowCallRuleList = appFollowCallRuleList;
        return this;
    }
    public java.util.List<DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList> getAppFollowCallRuleList() {
        return this.appFollowCallRuleList;
    }

    public DescribeAppFollowCallRuleListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList extends TeaModel {
        // 应用ID
        @NameInMap("AppId")
        public String appId;

        // 具体规则，JSON格式
        @NameInMap("Rule")
        public String rule;

        // 创建时间，秒级时间戳，如1614836732
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 修改时间，秒级时间戳，如1614836732
        @NameInMap("ModifiedTs")
        public Long modifiedTs;

        // 创建时间，待删除
        @NameInMap("GmtCreateTs")
        public Long gmtCreateTs;

        // 修改时间，待删除
        @NameInMap("GmtModifiedTs")
        public Long gmtModifiedTs;

        public static DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList self = new DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList setRule(String rule) {
            this.rule = rule;
            return this;
        }
        public String getRule() {
            return this.rule;
        }

        public DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList setModifiedTs(Long modifiedTs) {
            this.modifiedTs = modifiedTs;
            return this;
        }
        public Long getModifiedTs() {
            return this.modifiedTs;
        }

        public DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList setGmtCreateTs(Long gmtCreateTs) {
            this.gmtCreateTs = gmtCreateTs;
            return this;
        }
        public Long getGmtCreateTs() {
            return this.gmtCreateTs;
        }

        public DescribeAppFollowCallRuleListResponseBodyAppFollowCallRuleList setGmtModifiedTs(Long gmtModifiedTs) {
            this.gmtModifiedTs = gmtModifiedTs;
            return this;
        }
        public Long getGmtModifiedTs() {
            return this.gmtModifiedTs;
        }

    }

}
