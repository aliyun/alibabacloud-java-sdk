// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class CreateTopicShrinkRequest extends TeaModel {
    @NameInMap("BodyData")
    public String bodyDataShrink;

    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TopicDefinition")
    public String topicDefinition;

    @NameInMap("TopicName")
    public String topicName;

    /**
     * <strong>example:</strong>
     * <p>643168</p>
     */
    @NameInMap("WorkspaceId")
    public Long workspaceId;

    public static CreateTopicShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTopicShrinkRequest self = new CreateTopicShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateTopicShrinkRequest setBodyDataShrink(String bodyDataShrink) {
        this.bodyDataShrink = bodyDataShrink;
        return this;
    }
    public String getBodyDataShrink() {
        return this.bodyDataShrink;
    }

    public CreateTopicShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTopicShrinkRequest setTopicDefinition(String topicDefinition) {
        this.topicDefinition = topicDefinition;
        return this;
    }
    public String getTopicDefinition() {
        return this.topicDefinition;
    }

    public CreateTopicShrinkRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

    public CreateTopicShrinkRequest setWorkspaceId(Long workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

}
