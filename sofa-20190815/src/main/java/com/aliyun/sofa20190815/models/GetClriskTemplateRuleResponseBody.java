// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskTemplateRuleResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("TemplateRuleInfo")
    public GetClriskTemplateRuleResponseBodyTemplateRuleInfo templateRuleInfo;

    public static GetClriskTemplateRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClriskTemplateRuleResponseBody self = new GetClriskTemplateRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClriskTemplateRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClriskTemplateRuleResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetClriskTemplateRuleResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetClriskTemplateRuleResponseBody setTemplateRuleInfo(GetClriskTemplateRuleResponseBodyTemplateRuleInfo templateRuleInfo) {
        this.templateRuleInfo = templateRuleInfo;
        return this;
    }
    public GetClriskTemplateRuleResponseBodyTemplateRuleInfo getTemplateRuleInfo() {
        return this.templateRuleInfo;
    }

    public static class GetClriskTemplateRuleResponseBodyTemplateRuleInfo extends TeaModel {
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

        public static GetClriskTemplateRuleResponseBodyTemplateRuleInfo build(java.util.Map<String, ?> map) throws Exception {
            GetClriskTemplateRuleResponseBodyTemplateRuleInfo self = new GetClriskTemplateRuleResponseBodyTemplateRuleInfo();
            return TeaModel.build(map, self);
        }

        public GetClriskTemplateRuleResponseBodyTemplateRuleInfo setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetClriskTemplateRuleResponseBodyTemplateRuleInfo setDebugStatus(String debugStatus) {
            this.debugStatus = debugStatus;
            return this;
        }
        public String getDebugStatus() {
            return this.debugStatus;
        }

        public GetClriskTemplateRuleResponseBodyTemplateRuleInfo setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public GetClriskTemplateRuleResponseBodyTemplateRuleInfo setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetClriskTemplateRuleResponseBodyTemplateRuleInfo setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetClriskTemplateRuleResponseBodyTemplateRuleInfo setRuleCode(String ruleCode) {
            this.ruleCode = ruleCode;
            return this;
        }
        public String getRuleCode() {
            return this.ruleCode;
        }

        public GetClriskTemplateRuleResponseBodyTemplateRuleInfo setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetClriskTemplateRuleResponseBodyTemplateRuleInfo setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public GetClriskTemplateRuleResponseBodyTemplateRuleInfo setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
