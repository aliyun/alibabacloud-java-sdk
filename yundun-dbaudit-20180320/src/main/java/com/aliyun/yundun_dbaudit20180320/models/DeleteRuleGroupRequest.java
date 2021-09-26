// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20180320.models;

import com.aliyun.tea.*;

public class DeleteRuleGroupRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("GroupKeyId")
    public String groupKeyId;

    public static DeleteRuleGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteRuleGroupRequest self = new DeleteRuleGroupRequest();
        return TeaModel.build(map, self);
    }

    public DeleteRuleGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteRuleGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteRuleGroupRequest setGroupKeyId(String groupKeyId) {
        this.groupKeyId = groupKeyId;
        return this;
    }
    public String getGroupKeyId() {
        return this.groupKeyId;
    }

}
