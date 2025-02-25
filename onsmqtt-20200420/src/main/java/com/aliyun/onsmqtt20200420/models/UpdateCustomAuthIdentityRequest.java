// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class UpdateCustomAuthIdentityRequest extends TeaModel {
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
     * <p>The ID of the ApsaraMQ for MQTT instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>post-111****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The AccessKey secret.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx</p>
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
     * <p>The username. The value cannot exceed 64 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Username")
    public String username;

    public static UpdateCustomAuthIdentityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomAuthIdentityRequest self = new UpdateCustomAuthIdentityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomAuthIdentityRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UpdateCustomAuthIdentityRequest setIdentityType(String identityType) {
        this.identityType = identityType;
        return this;
    }
    public String getIdentityType() {
        return this.identityType;
    }

    public UpdateCustomAuthIdentityRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateCustomAuthIdentityRequest setSecret(String secret) {
        this.secret = secret;
        return this;
    }
    public String getSecret() {
        return this.secret;
    }

    public UpdateCustomAuthIdentityRequest setSignMode(String signMode) {
        this.signMode = signMode;
        return this;
    }
    public String getSignMode() {
        return this.signMode;
    }

    public UpdateCustomAuthIdentityRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
