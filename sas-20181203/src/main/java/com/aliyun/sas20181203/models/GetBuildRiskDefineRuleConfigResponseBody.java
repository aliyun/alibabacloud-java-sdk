// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBuildRiskDefineRuleConfigResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetBuildRiskDefineRuleConfigResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>69BFFCDE-37D6-5A49-A8BC-BB03AC83****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetBuildRiskDefineRuleConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetBuildRiskDefineRuleConfigResponseBody self = new GetBuildRiskDefineRuleConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetBuildRiskDefineRuleConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetBuildRiskDefineRuleConfigResponseBody setData(GetBuildRiskDefineRuleConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetBuildRiskDefineRuleConfigResponseBodyData getData() {
        return this.data;
    }

    public GetBuildRiskDefineRuleConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetBuildRiskDefineRuleConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetBuildRiskDefineRuleConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetBuildRiskDefineRuleConfigResponseBodyDataRuleTreeRuleList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("RuleKey")
        public String ruleKey;

        /**
         * <strong>example:</strong>
         * <p>used ADD</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Selected")
        public Boolean selected;

        public static GetBuildRiskDefineRuleConfigResponseBodyDataRuleTreeRuleList build(java.util.Map<String, ?> map) throws Exception {
            GetBuildRiskDefineRuleConfigResponseBodyDataRuleTreeRuleList self = new GetBuildRiskDefineRuleConfigResponseBodyDataRuleTreeRuleList();
            return TeaModel.build(map, self);
        }

        public GetBuildRiskDefineRuleConfigResponseBodyDataRuleTreeRuleList setRuleKey(String ruleKey) {
            this.ruleKey = ruleKey;
            return this;
        }
        public String getRuleKey() {
            return this.ruleKey;
        }

        public GetBuildRiskDefineRuleConfigResponseBodyDataRuleTreeRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetBuildRiskDefineRuleConfigResponseBodyDataRuleTreeRuleList setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

    }

    public static class GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("ClassKey")
        public String classKey;

        /**
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("ClassName")
        public String className;

        @NameInMap("RuleList")
        public java.util.List<GetBuildRiskDefineRuleConfigResponseBodyDataRuleTreeRuleList> ruleList;

        public static GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree build(java.util.Map<String, ?> map) throws Exception {
            GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree self = new GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree();
            return TeaModel.build(map, self);
        }

        public GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree setClassKey(String classKey) {
            this.classKey = classKey;
            return this;
        }
        public String getClassKey() {
            return this.classKey;
        }

        public GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree setClassName(String className) {
            this.className = className;
            return this;
        }
        public String getClassName() {
            return this.className;
        }

        public GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree setRuleList(java.util.List<GetBuildRiskDefineRuleConfigResponseBodyDataRuleTreeRuleList> ruleList) {
            this.ruleList = ruleList;
            return this;
        }
        public java.util.List<GetBuildRiskDefineRuleConfigResponseBodyDataRuleTreeRuleList> getRuleList() {
            return this.ruleList;
        }

    }

    public static class GetBuildRiskDefineRuleConfigResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>273698***</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        @NameInMap("RuleTree")
        public java.util.List<GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree> ruleTree;

        /**
         * <strong>example:</strong>
         * <p>99</p>
         */
        @NameInMap("SelectedCount")
        public Integer selectedCount;

        public static GetBuildRiskDefineRuleConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetBuildRiskDefineRuleConfigResponseBodyData self = new GetBuildRiskDefineRuleConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetBuildRiskDefineRuleConfigResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetBuildRiskDefineRuleConfigResponseBodyData setRuleCount(Integer ruleCount) {
            this.ruleCount = ruleCount;
            return this;
        }
        public Integer getRuleCount() {
            return this.ruleCount;
        }

        public GetBuildRiskDefineRuleConfigResponseBodyData setRuleTree(java.util.List<GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree> ruleTree) {
            this.ruleTree = ruleTree;
            return this;
        }
        public java.util.List<GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree> getRuleTree() {
            return this.ruleTree;
        }

        public GetBuildRiskDefineRuleConfigResponseBodyData setSelectedCount(Integer selectedCount) {
            this.selectedCount = selectedCount;
            return this;
        }
        public Integer getSelectedCount() {
            return this.selectedCount;
        }

    }

}
