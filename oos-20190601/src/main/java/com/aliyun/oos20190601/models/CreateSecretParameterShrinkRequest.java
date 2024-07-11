// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateSecretParameterShrinkRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). For more information, see &quot;How to ensure idempotence&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The constraints of the encryption parameter. By default, this parameter is null. Valid values:</p>
     * <ul>
     * <li>AllowedValues: The value that is allowed for the encryption parameter. It must be an array string.</li>
     * <li>AllowedPattern: The pattern that is allowed for the encryption parameter. It must be a regular expression.</li>
     * <li>MinLength: The minimum length of the encryption parameter.</li>
     * <li>MaxLength: The maximum length of the encryption parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>\&quot;{\&quot;\&quot;AllowedValues&quot;:[&quot;secretparameter&quot;],&quot;AllowedPattern&quot;:&quot;secretparameter&quot;,&quot;MinLength&quot;:0,&quot;MaxLength&quot;:20}\&quot;</p>
     */
    @NameInMap("Constraints")
    public String constraints;

    /**
     * <p>The instance ID of the KMS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>kst-hzz****</p>
     */
    @NameInMap("DKMSInstanceId")
    public String DKMSInstanceId;

    /**
     * <p>The description of the encryption parameter. The description must be 1 to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>SecretParameter</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The key ID of Key Management Service (KMS) that is used to encrypt the parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>80e9409f-78fa-42ab-84bd-83f40c******</p>
     */
    @NameInMap("KeyId")
    public String keyId;

    /**
     * <p>The name of the parameter. The name must be 1 to 180 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). It cannot start with ALIYUN, ACS, ALIBABA, ALICLOUD, or OOS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySecretParameter</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxsn4m4******</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;: &quot;v1&quot;, &quot;k2&quot;: &quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The type of the parameter. Set the value to Secret.</p>
     * 
     * <strong>example:</strong>
     * <p>Secret</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The value of the encryption parameter. The value must be 1 to 4096 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SecretParameter</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateSecretParameterShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSecretParameterShrinkRequest self = new CreateSecretParameterShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateSecretParameterShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSecretParameterShrinkRequest setConstraints(String constraints) {
        this.constraints = constraints;
        return this;
    }
    public String getConstraints() {
        return this.constraints;
    }

    public CreateSecretParameterShrinkRequest setDKMSInstanceId(String DKMSInstanceId) {
        this.DKMSInstanceId = DKMSInstanceId;
        return this;
    }
    public String getDKMSInstanceId() {
        return this.DKMSInstanceId;
    }

    public CreateSecretParameterShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateSecretParameterShrinkRequest setKeyId(String keyId) {
        this.keyId = keyId;
        return this;
    }
    public String getKeyId() {
        return this.keyId;
    }

    public CreateSecretParameterShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSecretParameterShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSecretParameterShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateSecretParameterShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateSecretParameterShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateSecretParameterShrinkRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
