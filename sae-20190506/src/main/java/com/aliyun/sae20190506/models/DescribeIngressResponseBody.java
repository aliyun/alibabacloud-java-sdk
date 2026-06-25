// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class DescribeIngressResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned for the request. Valid values:</p>
     * <ul>
     * <li><p><strong>2xx</strong>: The request was successful.</p>
     * </li>
     * <li><p><strong>3xx</strong>: The request was redirected.</p>
     * </li>
     * <li><p><strong>4xx</strong>: A client error occurred.</p>
     * </li>
     * <li><p><strong>5xx</strong>: A server error occurred.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public DescribeIngressResponseBodyData data;

    /**
     * <p>The error code.</p>
     * <ul>
     * <li><p>This parameter is returned only if the request fails.</p>
     * </li>
     * <li><p>For more information, see the <strong>Error codes</strong> section in this topic.</p>
     * </li>
     * </ul>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The returned message.</p>
     * <ul>
     * <li><p>If the request is successful, <strong>success</strong> is returned.</p>
     * </li>
     * <li><p>If the request fails, a specific error code is returned.</p>
     * </li>
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
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The request succeeded.</p>
     * </li>
     * <li><p><strong>false</strong>: The request failed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The trace ID used to query the details of a call.</p>
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

    public static class DescribeIngressResponseBodyDataCorsConfig extends TeaModel {
        /**
         * <p>Specifies whether to allow credentials in cross-origin requests. Valid values:</p>
         * <ul>
         * <li><p><strong>on</strong>: yes</p>
         * </li>
         * <li><p><strong>off</strong>: no</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("AllowCredentials")
        public String allowCredentials;

        /**
         * <p>The headers that are allowed in cross-origin requests.</p>
         * 
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        @NameInMap("AllowHeaders")
        public String allowHeaders;

        /**
         * <p>The HTTP methods that are allowed for cross-origin requests.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("AllowMethods")
        public String allowMethods;

        /**
         * <p>The origins that are allowed to access the resource. You can specify a single asterisk (<code>*</code>) or one or more specific origins.</p>
         * <ul>
         * <li><p>A specific origin must start with <code>http://</code> or <code>https://</code> and be a valid domain name or a first-level wildcard domain name. Example: <code>http://*.test.abc.example.com</code>.</p>
         * </li>
         * <li><p>You can optionally specify a port. The valid port range is <strong>1</strong> to <strong>65535</strong>.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("AllowOrigin")
        public String allowOrigin;

        /**
         * <p>Specifies whether to enable CORS.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The headers that are exposed to clients.</p>
         * 
         * <strong>example:</strong>
         * <p>test_123</p>
         */
        @NameInMap("ExposeHeaders")
        public String exposeHeaders;

        /**
         * <p>The maximum cache duration of preflight requests in the browser, in seconds.</p>
         * <p>Valid values: <strong>-1</strong> to <strong>172800</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("MaxAge")
        public String maxAge;

        public static DescribeIngressResponseBodyDataCorsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeIngressResponseBodyDataCorsConfig self = new DescribeIngressResponseBodyDataCorsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeIngressResponseBodyDataCorsConfig setAllowCredentials(String allowCredentials) {
            this.allowCredentials = allowCredentials;
            return this;
        }
        public String getAllowCredentials() {
            return this.allowCredentials;
        }

        public DescribeIngressResponseBodyDataCorsConfig setAllowHeaders(String allowHeaders) {
            this.allowHeaders = allowHeaders;
            return this;
        }
        public String getAllowHeaders() {
            return this.allowHeaders;
        }

        public DescribeIngressResponseBodyDataCorsConfig setAllowMethods(String allowMethods) {
            this.allowMethods = allowMethods;
            return this;
        }
        public String getAllowMethods() {
            return this.allowMethods;
        }

        public DescribeIngressResponseBodyDataCorsConfig setAllowOrigin(String allowOrigin) {
            this.allowOrigin = allowOrigin;
            return this;
        }
        public String getAllowOrigin() {
            return this.allowOrigin;
        }

        public DescribeIngressResponseBodyDataCorsConfig setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public DescribeIngressResponseBodyDataCorsConfig setExposeHeaders(String exposeHeaders) {
            this.exposeHeaders = exposeHeaders;
            return this;
        }
        public String getExposeHeaders() {
            return this.exposeHeaders;
        }

        public DescribeIngressResponseBodyDataCorsConfig setMaxAge(String maxAge) {
            this.maxAge = maxAge;
            return this;
        }
        public String getMaxAge() {
            return this.maxAge;
        }

    }

    public static class DescribeIngressResponseBodyDataDefaultRule extends TeaModel {
        /**
         * <p>The ID of the application for the default rule.</p>
         * 
         * <strong>example:</strong>
         * <p>395b60e4-0550-458d-9c54-a265d036****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the application for the default rule.</p>
         * 
         * <strong>example:</strong>
         * <p>app1</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The backend protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>http</strong>: Suitable for applications that need to identify data content.</p>
         * </li>
         * <li><p><strong>https</strong>: Suitable for applications that require encrypted transmission.</p>
         * </li>
         * <li><p><strong>grpc</strong>: Suitable for load balancing gRPC services developed in multiple languages, such as .NET.</p>
         * </li>
         * </ul>
         * <p>This parameter is valid only when the <code>LoadBalanceType</code> parameter is set to <code>alb</code> and the <code>ListenerProtocol</code> parameter is set to <code>HTTPS</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("BackendProtocol")
        public String backendProtocol;

        /**
         * <p>The backend port for the default rule.</p>
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
        /**
         * <p>The configuration of the action.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;host\&quot;:\&quot;<a href="http://www.example.com%5C%5C%22,%5C%5C%22path%5C%5C%22:%5C%5C%22/example/text%5C%5C%22,%5C%5C%22query%5C%5C%22:%5C%5C%22x=1%5C%5C%22%7D">www.example.com\\&quot;,\\&quot;path\\&quot;:\\&quot;/example/text\\&quot;,\\&quot;query\\&quot;:\\&quot;x=1\\&quot;}</a></p>
         */
        @NameInMap("ActionConfig")
        public String actionConfig;

        /**
         * <p>The type of the action. Valid values:</p>
         * <ul>
         * <li><p>rewrite: a rewrite policy</p>
         * </li>
         * <li><p>redirect: a redirection policy</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>rewrite</p>
         */
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
         * <p>The ID of the destination application.</p>
         * 
         * <strong>example:</strong>
         * <p>395b60e4-0550-458d-9c54-a265d036****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>The name of the destination application.</p>
         * 
         * <strong>example:</strong>
         * <p>app1</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The backend protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>http</strong>: Suitable for applications that need to identify data content.</p>
         * </li>
         * <li><p><strong>https</strong>: Suitable for applications that require encrypted transmission.</p>
         * </li>
         * <li><p><strong>grpc</strong>: Suitable for load balancing gRPC services developed in multiple languages, such as .NET.</p>
         * </li>
         * </ul>
         * <p>This parameter is valid only when the <code>LoadBalanceType</code> parameter is set to <code>alb</code> and the <code>ListenerProtocol</code> parameter is set to <code>HTTPS</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>http</p>
         */
        @NameInMap("BackendProtocol")
        public String backendProtocol;

        /**
         * <p>The backend port of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>8080</p>
         */
        @NameInMap("ContainerPort")
        public Integer containerPort;

        /**
         * <p>The domain name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>edas.site</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The URL path.</p>
         * 
         * <strong>example:</strong>
         * <p>/path1</p>
         */
        @NameInMap("Path")
        public String path;

        /**
         * <p>The rewritten path.</p>
         * 
         * <strong>example:</strong>
         * <p>/${1}</p>
         */
        @NameInMap("RewritePath")
        public String rewritePath;

        /**
         * <p>The actions of the forwarding rule.</p>
         */
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
         * <p>The ID of the <strong>Classic Load Balancer (CLB)</strong> certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>13623****809_16cad216b32_845_-419427029</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The comma-separated IDs of the <strong>Application Load Balancer (ALB)</strong> certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>87<em><strong>35-cn-hangzhou,812</strong></em>3-cn-hangzhou</p>
         */
        @NameInMap("CertIds")
        public String certIds;

        /**
         * <p>The configurations for Cross-Origin Resource Sharing (CORS). Valid HTTP methods:</p>
         * <ul>
         * <li><p><strong>GET</strong></p>
         * </li>
         * <li><p><strong>POST</strong></p>
         * </li>
         * <li><p><strong>PUT</strong></p>
         * </li>
         * <li><p><strong>DELETE</strong></p>
         * </li>
         * <li><p><strong>HEAD</strong></p>
         * </li>
         * <li><p><strong>OPTIONS</strong></p>
         * </li>
         * <li><p><strong>PATCH</strong></p>
         * </li>
         * </ul>
         */
        @NameInMap("CorsConfig")
        public DescribeIngressResponseBodyDataCorsConfig corsConfig;

        /**
         * <p>Indicates whether the Application Load Balancer (ALB) instance was provisioned by SAE.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CreatedBySae")
        public Boolean createdBySae;

        /**
         * <p>The default rule.</p>
         */
        @NameInMap("DefaultRule")
        public DescribeIngressResponseBodyDataDefaultRule defaultRule;

        /**
         * <p>The description of the Ingress.</p>
         * 
         * <strong>example:</strong>
         * <p>ingress-sae-test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>Specifies whether to enable Gzip compression.</p>
         */
        @NameInMap("EnableGzip")
        public Boolean enableGzip;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-For</code> header to retrieve client IP addresses.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableXForwardedFor")
        public Boolean enableXForwardedFor;

        /**
         * <p>Specifies whether to use a header to retrieve the source port of the client.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableXForwardedForClientSrcPort")
        public Boolean enableXForwardedForClientSrcPort;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Proto</code> header to retrieve the listener protocol of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableXForwardedForProto")
        public Boolean enableXForwardedForProto;

        /**
         * <p>Specifies whether to use the <code>SLB-ID</code> header to retrieve the ID of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableXForwardedForSlbId")
        public Boolean enableXForwardedForSlbId;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Port</code> header to retrieve the listener port of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableXForwardedForSlbPort")
        public Boolean enableXForwardedForSlbPort;

        /**
         * <p>The ID of the Ingress.</p>
         * 
         * <strong>example:</strong>
         * <p>87</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The connection idle timeout, in seconds.</p>
         * <p>Valid values: 1 to 60.</p>
         * <p>Default value: 15.</p>
         * <p>If no request is received within the timeout period, the load balancer closes the connection. A new connection is established when the next request is received.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("IdleTimeout")
        public Integer idleTimeout;

        /**
         * <p>The listener port of the SLB instance.</p>
         * 
         * <strong>example:</strong>
         * <p>443</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The request forwarding protocol. Valid values:</p>
         * <ul>
         * <li><p><strong>HTTP</strong>: Suitable for applications that need to identify data content.</p>
         * </li>
         * <li><p><strong>HTTPS</strong>: Suitable for applications that require encrypted transmission.</p>
         * </li>
         * </ul>
         * <p>This parameter is optional for the <code>CreateIngress</code> and <code>UpdateIngress</code> operations. It is not returned if it was not specified when the Ingress was created or updated.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("ListenerProtocol")
        public String listenerProtocol;

        /**
         * <p>The type of the Server Load Balancer (SLB) instance. Valid values:</p>
         * <ul>
         * <li><p><strong>clb</strong>: Classic Load Balancer (CLB), formerly known as SLB.</p>
         * </li>
         * <li><p><strong>alb</strong>: Application Load Balancer (ALB).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>clb</p>
         */
        @NameInMap("LoadBalanceType")
        public String loadBalanceType;

        /**
         * <p>The name of the Ingress.</p>
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
         * <p>cn-beijing:sae-test</p>
         */
        @NameInMap("NamespaceId")
        public String namespaceId;

        /**
         * <p>The request timeout, in seconds.</p>
         * <p>Valid values: 1 to 180.</p>
         * <p>Default value: 60.</p>
         * <p>If a backend server does not respond within the specified timeout period, the load balancer terminates the request and returns an HTTP 504 error to the client.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        /**
         * <p>The forwarding rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeIngressResponseBodyDataRules> rules;

        /**
         * <p>The ID of the security policy instance.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-n0kn923****</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The ID of the Server Load Balancer (SLB) instance.</p>
         * 
         * <strong>example:</strong>
         * <p>lb-uf62****6d13tq2u5</p>
         */
        @NameInMap("SlbId")
        public String slbId;

        /**
         * <p>The type of the SLB instance. Valid values:</p>
         * <ul>
         * <li><p><strong>internet</strong>: An internet-facing instance.</p>
         * </li>
         * <li><p><strong>intranet</strong>: An internal-facing instance.</p>
         * </li>
         * </ul>
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

        public DescribeIngressResponseBodyData setCorsConfig(DescribeIngressResponseBodyDataCorsConfig corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }
        public DescribeIngressResponseBodyDataCorsConfig getCorsConfig() {
            return this.corsConfig;
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

        public DescribeIngressResponseBodyData setEnableGzip(Boolean enableGzip) {
            this.enableGzip = enableGzip;
            return this;
        }
        public Boolean getEnableGzip() {
            return this.enableGzip;
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
