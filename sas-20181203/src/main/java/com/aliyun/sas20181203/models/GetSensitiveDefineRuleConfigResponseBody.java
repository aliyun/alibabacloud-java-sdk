// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSensitiveDefineRuleConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetSensitiveDefineRuleConfigResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("RuleKey")
        public String ruleKey;

        @NameInMap("RuleName")
        public String ruleName;

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
        @NameInMap("ClassKey")
        public String classKey;

        @NameInMap("ClassName")
        public String className;

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
        @NameInMap("Id")
        public Long id;

        @NameInMap("RuleCount")
        public Integer ruleCount;

        @NameInMap("RuleTree")
        public java.util.List<GetSensitiveDefineRuleConfigResponseBodyDataRuleTree> ruleTree;

        @NameInMap("SelectedCount")
        public Integer selectedCount;

        public static GetSensitiveDefineRuleConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetSensitiveDefineRuleConfigResponseBodyData self = new GetSensitiveDefineRuleConfigResponseBodyData();
            return TeaModel.build(map, self);
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
