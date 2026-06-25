// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class CreateOrUpdateSwimmingLaneShrinkRequest extends TeaModel {
    /**
     * <p>The configuration of the gateway route.</p>
     * <blockquote>
     * <p>This parameter is required if the gateway entry application for the swimlane group is a Java application.</p>
     * </blockquote>
     */
    @NameInMap("AppEntryRule")
    public String appEntryRuleShrink;

    /**
     * <p>The end-to-end canary release mode.</p>
     * <ul>
     * <li><p><code>0</code>: content-based routing</p>
     * </li>
     * <li><p><code>1</code>: percentage-based routing</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CanaryModel")
    public Integer canaryModel;

    /**
     * <p>The status of the swimlane.</p>
     * <ul>
     * <li><p><code>true</code>: enabled</p>
     * </li>
     * <li><p><code>false</code>: disabled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The ID of the swimlane group.</p>
     * 
     * <strong>example:</strong>
     * <p>b2a8a925-477a-eswa-b823-d5e22500****</p>
     */
    @NameInMap("GroupId")
    public Long groupId;

    /**
     * <p>The ID of the swimlane.</p>
     * 
     * <strong>example:</strong>
     * <p>13857</p>
     */
    @NameInMap("LaneId")
    public Long laneId;

    /**
     * <p>The name of the swimlane.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("LaneName")
    public String laneName;

    /**
     * <p>The tag of the swimlane.</p>
     * 
     * <strong>example:</strong>
     * <p>g1</p>
     */
    @NameInMap("LaneTag")
    public String laneTag;

    /**
     * <p>Configuration for the MSE gateway route.</p>
     * <blockquote>
     * <p>This parameter is required if the <strong>EntryAppType</strong> parameter is set to <strong>apig</strong> or <strong>mse-gw</strong>.</p>
     * </blockquote>
     */
    @NameInMap("MseGatewayEntryRule")
    public String mseGatewayEntryRuleShrink;

    /**
     * <p>The ID of the namespace.</p>
     * 
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
