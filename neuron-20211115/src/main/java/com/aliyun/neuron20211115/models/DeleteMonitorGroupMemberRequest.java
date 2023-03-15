// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class DeleteMonitorGroupMemberRequest extends TeaModel {
    @NameInMap("contactIds")
    public String contactIds;

    public static DeleteMonitorGroupMemberRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteMonitorGroupMemberRequest self = new DeleteMonitorGroupMemberRequest();
        return TeaModel.build(map, self);
    }

    public DeleteMonitorGroupMemberRequest setContactIds(String contactIds) {
        this.contactIds = contactIds;
        return this;
    }
    public String getContactIds() {
        return this.contactIds;
    }

}
