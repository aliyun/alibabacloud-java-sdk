// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the cloud resource is to be moved. You can use resource groups to manage resources owned by your Alibaba Cloud account. Resource groups simplify the resource and permission management of your Alibaba Cloud account. For more information, see [What is Resource Management?](~~94475~~)</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the cloud resource that you want to move to another resource group.</p>
     * <br>
     * <p>*   If the ResourceType parameter is set to template, set the ResourceId parameter to the name of the template.</p>
     * <p>*   If the ResourceType parameter is set to parameter, set the ResourceId parameter to the name of the parameter.</p>
     * <p>*   If the ResourceType parameter is set to secretparameter, set the ResourceId parameter to the name of the encryption parameter.</p>
     * <p>*   If the ResourceType parameter is set to stateconfiguration, set the ResourceId parameter to the ID of the desired-state configuration.</p>
     * <p>*   If the ResourceType parameter is set to application, set the ResourceId parameter to the name of the application.</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the cloud resource. Valid values:</p>
     * <br>
     * <p>*   template: template</p>
     * <p>*   parameter: parameter</p>
     * <p>*   secretparameter: encryption parameter</p>
     * <p>*   stateconfiguration: desired-state configuration</p>
     * <p>*   application: application</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static ChangeResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ChangeResourceGroupRequest self = new ChangeResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ChangeResourceGroupRequest setNewResourceGroupId(String newResourceGroupId) {
        this.newResourceGroupId = newResourceGroupId;
        return this;
    }
    public String getNewResourceGroupId() {
        return this.newResourceGroupId;
    }

    public ChangeResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ChangeResourceGroupRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public ChangeResourceGroupRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
