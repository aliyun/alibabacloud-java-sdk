// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SecurityContext extends TeaModel {
    /**
     * <p>The Linux capabilities configuration of the container.</p>
     */
    @NameInMap("Capabilities")
    public SecurityContextCapabilities capabilities;

    /**
     * <p>Specifies whether to enable privileged mode. This option is available only for specific Lingjun AI Computing Service subscription user scenarios.</p>
     */
    @NameInMap("Privileged")
    public Boolean privileged;

    /**
     * <p>The GID of the user that runs the container.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RunAsGroup")
    public Long runAsGroup;

    /**
     * <p>The UID of the user that runs the container.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("RunAsUser")
    public Long runAsUser;

    /**
     * <p>The Seccomp profile configuration.</p>
     */
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
