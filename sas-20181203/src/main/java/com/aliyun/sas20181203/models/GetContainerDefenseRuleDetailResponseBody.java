// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetContainerDefenseRuleDetailResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetContainerDefenseRuleDetailResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetContainerDefenseRuleDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetContainerDefenseRuleDetailResponseBody self = new GetContainerDefenseRuleDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetContainerDefenseRuleDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetContainerDefenseRuleDetailResponseBody setData(GetContainerDefenseRuleDetailResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetContainerDefenseRuleDetailResponseBodyData getData() {
        return this.data;
    }

    public GetContainerDefenseRuleDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetContainerDefenseRuleDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetContainerDefenseRuleDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetContainerDefenseRuleDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetContainerDefenseRuleDetailResponseBodyDataScope extends TeaModel {
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Namespaces")
        public java.util.List<String> namespaces;

        public static GetContainerDefenseRuleDetailResponseBodyDataScope build(java.util.Map<String, ?> map) throws Exception {
            GetContainerDefenseRuleDetailResponseBodyDataScope self = new GetContainerDefenseRuleDetailResponseBodyDataScope();
            return TeaModel.build(map, self);
        }

        public GetContainerDefenseRuleDetailResponseBodyDataScope setAllNamespace(Integer allNamespace) {
            this.allNamespace = allNamespace;
            return this;
        }
        public Integer getAllNamespace() {
            return this.allNamespace;
        }

        public GetContainerDefenseRuleDetailResponseBodyDataScope setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public GetContainerDefenseRuleDetailResponseBodyDataScope setNamespaces(java.util.List<String> namespaces) {
            this.namespaces = namespaces;
            return this;
        }
        public java.util.List<String> getNamespaces() {
            return this.namespaces;
        }

    }

    public static class GetContainerDefenseRuleDetailResponseBodyDataWhitelist extends TeaModel {
        @NameInMap("Hash")
        public java.util.List<String> hash;

        @NameInMap("Image")
        public java.util.List<String> image;

        @NameInMap("Path")
        public java.util.List<String> path;

        public static GetContainerDefenseRuleDetailResponseBodyDataWhitelist build(java.util.Map<String, ?> map) throws Exception {
            GetContainerDefenseRuleDetailResponseBodyDataWhitelist self = new GetContainerDefenseRuleDetailResponseBodyDataWhitelist();
            return TeaModel.build(map, self);
        }

        public GetContainerDefenseRuleDetailResponseBodyDataWhitelist setHash(java.util.List<String> hash) {
            this.hash = hash;
            return this;
        }
        public java.util.List<String> getHash() {
            return this.hash;
        }

        public GetContainerDefenseRuleDetailResponseBodyDataWhitelist setImage(java.util.List<String> image) {
            this.image = image;
            return this;
        }
        public java.util.List<String> getImage() {
            return this.image;
        }

        public GetContainerDefenseRuleDetailResponseBodyDataWhitelist setPath(java.util.List<String> path) {
            this.path = path;
            return this;
        }
        public java.util.List<String> getPath() {
            return this.path;
        }

    }

    public static class GetContainerDefenseRuleDetailResponseBodyData extends TeaModel {
        @NameInMap("AliUid")
        public Long aliUid;

        @NameInMap("Description")
        public String description;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("EventType")
        public String eventType;

        @NameInMap("Id")
        public Long id;

        @NameInMap("RuleAction")
        public Integer ruleAction;

        @NameInMap("RuleName")
        public String ruleName;

        @NameInMap("RuleSwitch")
        public Integer ruleSwitch;

        @NameInMap("RuleType")
        public String ruleType;

        @NameInMap("Scope")
        public java.util.List<GetContainerDefenseRuleDetailResponseBodyDataScope> scope;

        @NameInMap("Whitelist")
        public GetContainerDefenseRuleDetailResponseBodyDataWhitelist whitelist;

        public static GetContainerDefenseRuleDetailResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetContainerDefenseRuleDetailResponseBodyData self = new GetContainerDefenseRuleDetailResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetContainerDefenseRuleDetailResponseBodyData setAliUid(Long aliUid) {
            this.aliUid = aliUid;
            return this;
        }
        public Long getAliUid() {
            return this.aliUid;
        }

        public GetContainerDefenseRuleDetailResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetContainerDefenseRuleDetailResponseBodyData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public GetContainerDefenseRuleDetailResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public GetContainerDefenseRuleDetailResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetContainerDefenseRuleDetailResponseBodyData setRuleAction(Integer ruleAction) {
            this.ruleAction = ruleAction;
            return this;
        }
        public Integer getRuleAction() {
            return this.ruleAction;
        }

        public GetContainerDefenseRuleDetailResponseBodyData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public GetContainerDefenseRuleDetailResponseBodyData setRuleSwitch(Integer ruleSwitch) {
            this.ruleSwitch = ruleSwitch;
            return this;
        }
        public Integer getRuleSwitch() {
            return this.ruleSwitch;
        }

        public GetContainerDefenseRuleDetailResponseBodyData setRuleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }
        public String getRuleType() {
            return this.ruleType;
        }

        public GetContainerDefenseRuleDetailResponseBodyData setScope(java.util.List<GetContainerDefenseRuleDetailResponseBodyDataScope> scope) {
            this.scope = scope;
            return this;
        }
        public java.util.List<GetContainerDefenseRuleDetailResponseBodyDataScope> getScope() {
            return this.scope;
        }

        public GetContainerDefenseRuleDetailResponseBodyData setWhitelist(GetContainerDefenseRuleDetailResponseBodyDataWhitelist whitelist) {
            this.whitelist = whitelist;
            return this;
        }
        public GetContainerDefenseRuleDetailResponseBodyDataWhitelist getWhitelist() {
            return this.whitelist;
        }

    }

}
