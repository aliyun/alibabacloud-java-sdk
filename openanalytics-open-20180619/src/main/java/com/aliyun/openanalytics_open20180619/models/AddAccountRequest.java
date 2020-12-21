// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class AddAccountRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("AccountName")
    @Validation(required = true)
    public String accountName;

    @NameInMap("Password")
    public String password;

    @NameInMap("IsShort")
    public Boolean isShort;

    @NameInMap("EnableKMS")
    public Boolean enableKMS;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RamUid")
    public String ramUid;

    @NameInMap("UseRandomPassword")
    public Boolean useRandomPassword;

    public static AddAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAccountRequest self = new AddAccountRequest();
        return TeaModel.build(map, self);
    }

    public AddAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public AddAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public AddAccountRequest setIsShort(Boolean isShort) {
        this.isShort = isShort;
        return this;
    }
    public Boolean getIsShort() {
        return this.isShort;
    }

    public AddAccountRequest setEnableKMS(Boolean enableKMS) {
        this.enableKMS = enableKMS;
        return this;
    }
    public Boolean getEnableKMS() {
        return this.enableKMS;
    }

    public AddAccountRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddAccountRequest setRamUid(String ramUid) {
        this.ramUid = ramUid;
        return this;
    }
    public String getRamUid() {
        return this.ramUid;
    }

    public AddAccountRequest setUseRandomPassword(Boolean useRandomPassword) {
        this.useRandomPassword = useRandomPassword;
        return this;
    }
    public Boolean getUseRandomPassword() {
        return this.useRandomPassword;
    }

}
