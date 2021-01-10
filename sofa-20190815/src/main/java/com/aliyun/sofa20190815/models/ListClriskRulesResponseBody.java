// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("RuleList")
    public java.util.List<ListClriskRulesResponseBodyRuleList> ruleList;

    public static ListClriskRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskRulesResponseBody self = new ListClriskRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskRulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskRulesResponseBody setRuleList(java.util.List<ListClriskRulesResponseBodyRuleList> ruleList) {
        this.ruleList = ruleList;
        return this;
    }
    public java.util.List<ListClriskRulesResponseBodyRuleList> getRuleList() {
        return this.ruleList;
    }

    public static class ListClriskRulesResponseBodyRuleList extends TeaModel {
        @NameInMap("Content")
        public String content;

        @NameInMap("DebugStatus")
        public String debugStatus;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("ModelCode")
        public String modelCode;

        @NameInMap("RuleCode")
        public String ruleCode;

        @NameInMap("RuleName")
        public String ruleName;

        public static ListClriskRulesResponseBodyRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskRulesResponseBodyRuleList self = new ListClriskRulesResponseBodyRuleList();
            return TeaModel.build(map, self);
        }

        public ListClriskRulesResponseBodyRuleList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListClriskRulesResponseBodyRuleList setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public ListClriskRulesResponseBodyRuleList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListClriskRulesResponseBodyRuleList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClriskRulesResponseBodyRuleList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListClriskRulesResponseBodyRuleList setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public ListClriskRulesResponseBodyRuleList setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public ListClriskRulesResponseBodyRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
