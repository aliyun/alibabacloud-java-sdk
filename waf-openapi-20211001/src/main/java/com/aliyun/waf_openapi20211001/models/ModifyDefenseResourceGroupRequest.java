// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseResourceGroupRequest extends TeaModel {
    @NameInMap("AddList")
    public String addList;

    @NameInMap("DeleteList")
    public String deleteList;

    @NameInMap("Description")
    public String description;

    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ModifyDefenseResourceGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseResourceGroupRequest self = new ModifyDefenseResourceGroupRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseResourceGroupRequest setAddList(String addList) {
        this.addList = addList;
        return this;
    }
    public String getAddList() {
        return this.addList;
    }

    public ModifyDefenseResourceGroupRequest setDeleteList(String deleteList) {
        this.deleteList = deleteList;
        return this;
    }
    public String getDeleteList() {
        return this.deleteList;
    }

    public ModifyDefenseResourceGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyDefenseResourceGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ModifyDefenseResourceGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
