// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerAccumulateRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the details of each topic to which the consumer group subscribes. Valid values:</p>
     * <br>
     * <p>*   **true**: The details of each topic are queried. You can obtain the details from the **DetailInTopicList** response parameter.</p>
     * <p>*   **false**: The details of each topic are not queried. This is the default value. If you use this value, the value of the **DetailInTopicList** response parameter is empty.</p>
     */
    @NameInMap("Detail")
    public Boolean detail;

    /**
     * <p>The ID of the consumer group whose message accumulation you want to query.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static OnsConsumerAccumulateRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerAccumulateRequest self = new OnsConsumerAccumulateRequest();
        return TeaModel.build(map, self);
    }

    public OnsConsumerAccumulateRequest setDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }
    public Boolean getDetail() {
        return this.detail;
    }

    public OnsConsumerAccumulateRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsConsumerAccumulateRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
