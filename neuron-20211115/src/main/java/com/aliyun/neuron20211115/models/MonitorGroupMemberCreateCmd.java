// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class MonitorGroupMemberCreateCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("contactIds")
    public java.util.List<Long> contactIds;

    public static MonitorGroupMemberCreateCmd build(java.util.Map<String, ?> map) throws Exception {
        MonitorGroupMemberCreateCmd self = new MonitorGroupMemberCreateCmd();
        return TeaModel.build(map, self);
    }

    public MonitorGroupMemberCreateCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public MonitorGroupMemberCreateCmd setContactIds(java.util.List<Long> contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public java.util.List<Long> getContactIds() {
        return this.contactIds;
    }

}
