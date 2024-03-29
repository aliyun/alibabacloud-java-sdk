// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class RemoveSkillGroupRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    public static RemoveSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSkillGroupRequest self = new RemoveSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSkillGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public RemoveSkillGroupRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

}
