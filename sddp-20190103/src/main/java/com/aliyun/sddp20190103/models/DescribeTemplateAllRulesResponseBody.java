// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeTemplateAllRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>769FB3C1-F4C9-4******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RuleList")
    public java.util.List<DescribeTemplateAllRulesResponseBodyRuleList> ruleList;

    public static DescribeTemplateAllRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTemplateAllRulesResponseBody self = new DescribeTemplateAllRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTemplateAllRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTemplateAllRulesResponseBody setRuleList(java.util.List<DescribeTemplateAllRulesResponseBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public java.util.List<DescribeTemplateAllRulesResponseBodyRuleList> getRuleList() {
        return this.ruleList;
    }

    public static class DescribeTemplateAllRulesResponseBodyRuleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>376</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>Model Name</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeTemplateAllRulesResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTemplateAllRulesResponseBodyRuleList self = new DescribeTemplateAllRulesResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public DescribeTemplateAllRulesResponseBodyRuleList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeTemplateAllRulesResponseBodyRuleList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
