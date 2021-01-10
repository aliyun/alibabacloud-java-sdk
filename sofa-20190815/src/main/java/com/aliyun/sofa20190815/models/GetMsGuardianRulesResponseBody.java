// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMsGuardianRulesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("GuardianRule")
    public GetMsGuardianRulesResponseBodyGuardianRule guardianRule;

    public static GetMsGuardianRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMsGuardianRulesResponseBody self = new GetMsGuardianRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMsGuardianRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMsGuardianRulesResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMsGuardianRulesResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetMsGuardianRulesResponseBody setGuardianRule(GetMsGuardianRulesResponseBodyGuardianRule guardianRule) {
        this.guardianRule = guardianRule;
        return this;
    }
    public GetMsGuardianRulesResponseBodyGuardianRule getGuardianRule() {
        return this.guardianRule;
    }

    public static class GetMsGuardianRulesResponseBodyGuardianRule extends TeaModel {
        @NameInMap("AppName")
        public String appName;

        @NameInMap("Enable")
        public Boolean enable;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Name")
        public String name;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("ResourceType")
        public String resourceType;

        @NameInMap("RuleConfig")
        public String ruleConfig;

        @NameInMap("RunMode")
        public String runMode;

        public static GetMsGuardianRulesResponseBodyGuardianRule build(java.util.Map<String, ?> map) throws Exception {
            GetMsGuardianRulesResponseBodyGuardianRule self = new GetMsGuardianRulesResponseBodyGuardianRule();
            return TeaModel.build(map, self);
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setResourceType(String resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public String getResourceType() {
            return this.resourceType;
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setRuleConfig(String ruleConfig) {
            this.ruleConfig = ruleConfig;
            return this;
        }
        public String getRuleConfig() {
            return this.ruleConfig;
        }

        public GetMsGuardianRulesResponseBodyGuardianRule setRunMode(String runMode) {
            this.runMode = runMode;
            return this;
        }
        public String getRunMode() {
            return this.runMode;
        }

    }

}
