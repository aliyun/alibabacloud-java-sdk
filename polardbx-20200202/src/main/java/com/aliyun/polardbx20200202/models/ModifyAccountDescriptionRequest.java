// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class ModifyAccountDescriptionRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DBInstanceName")
    public String DBInstanceName;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("AccountDescription")
    public String accountDescription;

    public static ModifyAccountDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyAccountDescriptionRequest self = new ModifyAccountDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyAccountDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyAccountDescriptionRequest setDBInstanceName(String DBInstanceName) {
        this.DBInstanceName = DBInstanceName;
        return this;
    }
    public String getDBInstanceName() {
        return this.DBInstanceName;
    }

    public ModifyAccountDescriptionRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ModifyAccountDescriptionRequest setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
        return this;
    }
    public String getAccountDescription() {
        return this.accountDescription;
    }

}
