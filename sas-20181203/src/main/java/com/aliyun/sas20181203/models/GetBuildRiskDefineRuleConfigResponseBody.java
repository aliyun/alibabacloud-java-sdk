// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetBuildRiskDefineRuleConfigResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code <strong>200</strong> indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The data returned.</p>
     */
    @NameInMap("Data")
    public GetBuildRiskDefineRuleConfigResponseBodyData data;

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
     * <p>69BFFCDE-37D6-5A49-A8BC-BB03AC83****</p>
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
         * <p>The check item.</p>
         * 
         * <strong>example:</strong>
         * <p>add</p>
         */
        @NameInMap("RuleKey")
        public String ruleKey;

        /**
         * <p>The name of the check item.</p>
         * 
         * <strong>example:</strong>
         * <p>used ADD</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>Indicates whether the check item is selected. Valid values:</p>
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
         * <p>The check item type.</p>
         * 
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("ClassKey")
        public String classKey;

        /**
         * <p>The name of the check item type.</p>
         * 
         * <strong>example:</strong>
         * <p>other</p>
         */
        @NameInMap("ClassName")
        public String className;

        /**
         * <p>The check items of the type.</p>
         */
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
         * <p>The configuration ID for scanning image build command risks.</p>
         * 
         * <strong>example:</strong>
         * <p>273698***</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The total number of check items.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("RuleCount")
        public Integer ruleCount;

        /**
         * <p>The details of all check items.</p>
         */
        @NameInMap("RuleTree")
        public java.util.List<GetBuildRiskDefineRuleConfigResponseBodyDataRuleTree> ruleTree;

        /**
         * <p>The number of selected check items.</p>
         * 
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
