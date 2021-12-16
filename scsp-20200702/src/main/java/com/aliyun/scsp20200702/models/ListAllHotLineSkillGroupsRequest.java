// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ListAllHotLineSkillGroupsRequest extends TeaModel {
    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ListAllHotLineSkillGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAllHotLineSkillGroupsRequest self = new ListAllHotLineSkillGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ListAllHotLineSkillGroupsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public ListAllHotLineSkillGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
