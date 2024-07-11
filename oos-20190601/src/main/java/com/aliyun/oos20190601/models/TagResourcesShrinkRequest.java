// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the resources for which you want to modify the resource group. The number of resource IDs is 1 to 50.</p>
     * <ul>
     * <li>If you set ResourceType to template, specify ResourceIds in the [&quot;TemplateName1&quot;,&quot;TemplateName2&quot;] format.</li>
     * <li>If you set ResourceType to parameter, specify ResourceIds in the [&quot;Name1&quot;,&quot;Name2&quot;] format.</li>
     * <li>If you set ResourceType to secretparameter, specify ResourceIds in the [&quot;Name1&quot;,&quot;Name2&quot;] format.</li>
     * <li>If you set ResourceType to stateconfiguration, specify ResourceIds in the [&quot;StateConfigurationId 1&quot;,&quot;StateConfigurationId 2&quot;] format.</li>
     * <li>If you set ResourceType to application, specify ResourceIds in the [&quot;Name1&quot;,&quot;Name2&quot;] format.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;templateName1&quot;,&quot;templateName2&quot;]</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIdsShrink;

    /**
     * <p>The type of the resource for which you want to modify the resource group. Valid values:</p>
     * <ul>
     * <li>template: template.</li>
     * <li>parameter: parameter.</li>
     * <li>secretparameter: encryption parameter.</li>
     * <li>stateconfiguration: desired-state configuration.</li>
     * <li>application: application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>template</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;k1&quot;:&quot;v1&quot;,&quot;k2&quot;:&quot;v2&quot;}</p>
     */
    @NameInMap("Tags")
    public String tagsShrink;

    public static TagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesShrinkRequest self = new TagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesShrinkRequest setResourceIdsShrink(String resourceIdsShrink) {
        this.resourceIdsShrink = resourceIdsShrink;
        return this;
    }
    public String getResourceIdsShrink() {
        return this.resourceIdsShrink;
    }

    public TagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesShrinkRequest setTagsShrink(String tagsShrink) {
        this.tagsShrink = tagsShrink;
        return this;
    }
    public String getTagsShrink() {
        return this.tagsShrink;
    }

}
