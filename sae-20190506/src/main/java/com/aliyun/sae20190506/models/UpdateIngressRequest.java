// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressRequest extends TeaModel {
    /**
     * <p><strong>CLB</strong> certificate ID. Details are as follows:</p>
     * <ul>
     * <li>If <strong>LoadBalanceType</strong> is <strong>clb</strong>, use this field to configure the HTTPS listener certificate.</li>
     * </ul>
     * <p>For more information about using SSL certificate IDs with CLB, see <a href="">Manage Certificates (CLB)</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>188077086902****_176993d****_181437****_108724****</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p><strong>ALB</strong> multiple certificate IDs. Details are as follows:</p>
     * <ul>
     * <li><p>If <strong>LoadBalanceType</strong> is <strong>alb</strong>, use this field to configure multiple HTTPS listener certificates. Separate multiple certificate IDs with commas.</p>
     * </li>
     * <li><p>Obtain the SSL certificate ID used by ALB from the digital certificate product. For example, configure <code>756***-cn-hangzhou</code>, where <code>756***</code> is the certificate ID obtained from the product page, and <code>-cn-hangzhou</code> is a fixed suffix. For more information, see <a href="">Manage Certificates (ALB)</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>87<em><strong>35-cn-hangzhou,812</strong></em>3-cn-hangzhou</p>
     */
    @NameInMap("CertIds")
    public String certIds;

    /**
     * <p>Cross-domain configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Enable\&quot;:\&quot;true\&quot;}</p>
     */
    @NameInMap("CorsConfig")
    public String corsConfig;

    /**
     * <p>Default forwarding rule. Forward traffic to the specified application by IP address through the specified port. Parameter description:</p>
     * <ul>
     * <li><p><strong>appId</strong>: Application ID.</p>
     * </li>
     * <li><p><strong>containerPort</strong>: Application instance port.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>All requests that do not match or satisfy the <strong>Rules</strong> forwarding rule are forwarded to this specified application.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;appId&quot;:&quot;395b60e4-0550-458d-9c54-a265d036****&quot;,&quot;containerPort&quot;:8080}</p>
     */
    @NameInMap("DefaultRule")
    public String defaultRule;

    /**
     * <p>Routing rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>ingress-sae-test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Enable or disable data compression.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableGzip")
    public Boolean enableGzip;

    /**
     * <p>Enable or disable obtaining the client IP address of the visitor through the X-Forwarded-For header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedFor")
    public Boolean enableXForwardedFor;

    /**
     * <p>Obtain the listening port of the SLB instance through the X-Forwarded-Port header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForClientSrcPort")
    public Boolean enableXForwardedForClientSrcPort;

    /**
     * <p>Specifies whether to determine the listener protocol of the SLB instance from the X-Forwarded-Proto header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForProto")
    public Boolean enableXForwardedForProto;

    /**
     * <p>Obtain the SLB instance ID through the SLB-ID header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForSlbId")
    public Boolean enableXForwardedForSlbId;

    /**
     * <p>Whether to obtain the listening port of the Server Load Balancer instance from the X-Forwarded-Port header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForSlbPort")
    public Boolean enableXForwardedForSlbPort;

    /**
     * <p>Idle connection timeout, in seconds (s).</p>
     * <blockquote>
     * <p>A value of 0 indicates that the default idle timeout is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>Routing rule ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>87</p>
     */
    @NameInMap("IngressId")
    public Long ingressId;

    /**
     * <p>SLB listening port. This port must not be occupied.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("ListenerPort")
    public String listenerPort;

    /**
     * <p>Forwarding Protocol. Details are as follows:</p>
     * <ul>
     * <li><p><strong>HTTP</strong>: Applies to applications that need to identify data content.</p>
     * </li>
     * <li><p><strong>HTTPS</strong>: Applies to applications that need encrypted transmission.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>Deprecated parameter. Updates are no longer supported.</p>
     * 
     * <strong>example:</strong>
     * <p>clb</p>
     */
    @NameInMap("LoadBalanceType")
    public String loadBalanceType;

    /**
     * <p>Request timeout, in seconds (s).</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>Forwarding rules. Forward traffic to the specified application by domain name and URI of the request through the specified port. Parameter description:</p>
     * <ul>
     * <li><p><strong>appId</strong>: Application ID.</p>
     * </li>
     * <li><p><strong>containerPort</strong>: Application instance port.</p>
     * </li>
     * <li><p><strong>domain</strong>: Domain name.</p>
     * </li>
     * <li><p><strong>path</strong>: URI of the request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;appId&quot;:&quot;395b60e4-0550-458d-9c54-a265d036****&quot;,&quot;containerPort&quot;:8080,&quot;domain&quot;:&quot;<a href="http://www.sae.site%22,%22path%22:%22/path1%22%7D,%7B%22appId%22:%22666403ce-d25b-47cf-87fe-497565d2****%22,%22containerPort%22:8080,%22domain%22:%22sae.site%22,%22path%22:%22/path2%22%7D%5D">www.sae.site&quot;,&quot;path&quot;:&quot;/path1&quot;},{&quot;appId&quot;:&quot;666403ce-d25b-47cf-87fe-497565d2****&quot;,&quot;containerPort&quot;:8080,&quot;domain&quot;:&quot;sae.site&quot;,&quot;path&quot;:&quot;/path2&quot;}]</a></p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>Security policy instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_2_strict_with_1_3</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    public static UpdateIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateIngressRequest self = new UpdateIngressRequest();
        return TeaModel.build(map, self);
    }

    public UpdateIngressRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public UpdateIngressRequest setCertIds(String certIds) {
        this.certIds = certIds;
        return this;
    }
    public String getCertIds() {
        return this.certIds;
    }

    public UpdateIngressRequest setCorsConfig(String corsConfig) {
        this.corsConfig = corsConfig;
        return this;
    }
    public String getCorsConfig() {
        return this.corsConfig;
    }

    public UpdateIngressRequest setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

    public UpdateIngressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateIngressRequest setEnableGzip(Boolean enableGzip) {
        this.enableGzip = enableGzip;
        return this;
    }
    public Boolean getEnableGzip() {
        return this.enableGzip;
    }

    public UpdateIngressRequest setEnableXForwardedFor(Boolean enableXForwardedFor) {
        this.enableXForwardedFor = enableXForwardedFor;
        return this;
    }
    public Boolean getEnableXForwardedFor() {
        return this.enableXForwardedFor;
    }

    public UpdateIngressRequest setEnableXForwardedForClientSrcPort(Boolean enableXForwardedForClientSrcPort) {
        this.enableXForwardedForClientSrcPort = enableXForwardedForClientSrcPort;
        return this;
    }
    public Boolean getEnableXForwardedForClientSrcPort() {
        return this.enableXForwardedForClientSrcPort;
    }

    public UpdateIngressRequest setEnableXForwardedForProto(Boolean enableXForwardedForProto) {
        this.enableXForwardedForProto = enableXForwardedForProto;
        return this;
    }
    public Boolean getEnableXForwardedForProto() {
        return this.enableXForwardedForProto;
    }

    public UpdateIngressRequest setEnableXForwardedForSlbId(Boolean enableXForwardedForSlbId) {
        this.enableXForwardedForSlbId = enableXForwardedForSlbId;
        return this;
    }
    public Boolean getEnableXForwardedForSlbId() {
        return this.enableXForwardedForSlbId;
    }

    public UpdateIngressRequest setEnableXForwardedForSlbPort(Boolean enableXForwardedForSlbPort) {
        this.enableXForwardedForSlbPort = enableXForwardedForSlbPort;
        return this;
    }
    public Boolean getEnableXForwardedForSlbPort() {
        return this.enableXForwardedForSlbPort;
    }

    public UpdateIngressRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public UpdateIngressRequest setIngressId(Long ingressId) {
        this.ingressId = ingressId;
        return this;
    }
    public Long getIngressId() {
        return this.ingressId;
    }

    public UpdateIngressRequest setListenerPort(String listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public String getListenerPort() {
        return this.listenerPort;
    }

    public UpdateIngressRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public UpdateIngressRequest setLoadBalanceType(String loadBalanceType) {
        this.loadBalanceType = loadBalanceType;
        return this;
    }
    public String getLoadBalanceType() {
        return this.loadBalanceType;
    }

    public UpdateIngressRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public UpdateIngressRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public UpdateIngressRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

}
