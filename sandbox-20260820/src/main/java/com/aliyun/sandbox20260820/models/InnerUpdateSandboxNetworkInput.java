// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class InnerUpdateSandboxNetworkInput extends TeaModel {
    /**
     * <p>The switch for outbound public network access from the sandbox. When set to false, it collapses to the default deny policy of the platform and shares the same outbound policy with allowOut and denyOut. This field is included in the full replacement. If omitted, no deny entries are appended based on this switch. However, if allowOut is not empty and denyOut is empty, denyOut is automatically set to 0.0.0.0/0, and IPv4 outbound traffic to destinations other than those in allowOut is denied.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("allowInternetAccess")
    public Boolean allowInternetAccess;

    /**
     * <p>The destinations allowed for outbound access, which can be IP addresses, CIDR blocks, exact domain names, or domain names with a wildcard only in the leftmost label (such as *.example.com). allowOut takes precedence over denyOut. The maximum list length depends on the account quota. If omitted, the existing allow list is cleared.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;api.example.com&quot;,&quot;10.0.0.0/8&quot;]</p>
     */
    @NameInMap("allowOut")
    public java.util.List<String> allowOut;

    /**
     * <p>The destinations denied for outbound access, in the same format as allowOut. If a destination matches both allow and deny rules, the allow rule takes precedence. The maximum list length depends on the account quota. If omitted, the existing deny list is cleared.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;blocked.example.com&quot;,&quot;192.168.0.0/16&quot;]</p>
     */
    @NameInMap("denyOut")
    public java.util.List<String> denyOut;

    /**
     * <p>The outbound network rules where the key is an exact destination hostname or the E2B reserved key @fc.sandbox.identity, and the value is a list of rule objects. The number of hosts and replacement entries is subject to the account quota limit. Omitting rules or passing a null object clears the standard host rules. OAuth options tables are updated individually. Omitting the corresponding reserved header retains the original table, while passing the character string &quot;{}&quot; clears the table.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;api.example.com&quot;:[{&quot;transform&quot;:{&quot;headers&quot;:{&quot;X-Example&quot;:&quot;demo&quot;}}}]}</p>
     */
    @NameInMap("rules")
    public java.util.Map<String, java.util.List<java.util.Map<String, ?>>> rules;

    public static InnerUpdateSandboxNetworkInput build(java.util.Map<String, ?> map) throws Exception {
        InnerUpdateSandboxNetworkInput self = new InnerUpdateSandboxNetworkInput();
        return TeaModel.build(map, self);
    }

    public InnerUpdateSandboxNetworkInput setAllowInternetAccess(Boolean allowInternetAccess) {
        this.allowInternetAccess = allowInternetAccess;
        return this;
    }
    public Boolean getAllowInternetAccess() {
        return this.allowInternetAccess;
    }

    public InnerUpdateSandboxNetworkInput setAllowOut(java.util.List<String> allowOut) {
        this.allowOut = allowOut;
        return this;
    }
    public java.util.List<String> getAllowOut() {
        return this.allowOut;
    }

    public InnerUpdateSandboxNetworkInput setDenyOut(java.util.List<String> denyOut) {
        this.denyOut = denyOut;
        return this;
    }
    public java.util.List<String> getDenyOut() {
        return this.denyOut;
    }

    public InnerUpdateSandboxNetworkInput setRules(java.util.Map<String, java.util.List<java.util.Map<String, ?>>> rules) {
        this.rules = rules;
        return this;
    }
    public java.util.Map<String, java.util.List<java.util.Map<String, ?>>> getRules() {
        return this.rules;
    }

}
