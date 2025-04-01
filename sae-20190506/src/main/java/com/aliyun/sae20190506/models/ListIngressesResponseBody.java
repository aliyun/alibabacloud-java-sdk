// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListIngressesResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: The request was successful.</li>
     * <li><strong>3xx</strong>: The request was redirected.</li>
     * <li><strong>4xx</strong>: The request failed.</li>
     * <li><strong>5xx</strong>: A server error occurred.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The result returned.</p>
     */
    @NameInMap("Data")
    public ListIngressesResponseBodyData data;

    /**
     * <p>The error code returned if the request failed. Valid values:</p>
     * <ul>
     * <li><strong>ErrorCode</strong> is not returned if a request is successful.</li>
     * <li><strong>ErrorCode</strong> is returned if a request failed. For more information, see <strong>Error codes</strong>.</li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The message returned. Valid values:</p>
     * <ul>
     * <li><strong>success</strong> is returned when a request is successful.</li>
     * <li>An error code is returned when a request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the list of Ingresses was obtained. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The list were obtained.</li>
     * <li><strong>false</strong>: The list failed to be queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The ID of a trace. The ID is used to query the details of a request.</p>
     * 
     * <strong>example:</strong>
     * <p>0a98a02315955564772843261e****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ListIngressesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListIngressesResponseBody self = new ListIngressesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListIngressesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListIngressesResponseBody setData(ListIngressesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListIngressesResponseBodyData getData() {
        return this.data;
    }

    public ListIngressesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListIngressesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListIngressesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListIngressesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListIngressesResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ListIngressesResponseBodyDataIngressListCorsConfig extends TeaModel {
        @NameInMap("AllowCredentials")
        public String allowCredentials;

        @NameInMap("AllowHeaders")
        public String allowHeaders;

        @NameInMap("AllowMethods")
        public String allowMethods;

        @NameInMap("AllowOrigin")
        public String allowOrigin;

        @NameInMap("Enable")
        public String enable;

        @NameInMap("ExposeHeaders")
        public String exposeHeaders;

        @NameInMap("MaxAge")
        public String maxAge;

        public static ListIngressesResponseBodyDataIngressListCorsConfig build(java.util.Map<String, ?> map) throws Exception {
            ListIngressesResponseBodyDataIngressListCorsConfig self = new ListIngressesResponseBodyDataIngressListCorsConfig();
            return TeaModel.build(map, self);
        }

        public ListIngressesResponseBodyDataIngressListCorsConfig setAllowCredentials(String allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        public ListIngressesResponseBodyDataIngressListCorsConfig setAllowHeaders(String allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public String getAllowHeaders() {
            return this.allowHeaders;
        }

        public ListIngressesResponseBodyDataIngressListCorsConfig setAllowMethods(String allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public String getAllowMethods() {
            return this.allowMethods;
        }

        public ListIngressesResponseBodyDataIngressListCorsConfig setAllowOrigin(String allowOrigin) {
            this.allowOrigin = allowOrigin;
            return this;
        }
        public String getAllowOrigin() {
            return this.allowOrigin;
        }

        public ListIngressesResponseBodyDataIngressListCorsConfig setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public ListIngressesResponseBodyDataIngressListCorsConfig setExposeHeaders(String exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public String getExposeHeaders() {
            return this.exposeHeaders;
        }

        public ListIngressesResponseBodyDataIngressListCorsConfig setMaxAge(String maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public String getMaxAge() {
            return this.maxAge;
        }

    }

    public static class ListIngressesResponseBodyDataIngressListDefaultRule extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("BackendProtocol")
        public String backendProtocol;

        @NameInMap("ContainerPort")
        public Integer containerPort;

        public static ListIngressesResponseBodyDataIngressListDefaultRule build(java.util.Map<String, ?> map) throws Exception {
            ListIngressesResponseBodyDataIngressListDefaultRule self = new ListIngressesResponseBodyDataIngressListDefaultRule();
            return TeaModel.build(map, self);
        }

        public ListIngressesResponseBodyDataIngressListDefaultRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListIngressesResponseBodyDataIngressListDefaultRule setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListIngressesResponseBodyDataIngressListDefaultRule setBackendProtocol(String backendProtocol) {
            this.backendProtocol = backendProtocol;
            return this;
        }
        public String getBackendProtocol() {
            return this.backendProtocol;
        }

        public ListIngressesResponseBodyDataIngressListDefaultRule setContainerPort(Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Integer getContainerPort() {
            return this.containerPort;
        }

    }

    public static class ListIngressesResponseBodyDataIngressListRulesRuleActions extends TeaModel {
        @NameInMap("ActionConfig")
        public String actionConfig;

        @NameInMap("ActionType")
        public String actionType;

        public static ListIngressesResponseBodyDataIngressListRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            ListIngressesResponseBodyDataIngressListRulesRuleActions self = new ListIngressesResponseBodyDataIngressListRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public ListIngressesResponseBodyDataIngressListRulesRuleActions setActionConfig(String actionConfig) {
            this.actionConfig = actionConfig;
            return this;
        }
        public String getActionConfig() {
            return this.actionConfig;
        }

        public ListIngressesResponseBodyDataIngressListRulesRuleActions setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

    }

    public static class ListIngressesResponseBodyDataIngressListRules extends TeaModel {
        @NameInMap("AppId")
        public String appId;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("BackendProtocol")
        public String backendProtocol;

        @NameInMap("ContainerPort")
        public Integer containerPort;

        @NameInMap("Domain")
        public String domain;

        @NameInMap("Path")
        public String path;

        @NameInMap("RewritePath")
        public String rewritePath;

        @NameInMap("RuleActions")
        public java.util.List<ListIngressesResponseBodyDataIngressListRulesRuleActions> ruleActions;

        public static ListIngressesResponseBodyDataIngressListRules build(java.util.Map<String, ?> map) throws Exception {
            ListIngressesResponseBodyDataIngressListRules self = new ListIngressesResponseBodyDataIngressListRules();
            return TeaModel.build(map, self);
        }

        public ListIngressesResponseBodyDataIngressListRules setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public ListIngressesResponseBodyDataIngressListRules setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public ListIngressesResponseBodyDataIngressListRules setBackendProtocol(String backendProtocol) {
            this.backendProtocol = backendProtocol;
            return this;
        }
        public String getBackendProtocol() {
            return this.backendProtocol;
        }

        public ListIngressesResponseBodyDataIngressListRules setContainerPort(Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Integer getContainerPort() {
            return this.containerPort;
        }

        public ListIngressesResponseBodyDataIngressListRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListIngressesResponseBodyDataIngressListRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public ListIngressesResponseBodyDataIngressListRules setRewritePath(String rewritePath) {
            this.rewritePath = rewritePath;
            return this;
        }
        public String getRewritePath() {
            return this.rewritePath;
        }

        public ListIngressesResponseBodyDataIngressListRules setRuleActions(java.util.List<ListIngressesResponseBodyDataIngressListRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<ListIngressesResponseBodyDataIngressListRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

    }

    public static class ListIngressesResponseBodyDataIngressList extends TeaModel {
        /**
         * <p>The ID of the certificate that is associated with a Classic Load Balancer (<strong>CLB</strong>) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>13624*<strong><strong>73809_16f8e549a20_1175189789_12</strong></strong>3210</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The ID of the certificate that is associated with an Application Load Balancer <strong>ALB</strong> instance.</p>
         * 
         * <strong>example:</strong>
         * <p>87<em><strong>35-cn-hangzhou,812</strong></em>3-cn-hangzhou</p>
         */
        @NameInMap("CertIds")
        public String certIds;

        @NameInMap("CorsConfig")
        public ListIngressesResponseBodyDataIngressListCorsConfig corsConfig;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("DefaultRule")
        public ListIngressesResponseBodyDataIngressListDefaultRule defaultRule;

        /**
         * <p>The name of a routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The ID of a routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("Id")
        public Long id;

        @NameInMap("IdleTimeout")
        public Long idleTimeout;

        /**
         * <p>The listener ports for an SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ListenerPort")
        public String listenerPort;

        /**
         * <p>The protocol that is supported by SLB to forward requests. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong>: HTTP is suitable for applications that need to identify the transmitted data.</li>
         * <li><strong>HTTPS</strong>: HTTPS is suitable for applications that require encrypted data transmission.</li>
         * </ul>
         * <p>This parameter is optional in the <strong>CreateIngress</strong> and <strong>UpadateIngress</strong> operations. If you do not configure this parameter when you call the CreateIngress or UpdateIngress operation to create or update a gateway routing rule, this parameter is not returned for the corresponding response.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The type of SLB instances. Valid values:</p>
         * <ul>
         * <li><strong>clb</strong>: Classic Load Balancer (formerly known as SLB).</li>
         * <li><strong>alb</strong>: Application Load Balancer.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clb</p>
         */
        @NameInMap("LoadBalanceType")
        public String loadBalanceType;

        /**
         * <p>The ID of an MSE cloud-native gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d5df01a1bae748f1a7c4e325d2fd****</p>
         */
        @NameInMap("MseGatewayId")
        public String mseGatewayId;

        /**
         * <p>The port of a service.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("MseGatewayPort")
        public String mseGatewayPort;

        /**
         * <p>The protocol that is supported by an MSE cloud-native gateway to forward requests. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong>: HTTP is suitable for applications that need to identify transmitted data.</li>
         * <li><strong>HTTPS</strong>: HTTPS is suitable for applications that require encrypted data transmission.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("MseGatewayProtocol")
        public String mseGatewayProtocol;

        /**
         * <p>The name of a routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf6jt0nu4z6ior943****-80-f5****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of a namespace.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        @NameInMap("RequestTimeout")
        public Long requestTimeout;

        @NameInMap("Rules")
        public java.util.List<ListIngressesResponseBodyDataIngressListRules> rules;

        /**
         * <p>The ID of a Server Load Balancer (SLB) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf62****6d13tq2u5</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The type of SLB instances. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: an Internet-facing SLB instance</li>
         * <li><strong>intranet</strong>: an Intranet-facing SLB instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        @NameInMap("SlbType")
        public String slbType;

        public static ListIngressesResponseBodyDataIngressList build(java.util.Map<String, ?> map) throws Exception {
            ListIngressesResponseBodyDataIngressList self = new ListIngressesResponseBodyDataIngressList();
            return TeaModel.build(map, self);
        }

        public ListIngressesResponseBodyDataIngressList setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public ListIngressesResponseBodyDataIngressList setCertIds(String certIds) {
            this.certIds = certIds;
            return this;
        }
        public String getCertIds() {
            return this.certIds;
        }

        public ListIngressesResponseBodyDataIngressList setCorsConfig(ListIngressesResponseBodyDataIngressListCorsConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }
        public ListIngressesResponseBodyDataIngressListCorsConfig getCorsConfig() {
            return this.corsConfig;
        }

        public ListIngressesResponseBodyDataIngressList setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListIngressesResponseBodyDataIngressList setDefaultRule(ListIngressesResponseBodyDataIngressListDefaultRule defaultRule) {
            this.defaultRule = defaultRule;
            return this;
        }
        public ListIngressesResponseBodyDataIngressListDefaultRule getDefaultRule() {
            return this.defaultRule;
        }

        public ListIngressesResponseBodyDataIngressList setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListIngressesResponseBodyDataIngressList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListIngressesResponseBodyDataIngressList setIdleTimeout(Long idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Long getIdleTimeout() {
            return this.idleTimeout;
        }

        public ListIngressesResponseBodyDataIngressList setListenerPort(String listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public String getListenerPort() {
            return this.listenerPort;
        }

        public ListIngressesResponseBodyDataIngressList setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public ListIngressesResponseBodyDataIngressList setLoadBalanceType(String loadBalanceType) {
            this.loadBalanceType = loadBalanceType;
            return this;
        }
        public String getLoadBalanceType() {
            return this.loadBalanceType;
        }

        public ListIngressesResponseBodyDataIngressList setMseGatewayId(String mseGatewayId) {
            this.mseGatewayId = mseGatewayId;
            return this;
        }
        public String getMseGatewayId() {
            return this.mseGatewayId;
        }

        public ListIngressesResponseBodyDataIngressList setMseGatewayPort(String mseGatewayPort) {
            this.mseGatewayPort = mseGatewayPort;
            return this;
        }
        public String getMseGatewayPort() {
            return this.mseGatewayPort;
        }

        public ListIngressesResponseBodyDataIngressList setMseGatewayProtocol(String mseGatewayProtocol) {
            this.mseGatewayProtocol = mseGatewayProtocol;
            return this;
        }
        public String getMseGatewayProtocol() {
            return this.mseGatewayProtocol;
        }

        public ListIngressesResponseBodyDataIngressList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListIngressesResponseBodyDataIngressList setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public ListIngressesResponseBodyDataIngressList setRequestTimeout(Long requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Long getRequestTimeout() {
            return this.requestTimeout;
        }

        public ListIngressesResponseBodyDataIngressList setRules(java.util.List<ListIngressesResponseBodyDataIngressListRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<ListIngressesResponseBodyDataIngressListRules> getRules() {
            return this.rules;
        }

        public ListIngressesResponseBodyDataIngressList setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public ListIngressesResponseBodyDataIngressList setSlbType(String slbType) {
            this.slbType = slbType;
            return this;
        }
        public String getSlbType() {
            return this.slbType;
        }

    }

    public static class ListIngressesResponseBodyData extends TeaModel {
        /**
         * <p>The list of routing rules.</p>
         */
        @NameInMap("IngressList")
        public java.util.List<ListIngressesResponseBodyDataIngressList> ingressList;

        public static ListIngressesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIngressesResponseBodyData self = new ListIngressesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIngressesResponseBodyData setIngressList(java.util.List<ListIngressesResponseBodyDataIngressList> ingressList) {
            this.ingressList = ingressList;
            return this;
        }
        public java.util.List<ListIngressesResponseBodyDataIngressList> getIngressList() {
            return this.ingressList;
        }

    }

}
