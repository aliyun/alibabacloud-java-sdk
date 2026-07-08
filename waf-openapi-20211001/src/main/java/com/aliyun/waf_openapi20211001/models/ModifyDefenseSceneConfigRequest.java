// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseSceneConfigRequest extends TeaModel {
    /**
     * <p>The name of the configuration item to modify.</p>
     * <p>If <strong>DefenseScene</strong> is set to <strong>apisec</strong>, the valid value is:</p>
     * <ul>
     * <li><strong>autoEnabled</strong>: indicates whether core API security detection is automatically enabled for new resources.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>autoEnableStatus</p>
     */
    @NameInMap("ConfigKey")
    public String configKey;

    /**
     * <p>The value to set for the configuration item.</p>
     * <blockquote>
     * <p>The value of this parameter depends on the value of <strong>ConfigKey</strong>. For more information, see <strong>Description of mitigation setting parameters</strong>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("ConfigValue")
    public String configValue;

    /**
     * <p>The protection scenario for which you want to modify the mitigation settings. Valid values:</p>
     * <ul>
     * <li><strong>apisec</strong>: API security.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>apisec</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/433756.html">DescribeInstance</a> operation to query the ID of the WAF instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>waf-cn-0xldbqt****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <ul>
     * <li><p><strong>cn-hangzhou</strong>: the Chinese mainland.</p>
     * </li>
     * <li><p><strong>ap-southeast-1</strong>: outside the Chinese mainland.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm***q</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static ModifyDefenseSceneConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseSceneConfigRequest self = new ModifyDefenseSceneConfigRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseSceneConfigRequest setConfigKey(String configKey) {
        this.configKey = configKey;
        return this;
    }
    public String getConfigKey() {
        return this.configKey;
    }

    public ModifyDefenseSceneConfigRequest setConfigValue(String configValue) {
        this.configValue = configValue;
        return this;
    }
    public String getConfigValue() {
        return this.configValue;
    }

    public ModifyDefenseSceneConfigRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public ModifyDefenseSceneConfigRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyDefenseSceneConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyDefenseSceneConfigRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
