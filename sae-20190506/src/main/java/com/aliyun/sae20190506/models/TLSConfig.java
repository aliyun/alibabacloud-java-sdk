// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class TLSConfig extends TeaModel {
    @NameInMap("cipherSuites")
    public java.util.List<String> cipherSuites;

    @NameInMap("maxVersion")
    public String maxVersion;

    @NameInMap("minVersion")
    public String minVersion;

    public static TLSConfig build(java.util.Map<String, ?> map) throws Exception {
        TLSConfig self = new TLSConfig();
        return TeaModel.build(map, self);
    }

    public TLSConfig setCipherSuites(java.util.List<String> cipherSuites) {
        this.cipherSuites = cipherSuites;
        return this;
    }
    public java.util.List<String> getCipherSuites() {
        return this.cipherSuites;
    }

    public TLSConfig setMaxVersion(String maxVersion) {
        this.maxVersion = maxVersion;
        return this;
    }
    public String getMaxVersion() {
        return this.maxVersion;
    }

    public TLSConfig setMinVersion(String minVersion) {
        this.minVersion = minVersion;
        return this;
    }
    public String getMinVersion() {
        return this.minVersion;
    }

}
