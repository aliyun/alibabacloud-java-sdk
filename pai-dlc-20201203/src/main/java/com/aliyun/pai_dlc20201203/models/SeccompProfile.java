// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dlc20201203.models;

import com.aliyun.tea.*;

public class SeccompProfile extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>my-profiles/profile-allow.json</p>
     */
    @NameInMap("LocalhostProfile")
    public String localhostProfile;

    /**
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
