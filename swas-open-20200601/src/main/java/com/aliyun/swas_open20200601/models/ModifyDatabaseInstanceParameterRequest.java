// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyDatabaseInstanceParameterRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    @NameInMap("ForceRestart")
    public Boolean forceRestart;

    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("RegionId")
    public String regionId;

    public static ModifyDatabaseInstanceParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDatabaseInstanceParameterRequest self = new ModifyDatabaseInstanceParameterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDatabaseInstanceParameterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyDatabaseInstanceParameterRequest setDatabaseInstanceId(String databaseInstanceId) {
        this.databaseInstanceId = databaseInstanceId;
        return this;
    }
    public String getDatabaseInstanceId() {
        return this.databaseInstanceId;
    }

    public ModifyDatabaseInstanceParameterRequest setForceRestart(Boolean forceRestart) {
        this.forceRestart = forceRestart;
        return this;
    }
    public Boolean getForceRestart() {
        return this.forceRestart;
    }

    public ModifyDatabaseInstanceParameterRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyDatabaseInstanceParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
