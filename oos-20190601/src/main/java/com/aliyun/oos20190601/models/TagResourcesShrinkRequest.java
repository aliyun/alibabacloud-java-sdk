// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the resources for which you want to modify the resource group. The number of resource IDs is 1 to 50.</p>
     * <br>
     * <p>*   If you set ResourceType to template, specify ResourceIds in the \["TemplateName1","TemplateName2"] format.</p>
     * <p>*   If you set ResourceType to parameter, specify ResourceIds in the \["Name1","Name2"] format.</p>
     * <p>*   If you set ResourceType to secretparameter, specify ResourceIds in the \["Name1","Name2"] format.</p>
     * <p>*   If you set ResourceType to stateconfiguration, specify ResourceIds in the \["StateConfigurationId 1","StateConfigurationId 2"] format.</p>
     * <p>*   If you set ResourceType to application, specify ResourceIds in the \["Name1","Name2"] format.</p>
     */
    @NameInMap("ResourceIds")
    public String resourceIdsShrink;

    /**
     * <p>The type of the resource for which you want to modify the resource group. Valid values:</p>
     * <br>
     * <p>*   template: template.</p>
     * <p>*   parameter: parameter.</p>
     * <p>*   secretparameter: encryption parameter.</p>
     * <p>*   stateconfiguration: desired-state configuration.</p>
     * <p>*   application: application.</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    /**
     * <p>The tag keys and values. The number of key-value pairs ranges from 1 to 20.</p>
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
