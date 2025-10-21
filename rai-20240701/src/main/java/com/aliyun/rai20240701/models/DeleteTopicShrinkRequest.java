// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rai20240701.models;

import com.aliyun.tea.*;

public class DeleteTopicShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("TopicIdList")
    public String topicIdListShrink;

    public static DeleteTopicShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTopicShrinkRequest self = new DeleteTopicShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTopicShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteTopicShrinkRequest setTopicIdListShrink(String topicIdListShrink) {
        this.topicIdListShrink = topicIdListShrink;
        return this;
    }
    public String getTopicIdListShrink() {
        return this.topicIdListShrink;
    }

}
