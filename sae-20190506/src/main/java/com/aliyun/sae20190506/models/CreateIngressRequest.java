// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressRequest extends TeaModel {
    /**
     * <p>The address type. Valid values:</p>
     * <ul>
     * <li><p><code>Internet</code>: A public address.</p>
     * </li>
     * <li><p><code>Intranet</code>: A private address.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the <strong>CLB</strong> certificate.</p>
     * <ul>
     * <li>If <code>LoadBalanceType</code> is set to <code>clb</code>, use this parameter to configure the HTTPS listener certificate.</li>
     * </ul>
     * <p>For more information about how to use SSL certificate IDs for CLB, see <a href="https://help.aliyun.com/document_detail/90792.html">Manage Certificates (CLB)</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>188077086902****_176993d****_181437****_108724****</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>The IDs of the <strong>ALB</strong> certificates.</p>
     * <ul>
     * <li><p>If <code>LoadBalanceType</code> is set to <code>alb</code>, use this parameter to configure multiple certificates for the HTTPS listener. Separate multiple certificate IDs with a comma (,).</p>
     * </li>
     * <li><p>Obtain the SSL certificate ID for an ALB instance from the digital certificate service. For example, if you configure <code>756***-cn-hangzhou</code>, <code>756***</code> is the certificate ID obtained from the product page and <code>-cn-hangzhou</code> is a fixed suffix. For more information, see <a href="https://help.aliyun.com/document_detail/209076.html">Manage Certificates (ALB)</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>87<em><strong>35-cn-hangzhou,812</strong></em>3-cn-hangzhou</p>
     */
    @NameInMap("CertIds")
    public String certIds;

    /**
     * <p>Specifies the Cross-Origin Resource Sharing (CORS) configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Enable&quot;:&quot;true&quot;}</p>
     */
    @NameInMap("CorsConfig")
    public String corsConfig;

    /**
     * <p>The default forwarding rule. Requests that do not match any forwarding rule in the <code>Rules</code> parameter are forwarded to the application specified in this rule. The value is a JSON string with the following parameters:</p>
     * <ul>
     * <li><p><code>appId</code>: The ID of the application.</p>
     * </li>
     * <li><p><code>containerPort</code>: The port of the application instance.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>This rule serves as a catch-all for traffic that is not handled by other specific forwarding rules.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
     * <p>ingress-for-sae-test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable Gzip for data compression.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableGzip")
    public Boolean enableGzip;

    /**
     * <p>Specifies whether to use the <code>X-Forwarded-For</code> header to retrieve the IP address of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedFor")
    public Boolean enableXForwardedFor;

    /**
     * <p>Specifies whether to use the <code>X-Forwarded-Port</code> header to retrieve the source port of the client.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForClientSrcPort")
    public Boolean enableXForwardedForClientSrcPort;

    /**
     * <p>Specifies whether to use the <code>X-Forwarded-Proto</code> header to retrieve the listener protocol of the load balancer instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForProto")
    public Boolean enableXForwardedForProto;

    /**
     * <p>Specifies whether to use the <code>SLB-ID</code> header to retrieve the ID of the load balancer instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForSlbId")
    public Boolean enableXForwardedForSlbId;

    /**
     * <p>Specifies whether to use the <code>X-Forwarded-Port</code> header to retrieve the listener port of the load balancer instance.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForSlbPort")
    public Boolean enableXForwardedForSlbPort;

    /**
     * <p>The connection idle timeout, in seconds. Valid values: 1 to 60. If no request is received within the timeout period, the load balancer temporarily closes the connection. The connection is re-established when the next request is received.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The listener port for the SLB instance. This port must be available.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The request forwarding protocol. Valid values:</p>
     * <ul>
     * <li><p><code>HTTP</code>: for applications that do not require encryption.</p>
     * </li>
     * <li><p><code>HTTPS</code>: suitable for applications that require encrypted data transmission.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The type of the Server Load Balancer (SLB) instance. This parameter cannot be changed after the routing rule is created. Valid values:</p>
     * <ul>
     * <li><p><code>clb</code>: Classic Load Balancer (CLB), formerly known as SLB.</p>
     * </li>
     * <li><p><code>alb</code>: Application Load Balancer (ALB).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clb</p>
     */
    @NameInMap("LoadBalanceType")
    public String loadBalanceType;

    /**
     * <p>The edition of the Application Load Balancer (ALB) instance. Different editions have different features and billing policies. Valid values:</p>
     * <ul>
     * <li><p><code>Standard</code>: Standard edition.</p>
     * </li>
     * <li><p><code>StandardWithWaf</code>: WAF-enhanced edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("LoadBalancerEdition")
    public String loadBalancerEdition;

    /**
     * <p>The ID of the namespace where the application is located. Cross-namespace applications are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:sae-test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The request timeout, in seconds. Valid values: 1 to 180. If a backend server does not respond within the timeout period, the load balancer stops waiting and returns an HTTP 504 error to the client.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The forwarding rules. These rules route traffic to a specified application based on the domain name and path. The value is a JSON string. Each rule contains the following parameters:</p>
     * <ul>
     * <li><p><code>appId</code>: The ID of the application.</p>
     * </li>
     * <li><p><code>containerPort</code>: The port of the application instance.</p>
     * </li>
     * <li><p><code>domain</code>: The domain name.</p>
     * </li>
     * <li><p><code>path</code>: The request path.</p>
     * </li>
     * <li><p><code>backendProtocol</code>: The protocol used by backend servers. Valid values: <code>http</code>, <code>https</code>, and <code>grpc</code>. Default value: <code>http</code>.</p>
     * </li>
     * <li><p><code>rewritePath</code>: The rewritten path.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Only ALB supports path rewriting (<code>RewritePath</code>). CLB does not support this feature.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;appId&quot;:&quot;395b60e4-0550-458d-9c54-a265d036****&quot;,&quot;containerPort&quot;:8080,&quot;domain&quot;:&quot;<a href="http://www.sae.site%22,%22path%22:%22/path1%22%7D,%7B%22appId%22:%22666403ce-d25b-47cf-87fe-497565d2****%22,%22containerPort%22:8080,%22domain%22:%22sae.site%22,%22path%22:%22/sys/(.*)/(.*)/aaa%22,%22backendProtocol%22:%22http%22%7D%5D">www.sae.site&quot;,&quot;path&quot;:&quot;/path1&quot;},{&quot;appId&quot;:&quot;666403ce-d25b-47cf-87fe-497565d2****&quot;,&quot;containerPort&quot;:8080,&quot;domain&quot;:&quot;sae.site&quot;,&quot;path&quot;:&quot;/sys/(.*)/(.*)/aaa&quot;,&quot;backendProtocol&quot;:&quot;http&quot;}]</a></p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The ID of the security policy instance.</p>
     * 
     * <strong>example:</strong>
     * <p>sp-bp1bpn0kn9****</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The ID of the Server Load Balancer (SLB) instance associated with the routing rule.</p>
     * <blockquote>
     * <p>Server Load Balancer (SLB) includes Classic Load Balancer (CLB) and Application Load Balancer (ALB) instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-uf6hucc7inlqrtcq5****</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <p>A JSON string that contains the mappings between availability zones and VSwitches. If the current region supports two or more availability zones, you must specify at least two. A ZoneMapping consists of the following parameters:</p>
     * <ul>
     * <li><p><code>VSwitchId</code>: a string that specifies the ID of the VSwitch that corresponds to the availability zone. Each availability zone can have only one VSwitch and one subnet.</p>
     * </li>
     * <li><p><code>ZoneId</code>: a string that specifies the ID of the availability zone for the load balancer instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;VSwitchId&quot;:&quot;vsw-wz9klui6icc08p6******&quot;,&quot;ZoneId&quot;:&quot;cn-shenzhen-c&quot;},{&quot;VSwitchId&quot;:&quot;vsw-wz9frrmoeuki2wp******&quot;,&quot;ZoneId&quot;:&quot;cn-shenzhen-e&quot;}]</p>
     */
    @NameInMap("ZoneMappings")
    public String zoneMappings;

    public static CreateIngressRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateIngressRequest self = new CreateIngressRequest();
        return TeaModel.build(map, self);
    }

    public CreateIngressRequest setAddressType(String addressType) {
        this.addressType = addressType;
        return this;
    }
    public String getAddressType() {
        return this.addressType;
    }

    public CreateIngressRequest setCertId(String certId) {
        this.certId = certId;
        return this;
    }
    public String getCertId() {
        return this.certId;
    }

    public CreateIngressRequest setCertIds(String certIds) {
        this.certIds = certIds;
        return this;
    }
    public String getCertIds() {
        return this.certIds;
    }

    public CreateIngressRequest setCorsConfig(String corsConfig) {
        this.corsConfig = corsConfig;
        return this;
    }
    public String getCorsConfig() {
        return this.corsConfig;
    }

    public CreateIngressRequest setDefaultRule(String defaultRule) {
        this.defaultRule = defaultRule;
        return this;
    }
    public String getDefaultRule() {
        return this.defaultRule;
    }

    public CreateIngressRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateIngressRequest setEnableGzip(Boolean enableGzip) {
        this.enableGzip = enableGzip;
        return this;
    }
    public Boolean getEnableGzip() {
        return this.enableGzip;
    }

    public CreateIngressRequest setEnableXForwardedFor(Boolean enableXForwardedFor) {
        this.enableXForwardedFor = enableXForwardedFor;
        return this;
    }
    public Boolean getEnableXForwardedFor() {
        return this.enableXForwardedFor;
    }

    public CreateIngressRequest setEnableXForwardedForClientSrcPort(Boolean enableXForwardedForClientSrcPort) {
        this.enableXForwardedForClientSrcPort = enableXForwardedForClientSrcPort;
        return this;
    }
    public Boolean getEnableXForwardedForClientSrcPort() {
        return this.enableXForwardedForClientSrcPort;
    }

    public CreateIngressRequest setEnableXForwardedForProto(Boolean enableXForwardedForProto) {
        this.enableXForwardedForProto = enableXForwardedForProto;
        return this;
    }
    public Boolean getEnableXForwardedForProto() {
        return this.enableXForwardedForProto;
    }

    public CreateIngressRequest setEnableXForwardedForSlbId(Boolean enableXForwardedForSlbId) {
        this.enableXForwardedForSlbId = enableXForwardedForSlbId;
        return this;
    }
    public Boolean getEnableXForwardedForSlbId() {
        return this.enableXForwardedForSlbId;
    }

    public CreateIngressRequest setEnableXForwardedForSlbPort(Boolean enableXForwardedForSlbPort) {
        this.enableXForwardedForSlbPort = enableXForwardedForSlbPort;
        return this;
    }
    public Boolean getEnableXForwardedForSlbPort() {
        return this.enableXForwardedForSlbPort;
    }

    public CreateIngressRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public CreateIngressRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateIngressRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public CreateIngressRequest setLoadBalanceType(String loadBalanceType) {
        this.loadBalanceType = loadBalanceType;
        return this;
    }
    public String getLoadBalanceType() {
        return this.loadBalanceType;
    }

    public CreateIngressRequest setLoadBalancerEdition(String loadBalancerEdition) {
        this.loadBalancerEdition = loadBalancerEdition;
        return this;
    }
    public String getLoadBalancerEdition() {
        return this.loadBalancerEdition;
    }

    public CreateIngressRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public CreateIngressRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public CreateIngressRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public CreateIngressRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public CreateIngressRequest setSlbId(String slbId) {
        this.slbId = slbId;
        return this;
    }
    public String getSlbId() {
        return this.slbId;
    }

    public CreateIngressRequest setZoneMappings(String zoneMappings) {
        this.zoneMappings = zoneMappings;
        return this;
    }
    public String getZoneMappings() {
        return this.zoneMappings;
    }

}
