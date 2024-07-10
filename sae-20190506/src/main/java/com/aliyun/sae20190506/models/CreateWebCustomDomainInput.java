// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateWebCustomDomainInput extends TeaModel {
    @NameInMap("DefaultForwardingAppName")
    public String defaultForwardingAppName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    @NameInMap("WebCertConfig")
    public WebCertConfig webCertConfig;

    @NameInMap("WebTLSConfig")
    public WebTLSConfig webTLSConfig;

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
