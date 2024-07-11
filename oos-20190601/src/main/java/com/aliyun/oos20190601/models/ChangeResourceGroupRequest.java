// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ChangeResourceGroupRequest extends TeaModel {
    /**
     * <p>The ID of the resource group to which the cloud resource is to be moved. You can use resource groups to manage resources owned by your Alibaba Cloud account. Resource groups simplify the resource and permission management of your Alibaba Cloud account. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfm3peow3k****</p>
     */
    @NameInMap("NewResourceGroupId")
    public String newResourceGroupId;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the cloud resource that you want to move to another resource group.</p>
     * <ul>
     * <li>If the ResourceType parameter is set to template, set the ResourceId parameter to the name of the template.</li>
     * <li>If the ResourceType parameter is set to parameter, set the ResourceId parameter to the name of the parameter.</li>
     * <li>If the ResourceType parameter is set to secretparameter, set the ResourceId parameter to the name of the encryption parameter.</li>
     * <li>If the ResourceType parameter is set to stateconfiguration, set the ResourceId parameter to the ID of the desired-state configuration.</li>
     * <li>If the ResourceType parameter is set to application, set the ResourceId parameter to the name of the application.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>TemplateName</p>
     */
    @NameInMap("ResourceId")
    public String resourceId;

    /**
     * <p>The type of the cloud resource. Valid values:</p>
     * <ul>
     * <li>template: template</li>
     * <li>parameter: parameter</li>
     * <li>secretparameter: encryption parameter</li>
     * <li>stateconfiguration: desired-state configuration</li>
     * <li>application: application</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>template</p>
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
