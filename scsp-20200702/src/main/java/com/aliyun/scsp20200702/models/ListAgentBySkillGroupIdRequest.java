// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class ListAgentBySkillGroupIdRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupId")
    public Long skillGroupId;

    public static ListAgentBySkillGroupIdRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentBySkillGroupIdRequest self = new ListAgentBySkillGroupIdRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentBySkillGroupIdRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ListAgentBySkillGroupIdRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentBySkillGroupIdRequest setSkillGroupId(Long skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

}
