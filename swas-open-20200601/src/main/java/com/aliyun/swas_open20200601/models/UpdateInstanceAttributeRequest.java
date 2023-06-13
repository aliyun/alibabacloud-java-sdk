// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class UpdateInstanceAttributeRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must ensure that it is unique among different requests. The token can only contain ASCII characters and cannot exceed 64 characters in length.**** For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The ID of the simple application server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The new name of the simple application server. The name must be 2 to 128 characters in length. It must start with a letter but cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-).</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>The new password of the simple application server. The password must be 8 to 30 characters in length. It must contain at least three of the following character types: uppercase letters, lowercase letters, digits, and special characters. Special characters include</p>
     * <br>
     * <p>`( ) ~ ! @ # $ % ^ & * - + = | { } [ ] : ; < > , . ? /`</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <p>The region ID of the simple application server.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static UpdateInstanceAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAttributeRequest self = new UpdateInstanceAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateInstanceAttributeRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateInstanceAttributeRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public UpdateInstanceAttributeRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public UpdateInstanceAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
