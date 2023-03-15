// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorGroupMemberDeleteCmd extends TeaModel {
    @NameInMap("contactIds")
    public java.util.List<Long> contactIds;

    @NameInMap("groupId")
    public Long groupId;

    public static MonitorGroupMemberDeleteCmd build(java.util.Map<String, ?> map) throws Exception {
        MonitorGroupMemberDeleteCmd self = new MonitorGroupMemberDeleteCmd();
        return TeaModel.build(map, self);
    }

    public MonitorGroupMemberDeleteCmd setContactIds(java.util.List<Long> contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public java.util.List<Long> getContactIds() {
        return this.contactIds;
    }

    public MonitorGroupMemberDeleteCmd setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

}
