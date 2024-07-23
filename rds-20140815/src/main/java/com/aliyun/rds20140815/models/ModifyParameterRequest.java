// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyParameterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>ETnLKlblzczshOTUbOCzxxxxxxxxxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>Specifies whether to restart the instance for a new parameter value to take effect. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The system forcefully restarts the instance. If a new parameter value takes effect only after the instance restarts, you must set this parameter to true. Otherwise, the new parameter value cannot take effect.</li>
     * <li><strong>false</strong>: The system does not forcefully restart the instance.</li>
     * </ul>
     * <p>Default value: <strong>false</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Forcerestart")
    public Boolean forcerestart;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The parameter template ID.</p>
     * <blockquote>
     * <ul>
     * <li>If you specify this parameter, you do not need to specify <strong>Parameters</strong>.</li>
     * <li>If the parameter template can be applied only after the instance is restarted, you must specify <strong>Forcerestart</strong>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>rpg-xxxxxxxxx</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The JSON strings of parameters and their values. All the parameter values are of the string type. Format: {&quot;Parameter name 1&quot;:&quot;Parameter value 1&quot;,&quot;Parameter name 2&quot;:&quot;Parameter value 2&quot;...}. You can call the DescribeParameterTemplates operation to query parameter names and values.</p>
     * <blockquote>
     * <p> If you specify this parameter, you do not need to specify <strong>ParameterGroupId</strong>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;delayed_insert_timeout&quot;:&quot;600&quot;,&quot;max_length_for_sort_data&quot;:&quot;2048&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The time at which the modification takes effect. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>This time must be later than the time at which you call this operation.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-05-06T09:24:00Z</p>
     */
    @NameInMap("SwitchTime")
    public String switchTime;

    /**
     * <p>The time at which the modification takes effect. Valid values:</p>
     * <ul>
     * <li><strong>Immediately</strong>: immediately modifies the parameter. This is the default value.</li>
     * <li><strong>MaintainTime</strong>: modifies the parameter during the maintenance window of the instance. You can call the ModifyDBInstanceMaintainTime operation to change the maintenance window.</li>
     * <li><strong>ScheduleTime</strong>: modifies the parameter at the point in time that you specify. If you specify this value, you must also specify <strong>SwitchTime</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ScheduleTime</p>
     */
    @NameInMap("SwitchTimeMode")
    public String switchTimeMode;

    public static ModifyParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyParameterRequest self = new ModifyParameterRequest();
        return TeaModel.build(map, self);
    }

    public ModifyParameterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ModifyParameterRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public ModifyParameterRequest setForcerestart(Boolean forcerestart) {
        this.forcerestart = forcerestart;
        return this;
    }
    public Boolean getForcerestart() {
        return this.forcerestart;
    }

    public ModifyParameterRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyParameterRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyParameterRequest setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public ModifyParameterRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyParameterRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyParameterRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyParameterRequest setSwitchTime(String switchTime) {
        this.switchTime = switchTime;
        return this;
    }
    public String getSwitchTime() {
        return this.switchTime;
    }

    public ModifyParameterRequest setSwitchTimeMode(String switchTimeMode) {
        this.switchTimeMode = switchTimeMode;
        return this;
    }
    public String getSwitchTimeMode() {
        return this.switchTimeMode;
    }

}
