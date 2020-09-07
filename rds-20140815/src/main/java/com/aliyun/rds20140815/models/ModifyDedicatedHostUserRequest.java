// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyDedicatedHostUserRequest extends TeaModel {
    @NameInMap("DedicatedHostName")
    @Validation(required = true)
    public String dedicatedHostName;

    @NameInMap("UserName")
    @Validation(required = true)
    public String userName;

    @NameInMap("OldPassword")
    @Validation(required = true)
    public String oldPassword;

    @NameInMap("NewPassword")
    @Validation(required = true)
    public String newPassword;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDedicatedHostUserRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDedicatedHostUserRequest self = new ModifyDedicatedHostUserRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDedicatedHostUserRequest setDedicatedHostName(String dedicatedHostName) {
        this.dedicatedHostName = dedicatedHostName;
        return this;
    }
    public String getDedicatedHostName() {
        return this.dedicatedHostName;
    }

    public ModifyDedicatedHostUserRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

    public ModifyDedicatedHostUserRequest setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
        return this;
    }
    public String getOldPassword() {
        return this.oldPassword;
    }

    public ModifyDedicatedHostUserRequest setNewPassword(String newPassword) {
        this.newPassword = newPassword;
        return this;
    }
    public String getNewPassword() {
        return this.newPassword;
    }

    public ModifyDedicatedHostUserRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
