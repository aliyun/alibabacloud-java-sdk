// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateIngressRequest extends TeaModel {
    /**
     * <p>The ID of the Classic Load Balancer (CLB) certificate. Valid values:</p>
     * <ul>
     * <li>If <strong>LoadBalanceType</strong> is set to <strong>clb</strong>, use this field to configure the certificate for the HTTPS listener.</li>
     * </ul>
     * <p>For more information about using SSL certificate IDs in CLB, see <a href="https://help.aliyun.com/document_detail/90792.html">Manage certificates (CLB)</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>188077086902****_176993d****_181437****_108724****</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>The IDs of multiple Application Load Balancer (ALB) certificates. Valid values:</p>
     * <ul>
     * <li><p>If <strong>LoadBalanceType</strong> is set to <strong>alb</strong>, use this field to configure multiple certificates for the HTTPS listener. Separate multiple certificate IDs with commas (,).</p>
     * </li>
     * <li><p>You must obtain the SSL certificate IDs used by ALB from the Certificate Management Service. For example, if you configure <code>756***-cn-hangzhou</code>, <code>756***</code> is the certificate ID obtained from the product page, and <code>-cn-hangzhou</code> is a fixed suffix. For more information, see <a href="https://help.aliyun.com/document_detail/209076.html">Manage certificates (ALB)</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>87<em><strong>35-cn-hangzhou,812</strong></em>3-cn-hangzhou</p>
     */
    @NameInMap("CertIds")
    public String certIds;

    /**
     * <p>The cross-origin resource sharing (CORS) configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Enable\&quot;:\&quot;true\&quot;}</p>
     */
    @NameInMap("CorsConfig")
    public String corsConfig;

    /**
     * <p>The default forwarding rule. Traffic is forwarded to a specified application through a specified port based on the IP address. The parameters are described as follows:</p>
     * <ul>
     * <li><strong>appId</strong>: the ID of the application.</li>
     * <li><strong>containerPort</strong>: the port of the application instance.</li>
     * </ul>
     * <blockquote>
     * <p>All requests that do not match or meet the forwarding rules in <strong>Rules</strong> are forwarded to the specified application.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;appId&quot;:&quot;395b60e4-0550-458d-9c54-a265d036****&quot;,&quot;containerPort&quot;:8080}</p>
     */
    @NameInMap("DefaultRule")
    public String defaultRule;

    /**
     * <p>The name of the routing rule.</p>
     * 
     * <strong>example:</strong>
     * <p>ingress-sae-test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable data compression.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableGzip")
    public Boolean enableGzip;

    /**
     * <p>Specifies whether to enable the retrieval of the client IP address through the X-Forwarded-For header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedFor")
    public Boolean enableXForwardedFor;

    /**
     * <p>Specifies whether to retrieve the listening port of the load balancing instance through the X-Forwarded-Port header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForClientSrcPort")
    public Boolean enableXForwardedForClientSrcPort;

    /**
     * <p>Specifies whether to retrieve the listening protocol of the load balancing instance through the X-Forwarded-Proto header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForProto")
    public Boolean enableXForwardedForProto;

    /**
     * <p>Specifies whether to retrieve the instance ID of the load balancing instance through the SLB-ID header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForSlbId")
    public Boolean enableXForwardedForSlbId;

    /**
     * <p>Specifies whether to retrieve the listening port of the load balancing instance through the X-Forwarded-Port header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForSlbPort")
    public Boolean enableXForwardedForSlbPort;

    /**
     * <p>The idle connection timeout period, in seconds.</p>
     * <blockquote>
     * <p>A value of 0 indicates that the default idle timeout value is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The ID of the routing rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>87</p>
     */
    @NameInMap("IngressId")
    public Long ingressId;

    /**
     * <p>The listening port of the Server Load Balancer (SLB) instance. The port must not be occupied.</p>
     * 
     * <strong>example:</strong>
     * <p>443</p>
     */
    @NameInMap("ListenerPort")
    public String listenerPort;

    /**
     * <p>The request forwarding protocol. Valid values:</p>
     * <ul>
     * <li><strong>HTTP</strong>: applicable to applications that need to identify data content.</li>
     * <li><strong>HTTPS</strong>: applicable to applications that require encrypted transmission.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated and updates are no longer supported.</p>
     * 
     * <strong>example:</strong>
     * <p>clb</p>
     */
    @NameInMap("LoadBalanceType")
    public String loadBalanceType;

    /**
     * <p>The request timeout period, in seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The forwarding rules. Traffic is forwarded to a specified application through a specified port based on the domain name and request path. The parameters are described as follows:</p>
     * <ul>
     * <li><strong>appId</strong>: the ID of the application.</li>
     * <li><strong>containerPort</strong>: the port of the application instance.</li>
     * <li><strong>domain</strong>: the domain name.</li>
     * <li><strong>path</strong>: the request path.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;appId&quot;:&quot;395b60e4-0550-458d-9c54-a265d036****&quot;,&quot;containerPort&quot;:8080,&quot;domain&quot;:&quot;<a href="http://www.sae.site%22,%22path%22:%22/path1%22%7D,%7B%22appId%22:%22666403ce-d25b-47cf-87fe-497565d2****%22,%22containerPort%22:8080,%22domain%22:%22sae.site%22,%22path%22:%22/path2%22%7D%5D">www.sae.site&quot;,&quot;path&quot;:&quot;/path1&quot;},{&quot;appId&quot;:&quot;666403ce-d25b-47cf-87fe-497565d2****&quot;,&quot;containerPort&quot;:8080,&quot;domain&quot;:&quot;sae.site&quot;,&quot;path&quot;:&quot;/path2&quot;}]</a></p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The ID of the security policy instance.</p>
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
