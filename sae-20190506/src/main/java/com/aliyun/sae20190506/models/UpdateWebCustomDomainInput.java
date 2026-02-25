// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebCustomDomainInput extends TeaModel {
    /**
     * <p>The name of the application to which data is forwarded by the domain name by default.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-app</p>
     */
    @NameInMap("DefaultForwardingAppName")
    public String defaultForwardingAppName;

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
     * <p>The route configuration.</p>
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

    public static UpdateWebCustomDomainInput build(java.util.Map<String, ?> map) throws Exception {
        UpdateWebCustomDomainInput self = new UpdateWebCustomDomainInput();
        return TeaModel.build(map, self);
    }

    public UpdateWebCustomDomainInput setDefaultForwardingAppName(String defaultForwardingAppName) {
        this.defaultForwardingAppName = defaultForwardingAppName;
        return this;
    }
    public String getDefaultForwardingAppName() {
        return this.defaultForwardingAppName;
    }

    public UpdateWebCustomDomainInput setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public UpdateWebCustomDomainInput setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    public UpdateWebCustomDomainInput setWebCertConfig(WebCertConfig webCertConfig) {
        this.webCertConfig = webCertConfig;
        return this;
    }
    public WebCertConfig getWebCertConfig() {
        return this.webCertConfig;
    }

    public UpdateWebCustomDomainInput setWebTLSConfig(WebTLSConfig webTLSConfig) {
        this.webTLSConfig = webTLSConfig;
        return this;
    }
    public WebTLSConfig getWebTLSConfig() {
        return this.webTLSConfig;
    }

    public UpdateWebCustomDomainInput setWebWAFConfig(WebWAFConfig webWAFConfig) {
        this.webWAFConfig = webWAFConfig;
        return this;
    }
    public WebWAFConfig getWebWAFConfig() {
        return this.webWAFConfig;
    }

}
