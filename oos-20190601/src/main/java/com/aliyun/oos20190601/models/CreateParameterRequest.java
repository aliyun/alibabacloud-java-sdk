// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateParameterRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). For more information, see &quot;How to ensure idempotence&quot;.</p>
     * 
     * <strong>example:</strong>
     * <p>123e4567-e89b-12d3-a456-42665544****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The constraints of the common parameter. By default, this parameter is null. Valid values:</p>
     * <ul>
     * <li>AllowedValues: The value that is allowed for the common parameter. It must be an array string.</li>
     * <li>AllowedPattern: The pattern that is allowed for the common parameter. It must be a regular expression.</li>
     * <li>MinLength: The minimum length of the common parameter.</li>
     * <li>MaxLength: The maximum length of the common parameter.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{
     *     &quot;AllowedValues&quot;: [
     *         &quot;parameter&quot;
     *     ],
     *     &quot;AllowedPattern&quot;: &quot;parameter&quot;,
     *     &quot;MinLength&quot;: 0,
     *     &quot;MaxLength&quot;: 20
     * }</p>
     */
    @NameInMap("Constraints")
    public String constraints;

    /**
     * <p>The description of the common parameter. The description must be 1 to 200 characters in length.</p>
     * 
     * <strong>example:</strong>
     * <p>parameter</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the parameter. The name must be 1 to 200 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). It cannot start with ALIYUN, ACS, ALIBABA, ALICLOUD, or OOS.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyParameter</p>
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
    public java.util.Map<String, ?> tags;

    /**
     * <p>The data type of the parameter. Valid values: String and StringList.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>String</p>
     */
    @NameInMap("Type")
    public String type;

    /**
     * <p>The value of the common parameter. The value must be 1 to 4096 characters in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>parameter</p>
     */
    @NameInMap("Value")
    public String value;

    public static CreateParameterRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateParameterRequest self = new CreateParameterRequest();
        return TeaModel.build(map, self);
    }

    public CreateParameterRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateParameterRequest setConstraints(String constraints) {
        this.constraints = constraints;
        return this;
    }
    public String getConstraints() {
        return this.constraints;
    }

    public CreateParameterRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateParameterRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateParameterRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateParameterRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateParameterRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public CreateParameterRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateParameterRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

}
