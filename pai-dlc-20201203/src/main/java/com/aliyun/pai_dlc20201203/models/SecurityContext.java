// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SecurityContext extends TeaModel {
    @NameInMap("Capabilities")
    public SecurityContextCapabilities capabilities;

    @NameInMap("Privileged")
    public Boolean privileged;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RunAsGroup")
    public Long runAsGroup;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RunAsUser")
    public Long runAsUser;

    @NameInMap("SeccompProfile")
    public SeccompProfile seccompProfile;

    public static SecurityContext build(java.util.Map<String, ?> map) throws Exception {
        SecurityContext self = new SecurityContext();
        return TeaModel.build(map, self);
    }

    public SecurityContext setCapabilities(SecurityContextCapabilities capabilities) {
        this.capabilities = capabilities;
        return this;
    }
    public SecurityContextCapabilities getCapabilities() {
        return this.capabilities;
    }

    public SecurityContext setPrivileged(Boolean privileged) {
        this.privileged = privileged;
        return this;
    }
    public Boolean getPrivileged() {
        return this.privileged;
    }

    public SecurityContext setRunAsGroup(Long runAsGroup) {
        this.runAsGroup = runAsGroup;
        return this;
    }
    public Long getRunAsGroup() {
        return this.runAsGroup;
    }

    public SecurityContext setRunAsUser(Long runAsUser) {
        this.runAsUser = runAsUser;
        return this;
    }
    public Long getRunAsUser() {
        return this.runAsUser;
    }

    public SecurityContext setSeccompProfile(SeccompProfile seccompProfile) {
        this.seccompProfile = seccompProfile;
        return this;
    }
    public SeccompProfile getSeccompProfile() {
        return this.seccompProfile;
    }

}
