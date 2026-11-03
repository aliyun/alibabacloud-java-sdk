// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressRequest extends TeaModel {
    /**
     * <p>The address type. Valid values:</p>
     * <ul>
     * <li>Internet: public network address.</li>
     * <li>Intranet: private network address.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Internet</p>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the <strong>CLB</strong> certificate. Valid values:</p>
     * <ul>
     * <li>If <strong>LoadBalanceType</strong> is set to <strong>clb</strong>, use this field to configure the certificate for the HTTPS listener.</li>
     * </ul>
     * <p>For more information about how to use SSL certificate IDs in CLB, see <a href="https://help.aliyun.com/document_detail/90792.html">Manage certificates (CLB)</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>188077086902****_176993d****_181437****_108724****</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>The IDs of the <strong>ALB</strong> certificates. Valid values:</p>
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
     * <p>{&quot;Enable&quot;:&quot;true&quot;}</p>
     */
    @NameInMap("CorsConfig")
    public String corsConfig;

    /**
     * <p>The default forwarding rule. Traffic is forwarded to the specified application based on the IP address through the specified port. The parameters are as follows:</p>
     * <ul>
     * <li><strong>appId</strong>: the ID of the application.</li>
     * <li><strong>containerPort</strong>: the port of the application instance.</li>
     * </ul>
     * <blockquote>
     * <p>All requests that do not match or meet the forwarding rules in <strong>Rules</strong> are forwarded to the specified application.</p>
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
     * <p>Specifies whether to enable data compression.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableGzip")
    public Boolean enableGzip;

    /**
     * <p>Specifies whether to enable the feature to obtain the client IP address of the visitor through the X-Forwarded-For header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedFor")
    public Boolean enableXForwardedFor;

    /**
     * <p>Specifies whether to obtain the listening port of the load balancing instance through the X-Forwarded-Port header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForClientSrcPort")
    public Boolean enableXForwardedForClientSrcPort;

    /**
     * <p>Specifies whether to obtain the listening protocol of the load balancing instance through the X-Forwarded-Proto header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForProto")
    public Boolean enableXForwardedForProto;

    /**
     * <p>Specifies whether to obtain the load balancing instance ID through the SLB-ID header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForSlbId")
    public Boolean enableXForwardedForSlbId;

    /**
     * <p>Specifies whether to obtain the listening port of the load balancing instance through the X-Forwarded-Port header field.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableXForwardedForSlbPort")
    public Boolean enableXForwardedForSlbPort;

    /**
     * <p>Specifies the connection idle timeout period. Unit: seconds. Valid values: 1 to 60. If no access request is received within the timeout period, load balancing temporarily breaks the current connection until a new connection is established when the next request arrives.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The listening port of the SLB instance. The port must not be occupied.</p>
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
     * <p>The type of the SLB instance. The type depends on the value specified when the routing rule is created and cannot be changed during updates. Valid values:</p>
     * <ul>
     * <li><strong>clb</strong>: Classic Load Balancer (CLB).</li>
     * <li><strong>alb</strong>: Application Load Balancer (ALB).</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clb</p>
     */
    @NameInMap("LoadBalanceType")
    public String loadBalanceType;

    /**
     * <p>The edition of the Application Load Balancer (ALB). Different editions have different feature limits and billing policy. Valid values:</p>
     * <ul>
     * <li><p><strong>Standard</strong>: Standard Edition.</p>
     * </li>
     * <li><p><strong>StandardWithWaf</strong>: WAF-enhanced Edition.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Standard</p>
     */
    @NameInMap("LoadBalancerEdition")
    public String loadBalancerEdition;

    /**
     * <p>The ID of the namespace where the application resides. Cross-namespace applications are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:sae-test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>Specifies the request timeout period. Unit: seconds. Valid values: 1 to 180. If the backend server does not send a response within the timeout period, load balancing stops waiting and returns an HTTP 504 error code to the client.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The forwarding rules. Traffic is forwarded to the specified application based on the domain name and the request path through the specified port. The parameters are as follows:</p>
     * <ul>
     * <li><strong>appId</strong>: the ID of the application.</li>
     * <li><strong>containerPort</strong>: the port of the application instance.</li>
     * <li><strong>domain</strong>: the domain name.</li>
     * <li><strong>path</strong>: the URI of the request.</li>
     * <li><strong>backendProtocol</strong>: the backend service Terms of Service. Valid values: http, https, and grpc. Default value: http.</li>
     * <li><strong>rewritePath</strong>: the rewrite path.</li>
     * </ul>
     * <blockquote>
     * <p>Currently, only ALB supports the URL path rewrite (RewritePath) feature. CLB does not support this feature.</p>
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
     * <p>The SLB instance ID used by the routing rule.</p>
     * <blockquote>
     * <p>Server Load Balancer (SLB) includes CLB and ALB instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-uf6hucc7inlqrtcq5****</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <p>The JSON string of the zone and vSwitch mapping list. If the current region supports two or more zones, you must add at least two zones. A ZoneMapping structure includes:</p>
     * <ul>
     * <li><p>VSwitchId: the vSwitch corresponding to the zone. Data type: String. Only one vSwitch and one subnet can be used in each zone.</p>
     * </li>
     * <li><p>ZoneId: the zone ID of the Network Load Balancer (NLB) instance. Data type: String.</p>
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
