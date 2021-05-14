// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyTagWithUuidRequest extends TeaModel {
    @NameInMap("UuidList")
    public String uuidList;

    @NameInMap("TagList")
    public String tagList;

    @NameInMap("TagId")
    public String tagId;

    @NameInMap("MachineTypes")
    public String machineTypes;

    public static ModifyTagWithUuidRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyTagWithUuidRequest self = new ModifyTagWithUuidRequest();
        return TeaModel.build(map, self);
    }

    public ModifyTagWithUuidRequest setUuidList(String uuidList) {
        this.uuidList = uuidList;
        return this;
    }
    public String getUuidList() {
        return this.uuidList;
    }

    public ModifyTagWithUuidRequest setTagList(String tagList) {
        this.tagList = tagList;
        return this;
    }
    public String getTagList() {
        return this.tagList;
    }

    public ModifyTagWithUuidRequest setTagId(String tagId) {
        this.tagId = tagId;
        return this;
    }
    public String getTagId() {
        return this.tagId;
    }

    public ModifyTagWithUuidRequest setMachineTypes(String machineTypes) {
        this.machineTypes = machineTypes;
        return this;
    }
    public String getMachineTypes() {
        return this.machineTypes;
    }

}
