// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeIngressResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The port specified for the SLB listener.</p>
     */
    @NameInMap("Data")
    public DescribeIngressResponseBodyData data;

    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The ID of the namespace.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The ID of the SLB instance.</p>
     * 
     * <strong>example:</strong>
     * <p>91F93257-7A4A-4BD3-9A7E-2F6EAE6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The name of the routing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>0a981dd515966966104121683d****</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static DescribeIngressResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeIngressResponseBody self = new DescribeIngressResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeIngressResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeIngressResponseBody setData(DescribeIngressResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeIngressResponseBodyData getData() {
        return this.data;
    }

    public DescribeIngressResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public DescribeIngressResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeIngressResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeIngressResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeIngressResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class DescribeIngressResponseBodyDataDefaultRule extends TeaModel {
        /**
         * <p>The domain name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>395b60e4-0550-458d-9c54-a265d036****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The container port of the application specified in the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>app1</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("BackendProtocol")
        public String backendProtocol;

        /**
         * <p>The name of the application specified in the forwarding rule.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("ContainerPort")
        public Integer containerPort;

        public static DescribeIngressResponseBodyDataDefaultRule build(java.util.Map<String, ?> map) throws Exception {
            DescribeIngressResponseBodyDataDefaultRule self = new DescribeIngressResponseBodyDataDefaultRule();
            return TeaModel.build(map, self);
        }

        public DescribeIngressResponseBodyDataDefaultRule setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeIngressResponseBodyDataDefaultRule setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeIngressResponseBodyDataDefaultRule setBackendProtocol(String backendProtocol) {
            this.backendProtocol = backendProtocol;
            return this;
        }
        public String getBackendProtocol() {
            return this.backendProtocol;
        }

        public DescribeIngressResponseBodyDataDefaultRule setContainerPort(Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Integer getContainerPort() {
            return this.containerPort;
        }

    }

    public static class DescribeIngressResponseBodyDataRulesRuleActions extends TeaModel {
        @NameInMap("ActionConfig")
        public String actionConfig;

        @NameInMap("ActionType")
        public String actionType;

        public static DescribeIngressResponseBodyDataRulesRuleActions build(java.util.Map<String, ?> map) throws Exception {
            DescribeIngressResponseBodyDataRulesRuleActions self = new DescribeIngressResponseBodyDataRulesRuleActions();
            return TeaModel.build(map, self);
        }

        public DescribeIngressResponseBodyDataRulesRuleActions setActionConfig(String actionConfig) {
            this.actionConfig = actionConfig;
            return this;
        }
        public String getActionConfig() {
            return this.actionConfig;
        }

        public DescribeIngressResponseBodyDataRulesRuleActions setActionType(String actionType) {
            this.actionType = actionType;
            return this;
        }
        public String getActionType() {
            return this.actionType;
        }

    }

    public static class DescribeIngressResponseBodyDataRules extends TeaModel {
        /**
         * <p>The protocol used to forward requests. Valid values:</p>
         * <ul>
         * <li><strong>HTTP</strong>: used when the application needs to identify the transmitted data.</li>
         * <li><strong>HTTPS</strong>: used when the application requires encrypted data transmission.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>395b60e4-0550-458d-9c54-a265d036****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The path of the URL.</p>
         * 
         * <strong>example:</strong>
         * <p>app1</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("BackendProtocol")
        public String backendProtocol;

        /**
         * <p>The ID of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("ContainerPort")
        public Integer containerPort;

        /**
         * <p>The type of the SLB instance based on the processing capabilities. Valid values:</p>
         * <ul>
         * <li><strong>clb</strong>: the Classic Load Balancer (CLB) instance.</li>
         * <li><strong>alb</strong>: the Application Load Balancer (ALB) instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>edas.site</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The error code.</p>
         * <ul>
         * <li>The <strong>ErrorCode</strong> parameter is not returned when the request succeeds.</li>
         * <li>The <strong>ErrorCode</strong> parameter is returned when the request fails. For more information, see <strong>Error codes</strong> in this topic.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>/path1</p>
         */
        @NameInMap("Path")
        public String path;

        @NameInMap("RewritePath")
        public String rewritePath;

        @NameInMap("RuleActions")
        public java.util.List<DescribeIngressResponseBodyDataRulesRuleActions> ruleActions;

        public static DescribeIngressResponseBodyDataRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeIngressResponseBodyDataRules self = new DescribeIngressResponseBodyDataRules();
            return TeaModel.build(map, self);
        }

        public DescribeIngressResponseBodyDataRules setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeIngressResponseBodyDataRules setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeIngressResponseBodyDataRules setBackendProtocol(String backendProtocol) {
            this.backendProtocol = backendProtocol;
            return this;
        }
        public String getBackendProtocol() {
            return this.backendProtocol;
        }

        public DescribeIngressResponseBodyDataRules setContainerPort(Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        public Integer getContainerPort() {
            return this.containerPort;
        }

        public DescribeIngressResponseBodyDataRules setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeIngressResponseBodyDataRules setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public DescribeIngressResponseBodyDataRules setRewritePath(String rewritePath) {
            this.rewritePath = rewritePath;
            return this;
        }
        public String getRewritePath() {
            return this.rewritePath;
        }

        public DescribeIngressResponseBodyDataRules setRuleActions(java.util.List<DescribeIngressResponseBodyDataRulesRuleActions> ruleActions) {
            this.ruleActions = ruleActions;
            return this;
        }
        public java.util.List<DescribeIngressResponseBodyDataRulesRuleActions> getRuleActions() {
            return this.ruleActions;
        }

    }

    public static class DescribeIngressResponseBodyData extends TeaModel {
        /**
         * <p>The name of the application specified in the default rule.</p>
         * 
         * <strong>example:</strong>
         * <p>13623****809_16cad216b32_845_-419427029</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <strong>example:</strong>
         * <p>87<em><strong>35-cn-hangzhou,812</strong></em>3-cn-hangzhou</p>
         */
        @NameInMap("CertIds")
        public String certIds;

        @NameInMap("CreatedBySae")
        public Boolean createdBySae;

        /**
         * <p>The forwarding rules.</p>
         */
        @NameInMap("DefaultRule")
        public DescribeIngressResponseBodyDataDefaultRule defaultRule;

        /**
         * <p>The name of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ingress-sae-test</p>
         */
        @NameInMap("Description")
        public String description;

        @NameInMap("EnableXForwardedFor")
        public Boolean enableXForwardedFor;

        @NameInMap("EnableXForwardedForClientSrcPort")
        public Boolean enableXForwardedForClientSrcPort;

        @NameInMap("EnableXForwardedForProto")
        public Boolean enableXForwardedForProto;

        @NameInMap("EnableXForwardedForSlbId")
        public Boolean enableXForwardedForSlbId;

        @NameInMap("EnableXForwardedForSlbPort")
        public Boolean enableXForwardedForSlbPort;

        /**
         * <p>The HTTP status code. Valid values:</p>
         * <ul>
         * <li><strong>2xx</strong>: indicates that the request was successful.</li>
         * <li><strong>3xx</strong>: indicates that the request was redirected.</li>
         * <li><strong>4xx</strong>: indicates that the request was invalid.</li>
         * <li><strong>5xx</strong>: indicates that a server error occurred.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        /**
         * <p>The default rule.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>Indicates whether the configurations of the routing rule were queried successfully. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: indicates that the query was successful.</li>
         * <li><strong>false</strong>: indicates that the query failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clb</p>
         */
        @NameInMap("LoadBalanceType")
        public String loadBalanceType;

        /**
         * <p>The ID of the application specified in the default rule.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf6jt0nu4z6ior943****-80-f5****</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:sae-test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        /**
         * <p>The ID of the application specified in the forwarding rule.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeIngressResponseBodyDataRules> rules;

        /**
         * <strong>example:</strong>
         * <p>sp-n0kn923****</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The type of the SLB instance based on the IP address. Valid values:</p>
         * <ul>
         * <li><strong>internet</strong>: the Internet-facing SLB instance.</li>
         * <li><strong>intranet</strong>: the internal-facing SLB instance.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lb-uf62****6d13tq2u5</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The container port of the application specified in the default rule.</p>
         * 
         * <strong>example:</strong>
         * <p>internet</p>
         */
        @NameInMap("SlbType")
        public String slbType;

        public static DescribeIngressResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeIngressResponseBodyData self = new DescribeIngressResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeIngressResponseBodyData setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public DescribeIngressResponseBodyData setCertIds(String certIds) {
            this.certIds = certIds;
            return this;
        }
        public String getCertIds() {
            return this.certIds;
        }

        public DescribeIngressResponseBodyData setCreatedBySae(Boolean createdBySae) {
            this.createdBySae = createdBySae;
            return this;
        }
        public Boolean getCreatedBySae() {
            return this.createdBySae;
        }

        public DescribeIngressResponseBodyData setDefaultRule(DescribeIngressResponseBodyDataDefaultRule defaultRule) {
            this.defaultRule = defaultRule;
            return this;
        }
        public DescribeIngressResponseBodyDataDefaultRule getDefaultRule() {
            return this.defaultRule;
        }

        public DescribeIngressResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeIngressResponseBodyData setEnableXForwardedFor(Boolean enableXForwardedFor) {
            this.enableXForwardedFor = enableXForwardedFor;
            return this;
        }
        public Boolean getEnableXForwardedFor() {
            return this.enableXForwardedFor;
        }

        public DescribeIngressResponseBodyData setEnableXForwardedForClientSrcPort(Boolean enableXForwardedForClientSrcPort) {
            this.enableXForwardedForClientSrcPort = enableXForwardedForClientSrcPort;
            return this;
        }
        public Boolean getEnableXForwardedForClientSrcPort() {
            return this.enableXForwardedForClientSrcPort;
        }

        public DescribeIngressResponseBodyData setEnableXForwardedForProto(Boolean enableXForwardedForProto) {
            this.enableXForwardedForProto = enableXForwardedForProto;
            return this;
        }
        public Boolean getEnableXForwardedForProto() {
            return this.enableXForwardedForProto;
        }

        public DescribeIngressResponseBodyData setEnableXForwardedForSlbId(Boolean enableXForwardedForSlbId) {
            this.enableXForwardedForSlbId = enableXForwardedForSlbId;
            return this;
        }
        public Boolean getEnableXForwardedForSlbId() {
            return this.enableXForwardedForSlbId;
        }

        public DescribeIngressResponseBodyData setEnableXForwardedForSlbPort(Boolean enableXForwardedForSlbPort) {
            this.enableXForwardedForSlbPort = enableXForwardedForSlbPort;
            return this;
        }
        public Boolean getEnableXForwardedForSlbPort() {
            return this.enableXForwardedForSlbPort;
        }

        public DescribeIngressResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeIngressResponseBodyData setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        public DescribeIngressResponseBodyData setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public DescribeIngressResponseBodyData setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public DescribeIngressResponseBodyData setLoadBalanceType(String loadBalanceType) {
            this.loadBalanceType = loadBalanceType;
            return this;
        }
        public String getLoadBalanceType() {
            return this.loadBalanceType;
        }

        public DescribeIngressResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeIngressResponseBodyData setNamespaceId(String namespaceId) {
            this.namespaceId = namespaceId;
            return this;
        }
        public String getNamespaceId() {
            return this.namespaceId;
        }

        public DescribeIngressResponseBodyData setRequestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        public DescribeIngressResponseBodyData setRules(java.util.List<DescribeIngressResponseBodyDataRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeIngressResponseBodyDataRules> getRules() {
            return this.rules;
        }

        public DescribeIngressResponseBodyData setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public DescribeIngressResponseBodyData setSlbId(String slbId) {
            this.slbId = slbId;
            return this;
        }
        public String getSlbId() {
            return this.slbId;
        }

        public DescribeIngressResponseBodyData setSlbType(String slbType) {
            this.slbType = slbType;
            return this;
        }
        public String getSlbType() {
            return this.slbType;
        }

    }

}
