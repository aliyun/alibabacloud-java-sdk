// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateWebCustomDomainInput extends TeaModel {
    /**
     * <p>The name of the application to which data is forwarded by the domain name by default.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-app</p>
     */
    @NameInMap("DefaultForwardingAppName")
    public String defaultForwardingAppName;

    /**
     * <p>The domain name. Enter a custom domain name that has obtained an Internet content provider (ICP) filing in the Alibaba Cloud ICP Filing system, or a custom domain name whose ICP filing information includes Alibaba Cloud as a service provider.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The protocol type that is supported by the custom domain name. Valid values:</p>
     * <ul>
     * <li><strong>HTTP</strong>: Only HTTP is supported.</li>
     * <li><strong>HTTPS</strong>: Only HTTPS is supported.</li>
     * <li><strong>HTTP,HTTPS</strong>: Both HTTP and HTTPS are supported.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    /**
     * <p>The route configurations.</p>
     */
    @NameInMap("RouteConfig")
    public RouteConfig routeConfig;

    /**
     * <p>The information about the HTTPS certificate.</p>
     */
    @NameInMap("WebCertConfig")
    public WebCertConfig webCertConfig;

    /**
     * <p>The Transport Layer Security (TLS) configurations.</p>
     */
    @NameInMap("WebTLSConfig")
    public WebTLSConfig webTLSConfig;

    /**
     * <p>The Web Application Firewall (WAF) configurations.</p>
     */
    @NameInMap("WebWAFConfig")
    public WebWAFConfig webWAFConfig;

    public static CreateWebCustomDomainInput build(java.util.Map<String, ?> map) throws Exception {
        CreateWebCustomDomainInput self = new CreateWebCustomDomainInput();
        return TeaModel.build(map, self);
    }

    public CreateWebCustomDomainInput setDefaultForwardingAppName(String defaultForwardingAppName) {
        this.defaultForwardingAppName = defaultForwardingAppName;
        return this;
    }
    public String getDefaultForwardingAppName() {
        return this.defaultForwardingAppName;
    }

    public CreateWebCustomDomainInput setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public CreateWebCustomDomainInput setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public CreateWebCustomDomainInput setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    public CreateWebCustomDomainInput setWebCertConfig(WebCertConfig webCertConfig) {
        this.webCertConfig = webCertConfig;
        return this;
    }
    public WebCertConfig getWebCertConfig() {
        return this.webCertConfig;
    }

    public CreateWebCustomDomainInput setWebTLSConfig(WebTLSConfig webTLSConfig) {
        this.webTLSConfig = webTLSConfig;
        return this;
    }
    public WebTLSConfig getWebTLSConfig() {
        return this.webTLSConfig;
    }

    public CreateWebCustomDomainInput setWebWAFConfig(WebWAFConfig webWAFConfig) {
        this.webWAFConfig = webWAFConfig;
        return this;
    }
    public WebWAFConfig getWebWAFConfig() {
        return this.webWAFConfig;
    }

}
