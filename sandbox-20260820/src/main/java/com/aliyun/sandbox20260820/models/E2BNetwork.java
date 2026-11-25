// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class E2BNetwork extends TeaModel {
    /**
     * <p>The allowlist for outbound access from the sandbox. After configuration, the sandbox can only access the destinations in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;api.example.com&quot;,&quot;10.0.0.0/8&quot;]</p>
     */
    @NameInMap("allowOut")
    public java.util.List<String> allowOut;

    /**
     * <p>Specifies whether Direct Internet Access to the sandbox is allowed.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("allowPublicTraffic")
    public Boolean allowPublicTraffic;

    /**
     * <p>The denylist for outbound access from the sandbox. After configuration, the sandbox cannot access the destinations in the list.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;blocked.example.com&quot;,&quot;192.168.0.0/16&quot;]</p>
     */
    @NameInMap("denyOut")
    public java.util.List<String> denyOut;

    /**
     * <p>The domain name used to rewrite the request Host header when accessing the sandbox. If not configured, the original Host header remains unchanged.</p>
     * 
     * <strong>example:</strong>
     * <p>sandbox.example.com</p>
     */
    @NameInMap("maskRequestHost")
    public String maskRequestHost;

    /**
     * <p>The key is the exact destination hostname or the E2B reserved key @fc.sandbox.identity, and the value is a list of rule objects. The number of hostnames and replacement entries is subject to account quota limits. GetSandboxInner echoes the current hostname rules and configured OAuth options in the same format. User tokens are only used during writes.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;api.example.com&quot;:[{&quot;transform&quot;:{&quot;headers&quot;:{&quot;X-Example&quot;:&quot;demo&quot;}}}]}</p>
     */
    @NameInMap("rules")
    public java.util.Map<String, java.util.List<java.util.Map<String, ?>>> rules;

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

    public E2BNetwork setRules(java.util.Map<String, java.util.List<java.util.Map<String, ?>>> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.Map<String, java.util.List<java.util.Map<String, ?>>> getRules() {
        return this.rules;
    }

}
