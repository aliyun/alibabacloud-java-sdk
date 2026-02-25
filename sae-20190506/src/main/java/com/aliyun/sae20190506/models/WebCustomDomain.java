// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebCustomDomain extends TeaModel {
    /**
     * <p>The time when the custom domain name was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-30T08:02:19Z</p>
     */
    @NameInMap("CreatedTime")
    public String createdTime;

    /**
     * <p>The name of the application that is forwarded by the domain name by default.</p>
     * 
     * <strong>example:</strong>
     * <p>appxxxxx</p>
     */
    @NameInMap("DefaultForwardingAppName")
    public String defaultForwardingAppName;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>The time when the custom domain name was last updated.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-03-30T08:02:19Z</p>
     */
    @NameInMap("LastModifiedTime")
    public String lastModifiedTime;

    /**
     * <p>The ID of the namespace to which the domain name belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    /**
     * <p>The protocol type that is supported by the custom domain name. HTTP: Only HTTP is supported. HTTPS: Only HTTPS is supported. HTTP, HTTPS: Both HTTP and HTTPS are supported.</p>
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
     * <p>The WAF configurations.</p>
     */
    @NameInMap("WebWAFConfig")
    public WebWAFConfig webWAFConfig;

    /**
     * <p>The ID of your Alibaba Cloud account</p>
     * 
     * <strong>example:</strong>
     * <p>123xxxxxx</p>
     */
    @NameInMap("accountId")
    public String accountId;

    public static WebCustomDomain build(java.util.Map<String, ?> map) throws Exception {
        WebCustomDomain self = new WebCustomDomain();
        return TeaModel.build(map, self);
    }

    public WebCustomDomain setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }
    public String getCreatedTime() {
        return this.createdTime;
    }

    public WebCustomDomain setDefaultForwardingAppName(String defaultForwardingAppName) {
        this.defaultForwardingAppName = defaultForwardingAppName;
        return this;
    }
    public String getDefaultForwardingAppName() {
        return this.defaultForwardingAppName;
    }

    public WebCustomDomain setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public WebCustomDomain setLastModifiedTime(String lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
        return this;
    }
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    public WebCustomDomain setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

    public WebCustomDomain setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public WebCustomDomain setRouteConfig(RouteConfig routeConfig) {
        this.routeConfig = routeConfig;
        return this;
    }
    public RouteConfig getRouteConfig() {
        return this.routeConfig;
    }

    public WebCustomDomain setWebCertConfig(WebCertConfig webCertConfig) {
        this.webCertConfig = webCertConfig;
        return this;
    }
    public WebCertConfig getWebCertConfig() {
        return this.webCertConfig;
    }

    public WebCustomDomain setWebTLSConfig(WebTLSConfig webTLSConfig) {
        this.webTLSConfig = webTLSConfig;
        return this;
    }
    public WebTLSConfig getWebTLSConfig() {
        return this.webTLSConfig;
    }

    public WebCustomDomain setWebWAFConfig(WebWAFConfig webWAFConfig) {
        this.webWAFConfig = webWAFConfig;
        return this;
    }
    public WebWAFConfig getWebWAFConfig() {
        return this.webWAFConfig;
    }

    public WebCustomDomain setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

}
