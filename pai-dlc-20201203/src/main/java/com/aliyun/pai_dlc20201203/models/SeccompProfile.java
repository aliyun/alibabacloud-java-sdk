// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SeccompProfile extends TeaModel {
    /**
     * <p>The path of the Seccomp profile on the node. This parameter takes effect only when Type is set to Localhost.</p>
     * 
     * <strong>example:</strong>
     * <p>my-profiles/profile-allow.json</p>
     */
    @NameInMap("LocalhostProfile")
    public String localhostProfile;

    /**
     * <p>The Seccomp configuration type. Valid values: Localhost, RuntimeDefault, Unconfined.</p>
     * 
     * <strong>example:</strong>
     * <p>Unconfined</p>
     */
    @NameInMap("Type")
    public String type;

    public static SeccompProfile build(java.util.Map<String, ?> map) throws Exception {
        SeccompProfile self = new SeccompProfile();
        return TeaModel.build(map, self);
    }

    public SeccompProfile setLocalhostProfile(String localhostProfile) {
        this.localhostProfile = localhostProfile;
        return this;
    }
    public String getLocalhostProfile() {
        return this.localhostProfile;
    }

    public SeccompProfile setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
