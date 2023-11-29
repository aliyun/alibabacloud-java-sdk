// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMachineGroupRequest extends TeaModel {
    /**
     * <p>The name of the machine group. This parameter is used to filter machine groups. Partial match is supported.</p>
     */
    @NameInMap("groupName")
    public String groupName;

    /**
     * <p>The line from which the query starts. Default value: 0.</p>
     */
    @NameInMap("offset")
    public Integer offset;

    /**
     * <p>The number of entries per page. Maximum value: 500.</p>
     */
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
