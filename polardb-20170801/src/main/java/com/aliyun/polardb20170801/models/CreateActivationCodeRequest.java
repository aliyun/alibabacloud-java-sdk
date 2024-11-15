// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class CreateActivationCodeRequest extends TeaModel {
    /**
     * <p>The Alibaba Cloud order ID (including the virtual order ID).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2233****445566</p>
     */
    @NameInMap("AliyunOrderId")
    public String aliyunOrderId;

    /**
     * <p>The description of the activation code.</p>
     * 
     * <strong>example:</strong>
     * <p>testCode</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The MAC address.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12:34:56:78:98:00</p>
     */
    @NameInMap("MacAddress")
    public String macAddress;

    /**
     * <p>The name of the activation code. The name can contain only letters, digits, underscores (_), and hyphens (-). The activation code file downloaded from the console is named based on this name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testName</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The system identifier of the database. This parameter is required if you set AllowEmptySystemIdentifier to false.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123456</p>
     */
    @NameInMap("SystemIdentifier")
    public String systemIdentifier;

    public static CreateActivationCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateActivationCodeRequest self = new CreateActivationCodeRequest();
        return TeaModel.build(map, self);
    }

    public CreateActivationCodeRequest setAliyunOrderId(String aliyunOrderId) {
        this.aliyunOrderId = aliyunOrderId;
        return this;
    }
    public String getAliyunOrderId() {
        return this.aliyunOrderId;
    }

    public CreateActivationCodeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateActivationCodeRequest setMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }
    public String getMacAddress() {
        return this.macAddress;
    }

    public CreateActivationCodeRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateActivationCodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public CreateActivationCodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateActivationCodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateActivationCodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public CreateActivationCodeRequest setSystemIdentifier(String systemIdentifier) {
        this.systemIdentifier = systemIdentifier;
        return this;
    }
    public String getSystemIdentifier() {
        return this.systemIdentifier;
    }

}
