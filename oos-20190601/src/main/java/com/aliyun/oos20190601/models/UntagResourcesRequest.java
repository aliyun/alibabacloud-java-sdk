// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class UntagResourcesRequest extends TeaModel {
    /**
     * <p>Specifies whether to remove all tags. This parameter takes effect only if TagKeys is left empty. Valid values: true and false. Default value: false. TagKeys is required if this parameter is set to false.</p>
     */
    @NameInMap("All")
    public Boolean all;

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
    public java.util.Map<String, ?> resourceIds;

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
     * <p>The tag keys. The number of keys ranges from 1 to 20.</p>
     */
    @NameInMap("TagKeys")
    public java.util.Map<String, ?> tagKeys;

    public static UntagResourcesRequest build(java.util.Map<String, ?> map) throws Exception {
        UntagResourcesRequest self = new UntagResourcesRequest();
        return TeaModel.build(map, self);
    }

    public UntagResourcesRequest setAll(Boolean all) {
        this.all = all;
        return this;
    }
    public Boolean getAll() {
        return this.all;
    }

    public UntagResourcesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UntagResourcesRequest setResourceIds(java.util.Map<String, ?> resourceIds) {
        this.resourceIds = resourceIds;
        return this;
    }
    public java.util.Map<String, ?> getResourceIds() {
        return this.resourceIds;
    }

    public UntagResourcesRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public UntagResourcesRequest setTagKeys(java.util.Map<String, ?> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }
    public java.util.Map<String, ?> getTagKeys() {
        return this.tagKeys;
    }

}
