// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.onsmqtt20200420.models;

import com.aliyun.tea.*;

public class DeleteWildcardByTopicRequest extends TeaModel {
    /**
     * <p>The first-level topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("FirstTopic")
    public String firstTopic;

    /**
     * <p>The ID of the instance to which the group ID that you want to delete belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mqtt-cn-0pp1ldu****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The wildcard subscriptions to delete.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test/#</p>
     */
    @NameInMap("Wildcards")
    public String wildcards;

    public static DeleteWildcardByTopicRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWildcardByTopicRequest self = new DeleteWildcardByTopicRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWildcardByTopicRequest setFirstTopic(String firstTopic) {
        this.firstTopic = firstTopic;
        return this;
    }
    public String getFirstTopic() {
        return this.firstTopic;
    }

    public DeleteWildcardByTopicRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DeleteWildcardByTopicRequest setWildcards(String wildcards) {
        this.wildcards = wildcards;
        return this;
    }
    public String getWildcards() {
        return this.wildcards;
    }

}
