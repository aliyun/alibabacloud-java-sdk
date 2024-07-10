// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class UpdateWebCustomDomainInput extends TeaModel {
    @NameInMap("DefaultForwardingAppName")
    public String defaultForwardingAppName;

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
