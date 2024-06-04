// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseResourceGroupRequest extends TeaModel {
    /**
     * <p>The protected objects that you want to add to the protected object group. You can add multiple protected objects to a protected object group at the same time. You can specify multiple protected objects. Separate them with commas (,).</p>
     */
    @NameInMap("AddList")
    public String addList;

    /**
     * <p>The description of the protected object group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the protected object group that you want to create.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The ID of the Web Application Firewall (WAF) instance.</p>
     * <br>
     * <p>>  You can call the [DescribeInstance](https://help.aliyun.com/document_detail/433756.html) operation to obtain the ID of the WAF instance.</p>
     * <br>
     * <p>This parameter is required.</p>
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
     * <p>The ID of the resource group.</p>
     */
    @NameInMap("ResourceManagerResourceGroupId")
    public String resourceManagerResourceGroupId;

    public static CreateDefenseResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseResourceGroupRequest self = new CreateDefenseResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public CreateDefenseResourceGroupRequest setAddList(String addList) {
        this.addList = addList;
        return this;
    }
    public String getAddList() {
        return this.addList;
    }

    public CreateDefenseResourceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateDefenseResourceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateDefenseResourceGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDefenseResourceGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateDefenseResourceGroupRequest setResourceManagerResourceGroupId(String resourceManagerResourceGroupId) {
        this.resourceManagerResourceGroupId = resourceManagerResourceGroupId;
        return this;
    }
    public String getResourceManagerResourceGroupId() {
        return this.resourceManagerResourceGroupId;
    }

}
