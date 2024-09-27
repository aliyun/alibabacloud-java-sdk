// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smc20190601.models;

import com.aliyun.tea.*;

public class CreateAccessTokenRequest extends TeaModel {
    /**
     * <p>The maximum number of times that the activation code can be used to import the information of migration sources. Valid values: 1 to 1000.</p>
     * <p>Default value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Count")
    public String count;

    /**
     * <p>The description of the activation code.</p>
     * 
     * <strong>example:</strong>
     * <p>The description of the activation code.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the activation code. The name must be 2 to 128 characters in length. It must start with a letter and cannot start with http:// or https://. It can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    /**
     * <p>The validity period of the activation code. The activation code can no longer be used to import the information of migration sources after the code expires. Unit: day. Valid values: 1 to 90.</p>
     * <p>Default value: 30.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("TimeToLiveInDays")
    public String timeToLiveInDays;

    public static CreateAccessTokenRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessTokenRequest self = new CreateAccessTokenRequest();
        return TeaModel.build(map, self);
    }

    public CreateAccessTokenRequest setCount(String count) {
        this.count = count;
        return this;
    }
    public String getCount() {
        return this.count;
    }

    public CreateAccessTokenRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAccessTokenRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateAccessTokenRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateAccessTokenRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public CreateAccessTokenRequest setTimeToLiveInDays(String timeToLiveInDays) {
        this.timeToLiveInDays = timeToLiveInDays;
        return this;
    }
    public String getTimeToLiveInDays() {
        return this.timeToLiveInDays;
    }

}
