// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class CreateTemplateShrinkRequest extends TeaModel {
    /**
     * <p>The content of the template. The content must be in the JSON or YAML format, and its maximum size is 64 KB.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;FormatVersion&quot;: &quot;OOS-2019-06-01&quot;, &quot;Description&quot;: &quot;Describe instances of given status&quot;, &quot;Parameters&quot;: {&quot;Status&quot;: {&quot;Type&quot;: &quot;String&quot;, &quot;Description&quot;: &quot;(Required) The status of the Ecs instance.&quot;}}, &quot;Tasks&quot;: [{&quot;Properties&quot;: {&quot;Parameters&quot;: {&quot;Status&quot;: &quot;{{ Status }}&quot;}, &quot;API&quot;: &quot;DescribeInstances&quot;, &quot;Service&quot;: &quot;Ecs&quot;}, &quot;Name&quot;: &quot;foo&quot;, &quot;Action&quot;: &quot;ACS::ExecuteApi&quot;}]}</p>
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
     * <p>The tag keys and tag values. The number of key-value pairs ranges from 1 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    /**
     * <p>The name of the template. The name can be 1 to 200 characters in length and can contain letters, digits, hyphens (-), and underscores (_). The name cannot start with ALIYUN, ACS, ALIBABA, or ALICLOUD.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MyTemplate</p>
     */
    @NameInMap("TemplateName")
    public String templateName;

    /**
     * <p>The name of the version of the template.</p>
     * 
     * <strong>example:</strong>
     * <p>v2</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static CreateTemplateShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateShrinkRequest self = new CreateTemplateShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTemplateShrinkRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public CreateTemplateShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTemplateShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTemplateShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

    public CreateTemplateShrinkRequest setTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }
    public String getTemplateName() {
        return this.templateName;
    }

    public CreateTemplateShrinkRequest setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

}
