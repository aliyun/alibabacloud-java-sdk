// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMachineGroupRequest extends TeaModel {
    @NameInMap("groupName")
    public String groupName;

    @NameInMap("offset")
    public Integer offset;

    @NameInMap("size")
    public Integer size;

    public static ListMachineGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMachineGroupRequest self = new ListMachineGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListMachineGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public ListMachineGroupRequest setOffset(Integer offset) {
        this.offset = offset;
        return this;
    }
    public Integer getOffset() {
        return this.offset;
    }

    public ListMachineGroupRequest setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

}
