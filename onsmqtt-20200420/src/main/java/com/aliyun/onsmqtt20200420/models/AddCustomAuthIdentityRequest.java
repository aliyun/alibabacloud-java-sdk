// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class AddCustomAuthIdentityRequest extends TeaModel {
    /**
     * <p>The client ID if you set IdentityType to CLIENT.</p>
     * 
     * <strong>example:</strong>
     * <p>GID_test@@@test</p>
     */
    @NameInMap("ClientId")
    public String clientId;

    /**
     * <p>The identity type. Valid values:</p>
     * <ul>
     * <li>USER</li>
     * <li>CLIENT</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>USER</p>
     */
    @NameInMap("IdentityType")
    public String identityType;

    /**
     * <p>The ID of the Message Queue for MQTT instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-xxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The AccessKey secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxxx</p>
     */
    @NameInMap("Secret")
    public String secret;

    /**
     * <p>The signature verification mode. ORIGIN: compares the password and the AccessKey secret. SIGNED: uses the HMAC_SHA1 algorithm to sign the client ID to obtain a password and then compares the password.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SIGNED</p>
     */
    @NameInMap("SignMode")
    public String signMode;

    /**
     * <p>The username.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    public static AddCustomAuthIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomAuthIdentityRequest self = new AddCustomAuthIdentityRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomAuthIdentityRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public AddCustomAuthIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public AddCustomAuthIdentityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public AddCustomAuthIdentityRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public AddCustomAuthIdentityRequest setSignMode(String signMode) {
        this.signMode = signMode;
        return this;
    }
    public String getSignMode() {
        return this.signMode;
    }

    public AddCustomAuthIdentityRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
