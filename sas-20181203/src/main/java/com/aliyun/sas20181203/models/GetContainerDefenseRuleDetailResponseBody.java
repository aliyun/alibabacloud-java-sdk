// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetContainerDefenseRuleDetailResponseBody extends TeaModel {
    /**
     * <p>The response code. The status code **200** indicates that the request was successful. Other status codes indicate that the request failed. You can identify the cause of the failure based on the status code.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The details of the rule.</p>
     */
    @NameInMap("Data")
    public GetContainerDefenseRuleDetailResponseBodyData data;

    /**
     * <p>The HTTP status code. The status code 200 indicates that the request was successful.</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The returned message.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
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
        /**
         * <p>Indicates whether all namespaces are included. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("AllNamespace")
        public Integer allNamespace;

        /**
         * <p>The ID of the container cluster.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The namespaces.</p>
         */
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
        /**
         * <p>The hash values of the files that are added to the whitelist.</p>
         * <br>
         * <p>>  This parameter is not supported.</p>
         */
        @NameInMap("Hash")
        public java.util.List<String> hash;

        @NameInMap("Image")
        public java.util.List<String> image;

        /**
         * <p>The paths to the files that are added to the whitelist.</p>
         */
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
        /**
         * <p>The user ID.</p>
         */
        @NameInMap("AliUid")
        public Long aliUid;

        /**
         * <p>The description of the rule.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The alert name. Valid values:</p>
         * <br>
         * <p>*   **Non-image Program Startup**</p>
         */
        @NameInMap("EventName")
        public String eventName;

        /**
         * <p>The alert type. Valid values:</p>
         * <br>
         * <p>*   **Proactive Defense for Containers**</p>
         */
        @NameInMap("EventType")
        public String eventType;

        /**
         * <p>The ID of the rule.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The action specified in the rule. Valid values:</p>
         * <br>
         * <p>*   **1**: alert</p>
         * <p>*   **2**: block</p>
         */
        @NameInMap("RuleAction")
        public Integer ruleAction;

        /**
         * <p>The name of the rule.</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The status of the rule. Valid values:</p>
         * <br>
         * <p>*   **1**: enabled</p>
         * <p>*   **0**: disabled</p>
         */
        @NameInMap("RuleSwitch")
        public Integer ruleSwitch;

        /**
         * <p>The type of the rule. Valid values:</p>
         * <br>
         * <p>*   **1**: system rule</p>
         * <p>*   **2**: custom rule</p>
         */
        @NameInMap("RuleType")
        public String ruleType;

        /**
         * <p>The effective scope of the rule.</p>
         */
        @NameInMap("Scope")
        public java.util.List<GetContainerDefenseRuleDetailResponseBodyDataScope> scope;

        /**
         * <p>The whitelist.</p>
         */
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
