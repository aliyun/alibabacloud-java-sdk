// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateChatConfigurationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;BotName&quot;:&quot;chatops&quot;}</p>
     */
    @NameInMap("Configuration")
    public String configuration;

    /**
     * <strong>example:</strong>
     * <p>chatops</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>AliyunOOSDefaultRole</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>DingTalk</p>
     */
    @NameInMap("Type")
    public String type;

    public static CreateChatConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateChatConfigurationRequest self = new CreateChatConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateChatConfigurationRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public CreateChatConfigurationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateChatConfigurationRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public CreateChatConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateChatConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateChatConfigurationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
