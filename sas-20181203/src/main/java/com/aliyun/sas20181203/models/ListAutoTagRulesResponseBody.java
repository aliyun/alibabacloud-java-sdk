// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ListAutoTagRulesResponseBody extends TeaModel {
    /**
     * <p>The asset auto-tagging rules.</p>
     */
    @NameInMap("AutoTagRuleList")
    public java.util.List<ListAutoTagRulesResponseBodyAutoTagRuleList> autoTagRuleList;

    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PageInfo")
    public ListAutoTagRulesResponseBodyPageInfo pageInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1383B0DB-D5D6-4B0C-9E6B-75939C8E67FE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAutoTagRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoTagRulesResponseBody self = new ListAutoTagRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoTagRulesResponseBody setAutoTagRuleList(java.util.List<ListAutoTagRulesResponseBodyAutoTagRuleList> autoTagRuleList) {
        this.autoTagRuleList = autoTagRuleList;
        return this;
    }
    public java.util.List<ListAutoTagRulesResponseBodyAutoTagRuleList> getAutoTagRuleList() {
        return this.autoTagRuleList;
    }

    public ListAutoTagRulesResponseBody setPageInfo(ListAutoTagRulesResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public ListAutoTagRulesResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public ListAutoTagRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAutoTagRulesResponseBodyAutoTagRuleList extends TeaModel {
        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>558463566374****</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The timestamp when the rule was created. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614674401000</p>
         */
        @NameInMap("CreateTimestamp")
        public Long createTimestamp;

        /**
         * <p>The expression of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;groups\&quot;:\&quot;0\&quot;,\&quot;fieldValueType\&quot;:\&quot;string\&quot;,\&quot;field\&quot;:\&quot;internetIp\&quot;,\&quot;operator\&quot;:\&quot;equals\&quot;,\&quot;value\&quot;:\&quot;12.0.0.1\&quot;}]</p>
         */
        @NameInMap("Expression")
        public String expression;

        /**
         * <p>The ID of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>900029</p>
         */
        @NameInMap("Id")
        public Integer id;

        /**
         * <p>The timestamp when the rule was last updated. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614674401000</p>
         */
        @NameInMap("ModifiedTimestamp")
        public Long modifiedTimestamp;

        /**
         * <p>The description of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>describe</p>
         */
        @NameInMap("RuleDesc")
        public String ruleDesc;

        /**
         * <p>The name of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>auto_test_rule</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The tag specified by the operation type of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;tagId\&quot;:4577447}</p>
         */
        @NameInMap("TagContext")
        public String tagContext;

        /**
         * <p>The operation type of the rule. Valid values:</p>
         * <ul>
         * <li><strong>group</strong></li>
         * <li><strong>tag</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>group</p>
         */
        @NameInMap("TagType")
        public String tagType;

        public static ListAutoTagRulesResponseBodyAutoTagRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListAutoTagRulesResponseBodyAutoTagRuleList self = new ListAutoTagRulesResponseBodyAutoTagRuleList();
            return TeaModel.build(map, self);
        }

        public ListAutoTagRulesResponseBodyAutoTagRuleList setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public ListAutoTagRulesResponseBodyAutoTagRuleList setCreateTimestamp(Long createTimestamp) {
            this.createTimestamp = createTimestamp;
            return this;
        }
        public Long getCreateTimestamp() {
            return this.createTimestamp;
        }

        public ListAutoTagRulesResponseBodyAutoTagRuleList setExpression(String expression) {
            this.expression = expression;
            return this;
        }
        public String getExpression() {
            return this.expression;
        }

        public ListAutoTagRulesResponseBodyAutoTagRuleList setId(Integer id) {
            this.id = id;
            return this;
        }
        public Integer getId() {
            return this.id;
        }

        public ListAutoTagRulesResponseBodyAutoTagRuleList setModifiedTimestamp(Long modifiedTimestamp) {
            this.modifiedTimestamp = modifiedTimestamp;
            return this;
        }
        public Long getModifiedTimestamp() {
            return this.modifiedTimestamp;
        }

        public ListAutoTagRulesResponseBodyAutoTagRuleList setRuleDesc(String ruleDesc) {
            this.ruleDesc = ruleDesc;
            return this;
        }
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        public ListAutoTagRulesResponseBodyAutoTagRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListAutoTagRulesResponseBodyAutoTagRuleList setTagContext(String tagContext) {
            this.tagContext = tagContext;
            return this;
        }
        public String getTagContext() {
            return this.tagContext;
        }

        public ListAutoTagRulesResponseBodyAutoTagRuleList setTagType(String tagType) {
            this.tagType = tagType;
            return this;
        }
        public String getTagType() {
            return this.tagType;
        }

    }

    public static class ListAutoTagRulesResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The number of entries returned on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>196</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListAutoTagRulesResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListAutoTagRulesResponseBodyPageInfo self = new ListAutoTagRulesResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public ListAutoTagRulesResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public ListAutoTagRulesResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListAutoTagRulesResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListAutoTagRulesResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
