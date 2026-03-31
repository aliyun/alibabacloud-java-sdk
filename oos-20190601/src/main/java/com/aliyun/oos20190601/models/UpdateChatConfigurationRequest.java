// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateChatConfigurationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>{&quot;BotName&quot;:&quot;chatops&quot;}</p>
     */
    @NameInMap("Configuration")
    public String configuration;

    /**
     * <strong>example:</strong>
     * <p>Ginlong-AIops</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>AliyunOOSLifecycleHook4CSRole</p>
     */
    @NameInMap("RamRole")
    public String ramRole;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>rg-2cd3****9dc2</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <strong>example:</strong>
     * <p>DingTalk</p>
     */
    @NameInMap("Type")
    public String type;

    public static UpdateChatConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatConfigurationRequest self = new UpdateChatConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChatConfigurationRequest setConfiguration(String configuration) {
        this.configuration = configuration;
        return this;
    }
    public String getConfiguration() {
        return this.configuration;
    }

    public UpdateChatConfigurationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateChatConfigurationRequest setRamRole(String ramRole) {
        this.ramRole = ramRole;
        return this;
    }
    public String getRamRole() {
        return this.ramRole;
    }

    public UpdateChatConfigurationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateChatConfigurationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateChatConfigurationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
