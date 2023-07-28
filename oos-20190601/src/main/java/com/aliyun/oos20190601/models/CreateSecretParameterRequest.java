// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateSecretParameterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_). For more information, see "How to ensure idempotence".</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The constraints of the encryption parameter. By default, this parameter is null. Valid values:</p>
     * <br>
     * <p>*   AllowedValues: The value that is allowed for the encryption parameter. It must be an array string.</p>
     * <p>*   AllowedPattern: The pattern that is allowed for the encryption parameter. It must be a regular expression.</p>
     * <p>*   MinLength: The minimum length of the encryption parameter.</p>
     * <p>*   MaxLength: The maximum length of the encryption parameter.</p>
     */
    @NameInMap("Constraints")
    public String constraints;

    /**
     * <p>The description of the encryption parameter. The description must be 1 to 200 characters in length.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The key ID of Key Management Service (KMS) that is used to encrypt the parameter.</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The name of the parameter. The name must be 1 to 180 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_). It cannot start with ALIYUN, ACS, ALIBABA, ALICLOUD, or OOS.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The data type of the parameter. Set the value to Secret.</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The value of the encryption parameter. The value must be 1 to 4096 characters in length.</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateSecretParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretParameterRequest self = new CreateSecretParameterRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretParameterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSecretParameterRequest setConstraints(String constraints) {
        this.constraints = constraints;
        return this;
    }
    public String getConstraints() {
        return this.constraints;
    }

    public CreateSecretParameterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecretParameterRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public CreateSecretParameterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSecretParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSecretParameterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSecretParameterRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateSecretParameterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateSecretParameterRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
