// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class UpdateTopicShrinkRequest extends TeaModel {
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

    /**
     * <strong>example:</strong>
     * <p>216</p>
     */
    @NameInMap("TopicId")
    public Long topicId;

    @NameInMap("TopicName")
    public String topicName;

    public static UpdateTopicShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTopicShrinkRequest self = new UpdateTopicShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTopicShrinkRequest setBodyDataShrink(String bodyDataShrink) {
        this.bodyDataShrink = bodyDataShrink;
        return this;
    }
    public String getBodyDataShrink() {
        return this.bodyDataShrink;
    }

    public UpdateTopicShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTopicShrinkRequest setTopicDefinition(String topicDefinition) {
        this.topicDefinition = topicDefinition;
        return this;
    }
    public String getTopicDefinition() {
        return this.topicDefinition;
    }

    public UpdateTopicShrinkRequest setTopicId(Long topicId) {
        this.topicId = topicId;
        return this;
    }
    public Long getTopicId() {
        return this.topicId;
    }

    public UpdateTopicShrinkRequest setTopicName(String topicName) {
        this.topicName = topicName;
        return this;
    }
    public String getTopicName() {
        return this.topicName;
    }

}
