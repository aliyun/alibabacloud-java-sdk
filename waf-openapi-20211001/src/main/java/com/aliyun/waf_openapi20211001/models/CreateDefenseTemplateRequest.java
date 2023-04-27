// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseTemplateRequest extends TeaModel {
    /**
     * <p>The scenario in which you want to use the protection rule template. For more information, see the description of the **DefenseScene** parameter in the [CreateDefenseRule](~~CreateDefenseRule~~) topic.</p>
     */
    @NameInMap("DefenseScene")
    public String defenseScene;

    /**
     * <p>The description of the protection rule template.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](~~433756~~) operation to obtain the ID of the WAF instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The region where the WAF instance resides. Valid values:</p>
     * <br>
     * <p>*   **cn-hangzhou:** the Chinese mainland.</p>
     * <p>*   **ap-southeast-1:** outside the Chinese mainland.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the Alibaba Cloud resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    /**
     * <p>The name of the protection rule template.</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The origin of the protection rule template that you want to create. Set the value to **custom**. The value specifies that the protection rule template is a custom template.</p>
     */
    @NameInMap("TemplateOrigin")
    public String templateOrigin;

    /**
     * <p>The status of the protection rule template. Valid values:</p>
     * <br>
     * <p>*   **0:** disabled.</p>
     * <p>*   **1:** enabled.</p>
     */
    @NameInMap("TemplateStatus")
    public Integer templateStatus;

    /**
     * <p>The type of the protection rule template. Valid values:</p>
     * <br>
     * <p>*   **user_default:** default template.</p>
     * <p>*   **user_custom:** custom template.</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    public static CreateDefenseTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseTemplateRequest self = new CreateDefenseTemplateRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefenseTemplateRequest setDefenseScene(String defenseScene) {
        this.defenseScene = defenseScene;
        return this;
    }
    public String getDefenseScene() {
        return this.defenseScene;
    }

    public CreateDefenseTemplateRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDefenseTemplateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDefenseTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDefenseTemplateRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

    public CreateDefenseTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateDefenseTemplateRequest setTemplateOrigin(String templateOrigin) {
        this.templateOrigin = templateOrigin;
        return this;
    }
    public String getTemplateOrigin() {
        return this.templateOrigin;
    }

    public CreateDefenseTemplateRequest setTemplateStatus(Integer templateStatus) {
        this.templateStatus = templateStatus;
        return this;
    }
    public Integer getTemplateStatus() {
        return this.templateStatus;
    }

    public CreateDefenseTemplateRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

}
