// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class ListPoliciesForGroupRequest extends TeaModel {
    /**
     * <p>The name of the RAM user group.</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    public static ListPoliciesForGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPoliciesForGroupRequest self = new ListPoliciesForGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListPoliciesForGroupRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

}
