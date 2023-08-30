// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ModifyDatabaseInstanceParameterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the Simple Database Service instance.</p>
     */
    @NameInMap("DatabaseInstanceId")
    public String databaseInstanceId;

    /**
     * <p>Specifies whether to forcibly restart the instance after parameters are modified. Valid values:</p>
     * <br>
     * <p>*   true: forcibly restarts the instance. If a new parameter value takes effect only after the instance restarts, you must set this parameter to true. Otherwise, the new parameter value cannot take effect.</p>
     * <p>*   false: does not forcibly restart the instance.</p>
     * <br>
     * <p>Default value: false.</p>
     */
    @NameInMap("ForceRestart")
    public Boolean forceRestart;

    /**
     * <p>The JSON strings that consist of instance parameters and the values of the instance parameters. The parameter values are of the string type. Format: {"Parameter name 1":"Parameter value 1","Parameter name 2":"Parameter value 2"...}.</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The region ID of the Simple Database Service instance. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
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
