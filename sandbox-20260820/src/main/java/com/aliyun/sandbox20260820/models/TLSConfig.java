// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class TLSConfig extends TeaModel {
    /**
     * <p>The list of allowed TLS cipher suites. If this parameter is not specified, the server default cipher suites are used.</p>
     */
    @NameInMap("cipherSuites")
    public java.util.List<String> cipherSuites;

    /**
     * <p>The maximum TLS protocol version allowed. Example values: TLSv1.2 and TLSv1.3. If this parameter is not specified, the server default value is used. Do not pass an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>TLSv1.3</p>
     */
    @NameInMap("maxVersion")
    public String maxVersion;

    /**
     * <p>The minimum TLS protocol version allowed. Example values: TLSv1.2 and TLSv1.3. If this parameter is not specified, the server default value is used. Do not pass an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>TLSv1.2</p>
     */
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
