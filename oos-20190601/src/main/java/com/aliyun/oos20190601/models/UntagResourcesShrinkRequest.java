// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UntagResourcesShrinkRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags. This parameter takes effect only if TagKeys is left empty. Valid values: true and false. Default value: false. TagKeys is required if this parameter is set to false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("All")
    public Boolean all;

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
     * <p>The tag keys. The number of keys ranges from 1 to 20.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;k1&quot;,&quot;k2&quot;]</p>
     */
    @NameInMap("TagKeys")
    public String tagKeysShrink;

    public static UntagResourcesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesShrinkRequest self = new UntagResourcesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesShrinkRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesShrinkRequest setResourceIdsShrink(String resourceIdsShrink) {
        this.resourceIdsShrink = resourceIdsShrink;
        return this;
    }
    public String getResourceIdsShrink() {
        return this.resourceIdsShrink;
    }

    public UntagResourcesShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesShrinkRequest setTagKeysShrink(String tagKeysShrink) {
        this.tagKeysShrink = tagKeysShrink;
        return this;
    }
    public String getTagKeysShrink() {
        return this.tagKeysShrink;
    }

}
