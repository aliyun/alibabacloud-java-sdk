// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSensitiveDefineRuleConfigResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response parameters.</p>
     */
    @NameInMap("Data")
    public GetSensitiveDefineRuleConfigResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E0618A9-D5EF-4220-9471-C42B5E92****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetSensitiveDefineRuleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetSensitiveDefineRuleConfigResponseBody self = new GetSensitiveDefineRuleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetSensitiveDefineRuleConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetSensitiveDefineRuleConfigResponseBody setData(GetSensitiveDefineRuleConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetSensitiveDefineRuleConfigResponseBodyData getData() {
        return this.data;
    }

    public GetSensitiveDefineRuleConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetSensitiveDefineRuleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetSensitiveDefineRuleConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetSensitiveDefineRuleConfigResponseBodyDataRuleTreeRuleList extends TeaModel {
        /**
         * <p>The keyword of the check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>huaweicloud_ak</p>
         */
        @NameInMap("RuleKey")
        public String ruleKey;

        /**
         * <p>The name of the check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>huaweicloud_ak</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Indicates whether the check rule is selected. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static GetSensitiveDefineRuleConfigResponseBodyDataRuleTreeRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetSensitiveDefineRuleConfigResponseBodyDataRuleTreeRuleList self = new GetSensitiveDefineRuleConfigResponseBodyDataRuleTreeRuleList();
            return TeaModel.build(map, self);
        }

        public GetSensitiveDefineRuleConfigResponseBodyDataRuleTreeRuleList setRuleKey(String ruleKey) {
            this.ruleKey = ruleKey;
            return this;
        }
        public String getRuleKey() {
            return this.ruleKey;
        }

        public GetSensitiveDefineRuleConfigResponseBodyDataRuleTreeRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetSensitiveDefineRuleConfigResponseBodyDataRuleTreeRuleList setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class GetSensitiveDefineRuleConfigResponseBodyDataRuleTree extends TeaModel {
        /**
         * <p>The category keyword of the check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("ClassKey")
        public String classKey;

        /**
         * <p>The category name of the check rule.</p>
         * 
         * <strong>example:</strong>
         * <p>password</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The list of check rules.</p>
         */
        @NameInMap("RuleList")
        public java.util.List<GetSensitiveDefineRuleConfigResponseBodyDataRuleTreeRuleList> ruleList;

        public static GetSensitiveDefineRuleConfigResponseBodyDataRuleTree build(java.util.Map<String, ?> map) throws Exception {
            GetSensitiveDefineRuleConfigResponseBodyDataRuleTree self = new GetSensitiveDefineRuleConfigResponseBodyDataRuleTree();
            return TeaModel.build(map, self);
        }

        public GetSensitiveDefineRuleConfigResponseBodyDataRuleTree setClassKey(String classKey) {
            this.classKey = classKey;
            return this;
        }
        public String getClassKey() {
            return this.classKey;
        }

        public GetSensitiveDefineRuleConfigResponseBodyDataRuleTree setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public GetSensitiveDefineRuleConfigResponseBodyDataRuleTree setRuleList(java.util.List<GetSensitiveDefineRuleConfigResponseBodyDataRuleTreeRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<GetSensitiveDefineRuleConfigResponseBodyDataRuleTreeRuleList> getRuleList() {
            return this.ruleList;
        }

    }

    public static class GetSensitiveDefineRuleConfigResponseBodyData extends TeaModel {
        /**
         * <p>Indicates whether the new rule is enabled for automatic check only on agentless detection. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EnableNewRule")
        public Integer enableNewRule;

        /**
         * <p>The custom configuration ID.</p>
         * 
         * <strong>example:</strong>
         * <p>44616</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The total number of check rules.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>The tree of the check rules.</p>
         */
        @NameInMap("RuleTree")
        public java.util.List<GetSensitiveDefineRuleConfigResponseBodyDataRuleTree> ruleTree;

        /**
         * <p>The number of selected check rules.</p>
         * 
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("SelectedCount")
        public Integer selectedCount;

        public static GetSensitiveDefineRuleConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSensitiveDefineRuleConfigResponseBodyData self = new GetSensitiveDefineRuleConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetSensitiveDefineRuleConfigResponseBodyData setEnableNewRule(Integer enableNewRule) {
            this.enableNewRule = enableNewRule;
            return this;
        }
        public Integer getEnableNewRule() {
            return this.enableNewRule;
        }

        public GetSensitiveDefineRuleConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetSensitiveDefineRuleConfigResponseBodyData setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public GetSensitiveDefineRuleConfigResponseBodyData setRuleTree(java.util.List<GetSensitiveDefineRuleConfigResponseBodyDataRuleTree> ruleTree) {
            this.ruleTree = ruleTree;
            return this;
        }
        public java.util.List<GetSensitiveDefineRuleConfigResponseBodyDataRuleTree> getRuleTree() {
            return this.ruleTree;
        }

        public GetSensitiveDefineRuleConfigResponseBodyData setSelectedCount(Integer selectedCount) {
            this.selectedCount = selectedCount;
            return this;
        }
        public Integer getSelectedCount() {
            return this.selectedCount;
        }

    }

}
