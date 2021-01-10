// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("RuleInfo")
    public GetClriskRuleResponseBodyRuleInfo ruleInfo;

    public static GetClriskRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskRuleResponseBody self = new GetClriskRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskRuleResponseBody setRuleInfo(GetClriskRuleResponseBodyRuleInfo ruleInfo) {
        this.ruleInfo = ruleInfo;
        return this;
    }
    public GetClriskRuleResponseBodyRuleInfo getRuleInfo() {
        return this.ruleInfo;
    }

    public static class GetClriskRuleResponseBodyRuleInfo extends TeaModel {
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

        public static GetClriskRuleResponseBodyRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetClriskRuleResponseBodyRuleInfo self = new GetClriskRuleResponseBodyRuleInfo();
            return TeaModel.build(map, self);
        }

        public GetClriskRuleResponseBodyRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetClriskRuleResponseBodyRuleInfo setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public GetClriskRuleResponseBodyRuleInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetClriskRuleResponseBodyRuleInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetClriskRuleResponseBodyRuleInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetClriskRuleResponseBodyRuleInfo setModelCode(String modelCode) {
            this.modelCode = modelCode;
            return this;
        }
        public String getModelCode() {
            return this.modelCode;
        }

        public GetClriskRuleResponseBodyRuleInfo setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public GetClriskRuleResponseBodyRuleInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

    }

}
