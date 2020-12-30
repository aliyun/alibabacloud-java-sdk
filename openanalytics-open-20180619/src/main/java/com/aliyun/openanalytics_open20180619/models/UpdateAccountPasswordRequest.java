// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class UpdateAccountPasswordRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("IsShort")
    public Boolean isShort;

    @NameInMap("Password")
    public String password;

    @NameInMap("EnableKMS")
    public Boolean enableKMS;

    @NameInMap("UseRandomPassword")
    public Boolean useRandomPassword;

    public static UpdateAccountPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountPasswordRequest self = new UpdateAccountPasswordRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccountPasswordRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateAccountPasswordRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public UpdateAccountPasswordRequest setIsShort(Boolean isShort) {
        this.isShort = isShort;
        return this;
    }
    public Boolean getIsShort() {
        return this.isShort;
    }

    public UpdateAccountPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateAccountPasswordRequest setEnableKMS(Boolean enableKMS) {
        this.enableKMS = enableKMS;
        return this;
    }
    public Boolean getEnableKMS() {
        return this.enableKMS;
    }

    public UpdateAccountPasswordRequest setUseRandomPassword(Boolean useRandomPassword) {
        this.useRandomPassword = useRandomPassword;
        return this;
    }
    public Boolean getUseRandomPassword() {
        return this.useRandomPassword;
    }

}
