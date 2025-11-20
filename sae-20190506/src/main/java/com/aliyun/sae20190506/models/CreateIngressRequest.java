// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateIngressRequest extends TeaModel {
    /**
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("AddressType")
    public String addressType;

    /**
     * <p>The ID of the <strong>CLB</strong> certificate. Valid values:</p>
     * <ul>
     * <li>If you set <strong>LoadBalanceType</strong> to <strong>clb</strong>, you can use CertId to configure a certificate for the HTTPS listener.</li>
     * </ul>
     * <p>For more information about how to use SSL certificate IDs for CLB, see <a href="https://help.aliyun.com/document_detail/90792.html">Manage certificates (CLB)</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>188077086902****_176993d****_181437****_108724****</p>
     */
    @NameInMap("CertId")
    public String certId;

    /**
     * <p>The ID of the multi-certificate <strong>ALB</strong>. Valid values:</p>
     * <ul>
     * <li>If the <strong>LoadBalanceType</strong> is <strong>alb</strong>, use this field to configure multiple certificates for HTTPS listeners. Separate multiple certificate IDs with commas (,).</li>
     * <li>The ID of the SSL certificate used by ALB must be obtained from the digital certificate product. For example, in the configuration <code>756***-cn-hangzhou</code>, the <code>756***</code> is the certificate ID obtained from the product page, and the <code>-cn-hangzhou</code> is a fixed suffix. For more information, see <a href="https://help.aliyun.com/document_detail/209076.html">Manage certificates</a>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>87<em><strong>35-cn-hangzhou,812</strong></em>3-cn-hangzhou</p>
     */
    @NameInMap("CertIds")
    public String certIds;

    /**
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("CorsConfig")
    public String corsConfig;

    /**
     * <p>The default forwarding rule. Forwards traffic to a specified application through a specified port based on the IP address. The following table describes the parameters.</p>
     * <ul>
     * <li><strong>appId</strong>: the ID of the application.</li>
     * <li><strong>containerPort</strong>: The port of the application instance.</li>
     * </ul>
     * <blockquote>
     * <p> All requests that do not match or satisfy <strong>Rules</strong> forwarding rules are forwarded to the specified application.</p>
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
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("EnableGzip")
    public Boolean enableGzip;

    /**
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("EnableXForwardedFor")
    public Boolean enableXForwardedFor;

    /**
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("EnableXForwardedForClientSrcPort")
    public Boolean enableXForwardedForClientSrcPort;

    /**
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("EnableXForwardedForProto")
    public Boolean enableXForwardedForProto;

    /**
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("EnableXForwardedForSlbId")
    public Boolean enableXForwardedForSlbId;

    /**
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("EnableXForwardedForSlbPort")
    public Boolean enableXForwardedForSlbPort;

    /**
     * <p>Specifies the connection idle timeout period. Unit: seconds. Valid values: 1 to 60. If there is no access request within the timeout period, the SLB will temporarily interrupt the current connection until the next request comes to re-establish a new connection.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The SLB listening port. This port cannot be occupied.</p>
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
     * <li><strong>HTTP</strong>: suitable for applications that need to identify data content.</li>
     * <li><strong>HTTPS</strong>: suitable for applications that require encrypted transmission.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>SLB the type of the SLB instance. It depends on the type that you entered when you created the routing rule and cannot be changed when you update it. Valid values:</p>
     * <ul>
     * <li><strong>clb</strong>: traditional SLB CLB (formerly SLB).</li>
     * <li><strong>alb</strong>: Applied SLB ALB.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>clb</p>
     */
    @NameInMap("LoadBalanceType")
    public String loadBalanceType;

    /**
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("LoadBalancerEdition")
    public String loadBalancerEdition;

    /**
     * <p>The ID of the namespace where the application resides. Currently, cross-namespace applications are not supported.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-beijing:sae-test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>Specifies the request timeout period. Unit: seconds. Valid values: 1 to 180. If the backend server does not respond within the timeout period, the SLB abandons the wait and returns an HTTP 504 error code to the client.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The forwarding rule. Forwards traffic to a specified application through a specified port based on the domain name and request path. The following table describes the parameters.</p>
     * <ul>
     * <li><strong>appId</strong>: the ID of the application.</li>
     * <li><strong>containerPort</strong>: The port of the application instance.</li>
     * <li><strong>domain</strong>: the domain name.</li>
     * <li><strong>path</strong>: the request path.</li>
     * <li><strong>backendProtocol</strong>: The backend service protocol. Valid values: http, https, and grpc. Default value: http.</li>
     * <li><strong>rewritePath</strong>: Rewrite the path.</li>
     * </ul>
     * <blockquote>
     * <p> Only ALB allows you to set the RewritePath feature. CLB does not support this feature.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
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
     * <p>sp-bp1bpn0kn9****</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The Server Load Balancer (SLB) instance that is used by the routing rule.</p>
     * <blockquote>
     * <p> SLB SLB instances include CLB instances and ALB instances.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>lb-uf6hucc7inlqrtcq5****</p>
     */
    @NameInMap("SlbId")
    public String slbId;

    /**
     * <ul>
     * <li></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
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
