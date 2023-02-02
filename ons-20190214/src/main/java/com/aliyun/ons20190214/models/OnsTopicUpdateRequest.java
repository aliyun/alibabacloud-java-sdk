// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTopicUpdateRequest extends TeaModel {
    /**
     * <p>The ID of the instance to which the topic belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The read/write mode that you want to configure for the topic. Valid values:</p>
     * <br>
     * <p>*   **6:** Both read and write operations are allowed.</p>
     * <p>*   **4:** Write operations are forbidden.</p>
     * <p>*   **2:** Read operations are forbidden.</p>
     */
    @NameInMap("Perm")
    public Integer perm;

    /**
     * <p>The name of the topic that you want to manage.</p>
     */
    @NameInMap("Topic")
    public String topic;

    public static OnsTopicUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsTopicUpdateRequest self = new OnsTopicUpdateRequest();
        return TeaModel.build(map, self);
    }

    public OnsTopicUpdateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsTopicUpdateRequest setPerm(Integer perm) {
        this.perm = perm;
        return this;
    }
    public Integer getPerm() {
        return this.perm;
    }

    public OnsTopicUpdateRequest setTopic(String topic) {
        this.topic = topic;
        return this;
    }
    public String getTopic() {
        return this.topic;
    }

}
