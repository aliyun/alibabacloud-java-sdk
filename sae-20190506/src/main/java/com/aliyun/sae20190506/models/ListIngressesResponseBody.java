// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class ListIngressesResponseBody extends TeaModel {
    /**
     * <p>The API status code or POP error code. Valid values:</p>
     * <ul>
     * <li><strong>2xx</strong>: Success.</li>
     * <li><strong>3xx</strong>: Redirect.</li>
     * <li><strong>4xx</strong>: Request error.</li>
     * <li><strong>5xx</strong>: Server error.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned results.</p>
     */
    @NameInMap("Data")
    public ListIngressesResponseBodyData data;

    /**
     * <p>The error code. Valid values:</p>
     * <ul>
     * <li>If the request is successful, the <strong>ErrorCode</strong> parameter is not returned.</li>
     * <li>If the request fails, the <strong>ErrorCode</strong> parameter is returned. For more information, see the <strong>Error codes</strong> section in this topic.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InvalidParameter.NotEmpty</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The additional information. The value is described as follows:</p>
     * <ul>
     * <li>If the request is successful, <strong>success</strong> is returned.</li>
     * <li>If the request fails, the specific error code is returned.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Specifies whether the ingress list was successfully retrieved. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The ingress list was successfully retrieved.</li>
     * <li><strong>false</strong>: The ingress list failed to be retrieved.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query call information.</p>
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
        /**
         * <p>Specifies whether credentials are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AllowCredentials")
        public String allowCredentials;

        /**
         * <p>The allowed headers.</p>
         * 
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        @NameInMap("AllowHeaders")
        public String allowHeaders;

        /**
         * <p>The allowed methods.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("AllowMethods")
        public String allowMethods;

        /**
         * <p>The allowed origins.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AllowOrigin")
        public String allowOrigin;

        /**
         * <p>Specifies whether the feature is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The allowed exposed headers.</p>
         * 
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        @NameInMap("ExposeHeaders")
        public String exposeHeaders;

        /**
         * <p>The max age.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
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
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The backend protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("BackendProtocol")
        public String backendProtocol;

        /**
         * <p>The container port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
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
        /**
         * <p>The action configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;host\&quot;:\&quot;<a href="http://www.example.com%5C%5C%22,%5C%5C%22path%5C%5C%22:%5C%5C%22/example/text%5C%5C%22,%5C%5C%22query%5C%5C%22:%5C%5C%22x=1%5C%5C%22%7D">www.example.com\\&quot;,\\&quot;path\\&quot;:\\&quot;/example/text\\&quot;,\\&quot;query\\&quot;:\\&quot;x=1\\&quot;}</a></p>
         */
        @NameInMap("ActionConfig")
        public String actionConfig;

        /**
         * <p>The action type.</p>
         * 
         * <strong>example:</strong>
         * <p>rewrite</p>
         */
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
        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7171a6ca-d1cd-4928-8642-7d5cfe69****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo-app</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The backend protocol.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("BackendProtocol")
        public String backendProtocol;

        /**
         * <p>The container port.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("ContainerPort")
        public Integer containerPort;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>edas.site</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The path.</p>
         * 
         * <strong>example:</strong>
         * <p>/Path</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The rewrite path.</p>
         * 
         * <strong>example:</strong>
         * <p>/${1}</p>
         */
        @NameInMap("RewritePath")
        public String rewritePath;

        /**
         * <p>The list of rule actions.</p>
         */
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
         * <p>The <strong>CLB</strong> certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>13624*<strong><strong>73809_16f8e549a20_1175189789_12</strong></strong>3210</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The <strong>ALB</strong> certificate IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>87<em><strong>35-cn-hangzhou,812</strong></em>3-cn-hangzhou</p>
         */
        @NameInMap("CertIds")
        public String certIds;

        /**
         * <p>The CORS configuration.</p>
         */
        @NameInMap("CorsConfig")
        public ListIngressesResponseBodyDataIngressListCorsConfig corsConfig;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1593746835111</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The default rule.</p>
         */
        @NameInMap("DefaultRule")
        public ListIngressesResponseBodyDataIngressListDefaultRule defaultRule;

        /**
         * <p>The name of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The routing rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The idle connection timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("IdleTimeout")
        public Long idleTimeout;

        /**
         * <p>The SLB listener port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("ListenerPort")
        public String listenerPort;

        /**
         * <p>The request forwarding protocol supported by the load balancing SLB. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong>: Applicable to applications that need to identify data content.</li>
         * <li><strong>HTTPS</strong>: Applicable to applications that require encrypted transmission.</li>
         * </ul>
         * <p>This parameter is optional in <strong>CreateIngress</strong> and <strong>UpdateIngress</strong>. If you do not specify this parameter when you create or update a gateway routing rule, this parameter is not returned when you invoke this API.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The type of the load balancing SLB. Valid values:</p>
         * <ul>
         * <li><strong>clb</strong>: Classic Load Balancer (CLB), formerly known as SLB.</li>
         * <li><strong>alb</strong>: Application Load Balancer (ALB).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clb</p>
         */
        @NameInMap("LoadBalanceType")
        public String loadBalanceType;

        /**
         * <p>The MSE cloud-native gateway instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-d5df01a1bae748f1a7c4e325d2fd****</p>
         */
        @NameInMap("MseGatewayId")
        public String mseGatewayId;

        /**
         * <p>The port corresponding to the service.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("MseGatewayPort")
        public String mseGatewayPort;

        /**
         * <p>The request forwarding protocol supported by the MSE cloud-native gateway. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong>: Applicable to applications that need to identify data content.</li>
         * <li><strong>HTTPS</strong>: Applicable to applications that require encrypted transmission.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("MseGatewayProtocol")
        public String mseGatewayProtocol;

        /**
         * <p>The name of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf6jt0nu4z6ior943****-80-f5****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The namespace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The request timeout period.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RequestTimeout")
        public Long requestTimeout;

        /**
         * <p>The rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<ListIngressesResponseBodyDataIngressListRules> rules;

        /**
         * <p>The SLB ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf62****6d13tq2u5</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The SLB type. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: Internet.</li>
         * <li><strong>intranet</strong>: Internal network.</li>
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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The list of routing rules.</p>
         */
        @NameInMap("IngressList")
        public java.util.List<ListIngressesResponseBodyDataIngressList> ingressList;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of queried entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalSize")
        public Integer totalSize;

        public static ListIngressesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListIngressesResponseBodyData self = new ListIngressesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListIngressesResponseBodyData setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListIngressesResponseBodyData setIngressList(java.util.List<ListIngressesResponseBodyDataIngressList> ingressList) {
            this.ingressList = ingressList;
            return this;
        }
        public java.util.List<ListIngressesResponseBodyDataIngressList> getIngressList() {
            return this.ingressList;
        }

        public ListIngressesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListIngressesResponseBodyData setTotalSize(Integer totalSize) {
            this.totalSize = totalSize;
            return this;
        }
        public Integer getTotalSize() {
            return this.totalSize;
        }

    }

}
