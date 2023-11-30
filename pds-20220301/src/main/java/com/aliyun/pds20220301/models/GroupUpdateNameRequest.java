// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class GroupUpdateNameRequest extends TeaModel {
    @NameInMap("group_id")
    public String groupId;

    @NameInMap("name")
    public String name;

    public static GroupUpdateNameRequest build(java.util.Map<String, ?> map) throws Exception {
        GroupUpdateNameRequest self = new GroupUpdateNameRequest();
        return TeaModel.build(map, self);
    }

    public GroupUpdateNameRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public GroupUpdateNameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
