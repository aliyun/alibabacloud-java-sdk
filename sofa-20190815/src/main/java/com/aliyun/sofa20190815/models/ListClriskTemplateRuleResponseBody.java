// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskTemplateRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TemplateRuleList")
    public java.util.List<ListClriskTemplateRuleResponseBodyTemplateRuleList> templateRuleList;

    public static ListClriskTemplateRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListClriskTemplateRuleResponseBody self = new ListClriskTemplateRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public ListClriskTemplateRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListClriskTemplateRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListClriskTemplateRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListClriskTemplateRuleResponseBody setTemplateRuleList(java.util.List<ListClriskTemplateRuleResponseBodyTemplateRuleList> templateRuleList) {
        this.templateRuleList = templateRuleList;
        return this;
    }
    public java.util.List<ListClriskTemplateRuleResponseBodyTemplateRuleList> getTemplateRuleList() {
        return this.templateRuleList;
    }

    public static class ListClriskTemplateRuleResponseBodyTemplateRuleList extends TeaModel {
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

        @NameInMap("RuleCode")
        public String ruleCode;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("TemplateCode")
        public String templateCode;

        @NameInMap("Type")
        public String type;

        public static ListClriskTemplateRuleResponseBodyTemplateRuleList build(java.util.Map<String, ?> map) throws Exception {
            ListClriskTemplateRuleResponseBodyTemplateRuleList self = new ListClriskTemplateRuleResponseBodyTemplateRuleList();
            return TeaModel.build(map, self);
        }

        public ListClriskTemplateRuleResponseBodyTemplateRuleList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListClriskTemplateRuleResponseBodyTemplateRuleList setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public ListClriskTemplateRuleResponseBodyTemplateRuleList setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public ListClriskTemplateRuleResponseBodyTemplateRuleList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ListClriskTemplateRuleResponseBodyTemplateRuleList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ListClriskTemplateRuleResponseBodyTemplateRuleList setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public ListClriskTemplateRuleResponseBodyTemplateRuleList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public ListClriskTemplateRuleResponseBodyTemplateRuleList setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListClriskTemplateRuleResponseBodyTemplateRuleList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
