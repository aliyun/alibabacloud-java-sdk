// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class UpdateSkillGroupRequest extends TeaModel {
    // 渠道类型
    @NameInMap("ChannelType")
    public Long channelType;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("Description")
    public String description;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SkillGroupId")
    public Long skillGroupId;

    @NameInMap("SkillGroupName")
    public String skillGroupName;

    public static UpdateSkillGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSkillGroupRequest self = new UpdateSkillGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSkillGroupRequest setChannelType(Long channelType) {
        this.channelType = channelType;
        return this;
    }
    public Long getChannelType() {
        return this.channelType;
    }

    public UpdateSkillGroupRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateSkillGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateSkillGroupRequest setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public UpdateSkillGroupRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public UpdateSkillGroupRequest setSkillGroupId(Long skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public Long getSkillGroupId() {
        return this.skillGroupId;
    }

    public UpdateSkillGroupRequest setSkillGroupName(String skillGroupName) {
        this.skillGroupName = skillGroupName;
        return this;
    }
    public String getSkillGroupName() {
        return this.skillGroupName;
    }

}
