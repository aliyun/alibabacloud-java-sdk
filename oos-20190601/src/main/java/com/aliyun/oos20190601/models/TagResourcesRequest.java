// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class TagResourcesRequest extends TeaModel {
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
    public java.util.Map<String, ?> resourceIds;

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
    public java.util.Map<String, ?> tags;

    public static TagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        TagResourcesRequest self = new TagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public TagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public TagResourcesRequest setResourceIds(java.util.Map<String, ?> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.Map<String, ?> getResourceIds() {
        return this.resourceIds;
    }

    public TagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public TagResourcesRequest setTags(java.util.Map<String, ?> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.Map<String, ?> getTags() {
        return this.tags;
    }

}
