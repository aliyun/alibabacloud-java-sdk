// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class E2BNetwork extends TeaModel {
    /**
     * <p>The allowlist for outbound access from the sandbox. After configuration, the sandbox can access only the destinations in the list.</p>
     */
    @NameInMap("allowOut")
    public java.util.List<String> allowOut;

    /**
     * <p>Specifies whether to allow Direct Internet Access to the sandbox.</p>
     */
    @NameInMap("allowPublicTraffic")
    public Boolean allowPublicTraffic;

    /**
     * <p>The denylist for outbound access from the sandbox. After configuration, the sandbox cannot access the destinations in the list.</p>
     */
    @NameInMap("denyOut")
    public java.util.List<String> denyOut;

    /**
     * <p>The domain name used to rewrite the request Host header when accessing the sandbox. If this parameter is not specified, the original Host is retained.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox.example.com</p>
     */
    @NameInMap("maskRequestHost")
    public String maskRequestHost;

    public static E2BNetwork build(java.util.Map<String, ?> map) throws Exception {
        E2BNetwork self = new E2BNetwork();
        return TeaModel.build(map, self);
    }

    public E2BNetwork setAllowOut(java.util.List<String> allowOut) {
        this.allowOut = allowOut;
        return this;
    }
    public java.util.List<String> getAllowOut() {
        return this.allowOut;
    }

    public E2BNetwork setAllowPublicTraffic(Boolean allowPublicTraffic) {
        this.allowPublicTraffic = allowPublicTraffic;
        return this;
    }
    public Boolean getAllowPublicTraffic() {
        return this.allowPublicTraffic;
    }

    public E2BNetwork setDenyOut(java.util.List<String> denyOut) {
        this.denyOut = denyOut;
        return this;
    }
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

    public E2BNetwork setMaskRequestHost(String maskRequestHost) {
        this.maskRequestHost = maskRequestHost;
        return this;
    }
    public String getMaskRequestHost() {
        return this.maskRequestHost;
    }

}
