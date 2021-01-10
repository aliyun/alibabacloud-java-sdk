// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskTemplateRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("RuleInfo")
    public SaveClriskTemplateRuleResponseBodyRuleInfo ruleInfo;

    public static SaveClriskTemplateRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskTemplateRuleResponseBody self = new SaveClriskTemplateRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveClriskTemplateRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveClriskTemplateRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveClriskTemplateRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SaveClriskTemplateRuleResponseBody setRuleInfo(SaveClriskTemplateRuleResponseBodyRuleInfo ruleInfo) {
        this.ruleInfo = ruleInfo;
        return this;
    }
    public SaveClriskTemplateRuleResponseBodyRuleInfo getRuleInfo() {
        return this.ruleInfo;
    }

    public static class SaveClriskTemplateRuleResponseBodyRuleInfo extends TeaModel {
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

        public static SaveClriskTemplateRuleResponseBodyRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            SaveClriskTemplateRuleResponseBodyRuleInfo self = new SaveClriskTemplateRuleResponseBodyRuleInfo();
            return TeaModel.build(map, self);
        }

        public SaveClriskTemplateRuleResponseBodyRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SaveClriskTemplateRuleResponseBodyRuleInfo setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public SaveClriskTemplateRuleResponseBodyRuleInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public SaveClriskTemplateRuleResponseBodyRuleInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public SaveClriskTemplateRuleResponseBodyRuleInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public SaveClriskTemplateRuleResponseBodyRuleInfo setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public SaveClriskTemplateRuleResponseBodyRuleInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public SaveClriskTemplateRuleResponseBodyRuleInfo setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public SaveClriskTemplateRuleResponseBodyRuleInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
