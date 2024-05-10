// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyTagWithUuidRequest extends TeaModel {
    /**
     * <p>The type of the asset to query. If you do not specify this parameter, the tags of all asset types are queried. Valid values:</p>
     * <br>
     * <p>*   **ecs**: server</p>
     * <p>*   **cloud_product**: Alibaba Cloud service</p>
     */
    @NameInMap("MachineTypes")
    public String machineTypes;

    /**
     * <p>The ID of the tag that you want to manage.</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedTags](~~DescribeGroupedTags~~) operation to query the IDs of tags.</p>
     */
    @NameInMap("TagId")
    public String tagId;

    /**
     * <p>The names of the tags that you want to manage. Separate multiple tag names with commas (,).</p>
     * <br>
     * <p>>  You can call the [DescribeGroupedTags](~~DescribeGroupedTags~~) operation to query the names of tags.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TagList")
    public String tagList;

    /**
     * <p>The details of the server for which you want to manage the tag. The value of this parameter is in the JSON format and contains the following fields:</p>
     * <br>
     * <p>*   **Target**: the UUID of the server that you want to add or remove.</p>
     * <br>
     * <p>*   **targetType**: the method by which the server is added. Valid values:</p>
     * <br>
     * <p>    *   **uuid**: by server</p>
     * <p>    *   **groupId**: by server group</p>
     * <br>
     * <p>*   **flag**: the operation that you want to perform on the server. Valid values:</p>
     * <br>
     * <p>    *   **del**: removes the tag from the server.</p>
     * <p>    *   **add**: adds the tag to the server.</p>
     */
    @NameInMap("Target")
    public String target;

    /**
     * <p>The UUIDs of the servers.</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
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

    public ModifyTagWithUuidRequest setTarget(String target) {
        this.target = target;
        return this;
    }
    public String getTarget() {
        return this.target;
    }

    public ModifyTagWithUuidRequest setUuidList(String uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public String getUuidList() {
        return this.uuidList;
    }

}
