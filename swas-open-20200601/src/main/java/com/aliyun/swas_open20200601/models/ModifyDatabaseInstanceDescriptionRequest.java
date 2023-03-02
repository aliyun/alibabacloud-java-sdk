// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyDatabaseInstanceDescriptionRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DatabaseInstanceDescription")
    public String databaseInstanceDescription;

    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDatabaseInstanceDescriptionRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseInstanceDescriptionRequest self = new ModifyDatabaseInstanceDescriptionRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseInstanceDescriptionRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDatabaseInstanceDescriptionRequest setDatabaseInstanceDescription(String databaseInstanceDescription) {
        this.databaseInstanceDescription = databaseInstanceDescription;
        return this;
    }
    public String getDatabaseInstanceDescription() {
        return this.databaseInstanceDescription;
    }

    public ModifyDatabaseInstanceDescriptionRequest setDatabaseInstanceId(String databaseInstanceId) {
        this.databaseInstanceId = databaseInstanceId;
        return this;
    }
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
    }

    public ModifyDatabaseInstanceDescriptionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
