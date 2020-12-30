// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openanalytics_open20180619.models;

import com.aliyun.tea.*;

public class DeleteAccountRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("IsShort")
    public Boolean isShort;

    @NameInMap("IsServiceUser")
    public Boolean isServiceUser;

    public static DeleteAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccountRequest self = new DeleteAccountRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccountRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAccountRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DeleteAccountRequest setIsShort(Boolean isShort) {
        this.isShort = isShort;
        return this;
    }
    public Boolean getIsShort() {
        return this.isShort;
    }

    public DeleteAccountRequest setIsServiceUser(Boolean isServiceUser) {
        this.isServiceUser = isServiceUser;
        return this;
    }
    public Boolean getIsServiceUser() {
        return this.isServiceUser;
    }

}
