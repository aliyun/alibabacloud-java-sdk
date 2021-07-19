// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateApplicationRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Description")
    public String description;

    @NameInMap("Type")
    public String type;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("CloudMonitorContactGroupList")
    public String cloudMonitorContactGroupList;

    @NameInMap("CloudMonitorEnableSubscribeEvent")
    public Boolean cloudMonitorEnableSubscribeEvent;

    @NameInMap("CloudMonitorEnableInstallAgent")
    public Boolean cloudMonitorEnableInstallAgent;

    @NameInMap("CloudMonitorTemplateIdList")
    public String cloudMonitorTemplateIdList;

    @NameInMap("CloudMonitorRuleEnabled")
    public Boolean cloudMonitorRuleEnabled;

    public static CreateApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRequest self = new CreateApplicationRequest();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateApplicationRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateApplicationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateApplicationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateApplicationRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateApplicationRequest setCloudMonitorContactGroupList(String cloudMonitorContactGroupList) {
        this.cloudMonitorContactGroupList = cloudMonitorContactGroupList;
        return this;
    }
    public String getCloudMonitorContactGroupList() {
        return this.cloudMonitorContactGroupList;
    }

    public CreateApplicationRequest setCloudMonitorEnableSubscribeEvent(Boolean cloudMonitorEnableSubscribeEvent) {
        this.cloudMonitorEnableSubscribeEvent = cloudMonitorEnableSubscribeEvent;
        return this;
    }
    public Boolean getCloudMonitorEnableSubscribeEvent() {
        return this.cloudMonitorEnableSubscribeEvent;
    }

    public CreateApplicationRequest setCloudMonitorEnableInstallAgent(Boolean cloudMonitorEnableInstallAgent) {
        this.cloudMonitorEnableInstallAgent = cloudMonitorEnableInstallAgent;
        return this;
    }
    public Boolean getCloudMonitorEnableInstallAgent() {
        return this.cloudMonitorEnableInstallAgent;
    }

    public CreateApplicationRequest setCloudMonitorTemplateIdList(String cloudMonitorTemplateIdList) {
        this.cloudMonitorTemplateIdList = cloudMonitorTemplateIdList;
        return this;
    }
    public String getCloudMonitorTemplateIdList() {
        return this.cloudMonitorTemplateIdList;
    }

    public CreateApplicationRequest setCloudMonitorRuleEnabled(Boolean cloudMonitorRuleEnabled) {
        this.cloudMonitorRuleEnabled = cloudMonitorRuleEnabled;
        return this;
    }
    public Boolean getCloudMonitorRuleEnabled() {
        return this.cloudMonitorRuleEnabled;
    }

}
