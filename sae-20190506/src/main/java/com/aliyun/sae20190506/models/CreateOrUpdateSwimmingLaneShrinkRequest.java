// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneShrinkRequest extends TeaModel {
    @NameInMap("AppEntryRule")
    public String appEntryRuleShrink;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CanaryModel")
    public Integer canaryModel;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <strong>example:</strong>
     * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <strong>example:</strong>
     * <p>13857</p>
     */
    @NameInMap("LaneId")
    public Long laneId;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("LaneName")
    public String laneName;

    /**
     * <strong>example:</strong>
     * <p>{&quot;alicloud.service.tag&quot;:&quot;g1&quot;}</p>
     */
    @NameInMap("LaneTag")
    public String laneTag;

    @NameInMap("MseGatewayEntryRule")
    public String mseGatewayEntryRuleShrink;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing:test</p>
     */
    @NameInMap("NamespaceId")
    public String namespaceId;

    public static CreateOrUpdateSwimmingLaneShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateSwimmingLaneShrinkRequest self = new CreateOrUpdateSwimmingLaneShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setAppEntryRuleShrink(String appEntryRuleShrink) {
        this.appEntryRuleShrink = appEntryRuleShrink;
        return this;
    }
    public String getAppEntryRuleShrink() {
        return this.appEntryRuleShrink;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setCanaryModel(Integer canaryModel) {
        this.canaryModel = canaryModel;
        return this;
    }
    public Integer getCanaryModel() {
        return this.canaryModel;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setGroupId(Long groupId) {
        this.groupId = groupId;
        return this;
    }
    public Long getGroupId() {
        return this.groupId;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setLaneId(Long laneId) {
        this.laneId = laneId;
        return this;
    }
    public Long getLaneId() {
        return this.laneId;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setLaneName(String laneName) {
        this.laneName = laneName;
        return this;
    }
    public String getLaneName() {
        return this.laneName;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setLaneTag(String laneTag) {
        this.laneTag = laneTag;
        return this;
    }
    public String getLaneTag() {
        return this.laneTag;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setMseGatewayEntryRuleShrink(String mseGatewayEntryRuleShrink) {
        this.mseGatewayEntryRuleShrink = mseGatewayEntryRuleShrink;
        return this;
    }
    public String getMseGatewayEntryRuleShrink() {
        return this.mseGatewayEntryRuleShrink;
    }

    public CreateOrUpdateSwimmingLaneShrinkRequest setNamespaceId(String namespaceId) {
        this.namespaceId = namespaceId;
        return this;
    }
    public String getNamespaceId() {
        return this.namespaceId;
    }

}
