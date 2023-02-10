// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListRuleTargetAllResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleTargetList")
    public java.util.List<ListRuleTargetAllResponseBodyRuleTargetList> ruleTargetList;

    public static ListRuleTargetAllResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRuleTargetAllResponseBody self = new ListRuleTargetAllResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRuleTargetAllResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListRuleTargetAllResponseBody setRuleTargetList(java.util.List<ListRuleTargetAllResponseBodyRuleTargetList> ruleTargetList) {
        this.ruleTargetList = ruleTargetList;
        return this;
    }
    public java.util.List<ListRuleTargetAllResponseBodyRuleTargetList> getRuleTargetList() {
        return this.ruleTargetList;
    }

    public static class ListRuleTargetAllResponseBodyRuleTargetList extends TeaModel {
        @NameInMap("TargetId")
        public Long targetId;

        @NameInMap("TargetName")
        public String targetName;

        @NameInMap("TargetType")
        public String targetType;

        public static ListRuleTargetAllResponseBodyRuleTargetList build(java.util.Map<String, ?> map) throws Exception {
            ListRuleTargetAllResponseBodyRuleTargetList self = new ListRuleTargetAllResponseBodyRuleTargetList();
            return TeaModel.build(map, self);
        }

        public ListRuleTargetAllResponseBodyRuleTargetList setTargetId(Long targetId) {
            this.targetId = targetId;
            return this;
        }
        public Long getTargetId() {
            return this.targetId;
        }

        public ListRuleTargetAllResponseBodyRuleTargetList setTargetName(String targetName) {
            this.targetName = targetName;
            return this;
        }
        public String getTargetName() {
            return this.targetName;
        }

        public ListRuleTargetAllResponseBodyRuleTargetList setTargetType(String targetType) {
            this.targetType = targetType;
            return this;
        }
        public String getTargetType() {
            return this.targetType;
        }

    }

}
