// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <p>The content of the template. The content must be in the JSON or YAML format, and its maximum size is 64 KB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{ &quot;FormatVersion&quot;: &quot;OOS-2019-06-01&quot;, &quot;Description&quot;: { &quot;en&quot;: &quot;Bulky starts the ECS instances&quot;, &quot;name-en&quot;: &quot;Bulky Start Instances&quot;, }, &quot;Parameters&quot;: { &quot;regionId&quot;: { &quot;Type&quot;: &quot;String&quot;, &quot;Label&quot;: { &quot;en&quot;: &quot;RegionId&quot;, }, &quot;AssociationProperty&quot;: &quot;RegionId&quot;, &quot;Default&quot;: &quot;{{ ACS::RegionId }}&quot; }, &quot;targets&quot;: { &quot;Type&quot;: &quot;Json&quot;, &quot;Label&quot;: { &quot;en&quot;: &quot;TargetInstance&quot;, }, &quot;AssociationProperty&quot;: &quot;Targets&quot;, &quot;AssociationPropertyMetadata&quot;: { &quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;RegionId&quot;: &quot;regionId&quot; } }, &quot;rateControl&quot;: { &quot;Label&quot;: { &quot;en&quot;: &quot;RateControl&quot;, }, &quot;Type&quot;: &quot;Json&quot;, &quot;AssociationProperty&quot;: &quot;RateControl&quot;, &quot;Default&quot;: { &quot;Mode&quot;: &quot;Concurrency&quot;, &quot;MaxErrors&quot;: 0, &quot;Concurrency&quot;: 10 } }, &quot;OOSAssumeRole&quot;: { &quot;Label&quot;: { &quot;en&quot;: &quot;OOSAssumeRole&quot;, }, &quot;Type&quot;: &quot;String&quot;, &quot;Default&quot;: &quot;OOSServiceRole&quot; } }, &quot;RamRole&quot;: &quot;{{ OOSAssumeRole }}&quot;, &quot;Tasks&quot;: [ { &quot;Name&quot;: &quot;getInstance&quot;, &quot;Description&quot;: { &quot;en&quot;: &quot;Views the ECS instances&quot;, }, &quot;Action&quot;: &quot;ACS::SelectTargets&quot;, &quot;Properties&quot;: { &quot;ResourceType&quot;: &quot;ALIYUN::ECS::Instance&quot;, &quot;RegionId&quot;: &quot;{{ regionId }}&quot;, &quot;Filters&quot;: [ &quot;{{ targets }}&quot; ] }, &quot;Outputs&quot;: { &quot;instanceIds&quot;: { &quot;Type&quot;: &quot;List&quot;, &quot;ValueSelector&quot;: &quot;Instances.Instance[].InstanceId&quot; } } }, { &quot;Name&quot;: &quot;startInstance&quot;, &quot;Action&quot;: &quot;ACS::ECS::StartInstance&quot;, &quot;Description&quot;: { &quot;en&quot;: &quot;Starts the ECS instances&quot;, }, &quot;Properties&quot;: { &quot;regionId&quot;: &quot;{{ regionId }}&quot;, &quot;instanceId&quot;: &quot;{{ ACS::TaskLoopItem }}&quot; }, &quot;Loop&quot;: { &quot;RateControl&quot;: &quot;{{ rateControl }}&quot;, &quot;Items&quot;: &quot;{{ getInstance.instanceIds }}&quot; } } ], &quot;Outputs&quot;: { &quot;instanceIds&quot;: { &quot;Type&quot;: &quot;List&quot;, &quot;Value&quot;: &quot;{{ getInstance.instanceIds }}&quot; } } }</p>
     */
    @NameInMap("Content")
    public String content;

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
     * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;k2&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public java.util.Map<String, ?> tags;

    /**
     * <p>The name of the template. The name can be up to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (_). The name cannot start with ALIYUN, ACS, ALIBABA, or ALICLOUD.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The name of the template version.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public UpdateTemplateRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTemplateRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateTemplateRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

    public UpdateTemplateRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public UpdateTemplateRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
