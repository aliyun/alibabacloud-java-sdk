// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveClriskRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("RuleInfo")
    public SaveClriskRuleResponseBodyRuleInfo ruleInfo;

    public static SaveClriskRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveClriskRuleResponseBody self = new SaveClriskRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveClriskRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveClriskRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveClriskRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SaveClriskRuleResponseBody setRuleInfo(SaveClriskRuleResponseBodyRuleInfo ruleInfo) {
        this.ruleInfo = ruleInfo;
        return this;
    }
    public SaveClriskRuleResponseBodyRuleInfo getRuleInfo() {
        return this.ruleInfo;
    }

    public static class SaveClriskRuleResponseBodyRuleInfo extends TeaModel {
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

        public static SaveClriskRuleResponseBodyRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            SaveClriskRuleResponseBodyRuleInfo self = new SaveClriskRuleResponseBodyRuleInfo();
            return TeaModel.build(map, self);
        }

        public SaveClriskRuleResponseBodyRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public SaveClriskRuleResponseBodyRuleInfo setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public SaveClriskRuleResponseBodyRuleInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public SaveClriskRuleResponseBodyRuleInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public SaveClriskRuleResponseBodyRuleInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public SaveClriskRuleResponseBodyRuleInfo setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public SaveClriskRuleResponseBodyRuleInfo setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public SaveClriskRuleResponseBodyRuleInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
