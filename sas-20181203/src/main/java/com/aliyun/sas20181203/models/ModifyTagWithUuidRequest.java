// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyTagWithUuidRequest extends TeaModel {
    /**
     * <p>The type of the assets whose tags you want to modify. Valid values:</p>
     * <br>
     * <p>*   **ecs**: Elastic Compute Service (ECS) instances or servers that are not deployed on Alibaba Cloud.</p>
     * <p>*   **cloud_product**: Alibaba Cloud service.</p>
     * <br>
     * <p>>  If you do not specify this parameter, the default value **ecs** is used.</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>The ID of the tag whose name you want to change.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedTags](~~DescribeGroupedTags~~) operation to query the IDs of the tags.</p>
     */
    @NameInMap("TagId")
    public String tagId;

    /**
     * <p>The tag names that you want to change. Separate multiple tag names with commas (,).</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedTags](~~DescribeGroupedTags~~) operation to query the names of the tags that are added to assets.</p>
     */
    @NameInMap("TagList")
    public String tagList;

    /**
     * <p>The UUIDs of the assets whose tags you want to modify. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of assets to which the tags are added. If you do not specify this parameter, the tags that are specified in **TagList** parameter are removed from all assets.</p>
     */
    @NameInMap("UuidList")
    public String uuidList;

    public static ModifyTagWithUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagWithUuidRequest self = new ModifyTagWithUuidRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTagWithUuidRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

    public ModifyTagWithUuidRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public ModifyTagWithUuidRequest setTagList(String tagList) {
        this.tagList = tagList;
        return this;
    }
    public String getTagList() {
        return this.tagList;
    }

    public ModifyTagWithUuidRequest setUuidList(String uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public String getUuidList() {
        return this.uuidList;
    }

}
