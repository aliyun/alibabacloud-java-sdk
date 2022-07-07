// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListMachineGroupRequest extends TeaModel {
    // 可将 groupName 作为 pattern 匹配名称，只会返回匹配的机器组。例如 test 可以匹配机器组 test-group。
    @NameInMap("groupName")
    public String groupName;

    // 分页请求的起始位置。默认为0。
    @NameInMap("offset")
    public Integer offset;

    // 分页查询时，设置的每页行数。最大值为500。
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
