// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class WebTLSConfig extends TeaModel {
    @NameInMap("CipherSuites")
    public java.util.List<String> cipherSuites;

    @NameInMap("MaxVersion")
    public String maxVersion;

    @NameInMap("MinVersion")
    public String minVersion;

    public static WebTLSConfig build(java.util.Map<String, ?> map) throws Exception {
        WebTLSConfig self = new WebTLSConfig();
        return TeaModel.build(map, self);
    }

    public WebTLSConfig setCipherSuites(java.util.List<String> cipherSuites) {
        this.cipherSuites = cipherSuites;
        return this;
    }
    public java.util.List<String> getCipherSuites() {
        return this.cipherSuites;
    }

    public WebTLSConfig setMaxVersion(String maxVersion) {
        this.maxVersion = maxVersion;
        return this;
    }
    public String getMaxVersion() {
        return this.maxVersion;
    }

    public WebTLSConfig setMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }
    public String getMinVersion() {
        return this.minVersion;
    }

}
