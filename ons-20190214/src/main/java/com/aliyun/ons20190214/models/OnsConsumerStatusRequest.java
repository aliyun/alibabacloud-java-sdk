// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerStatusRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the details of the consumer group. Valid values:</p>
     * <br>
     * <p>*   **true**: The details of the consumer group are queried. You can obtain details from the **ConsumerConnectionInfoList** and **DetailInTopicList** response parameters.</p>
     * <p>*   **false**: The details of the consumer group are not queried. The values of the **ConsumerConnectionInfoList** and **DetailInTopicList** response parameters are empty. This value is the default value of the Detail parameter.</p>
     */
    @NameInMap("Detail")
    public Boolean detail;

    /**
     * <p>The ID of the consumer group whose details you want to query.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>The ID of the instance to which the consumer group belongs.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Specifies whether to query the information about thread stack traces. Valid values:</p>
     * <br>
     * <p>*   **true**: The information about thread stack traces is queried. You can obtain the information from the **Jstack** response parameter.</p>
     * <br>
     * <p>>  If you want to obtain the information about thread stack traces, make sure that the **Detail** parameter in the request is set to **true**.</p>
     * <br>
     * <p>*   **false**: The information about thread stack traces is not queried. The value of the **Jstack** response parameter is empty. This value is the default value of the NeedJstack parameter.</p>
     */
    @NameInMap("NeedJstack")
    public Boolean needJstack;

    public static OnsConsumerStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerStatusRequest self = new OnsConsumerStatusRequest();
        return TeaModel.build(map, self);
    }

    public OnsConsumerStatusRequest setDetail(Boolean detail) {
        this.detail = detail;
        return this;
    }
    public Boolean getDetail() {
        return this.detail;
    }

    public OnsConsumerStatusRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public OnsConsumerStatusRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public OnsConsumerStatusRequest setNeedJstack(Boolean needJstack) {
        this.needJstack = needJstack;
        return this;
    }
    public Boolean getNeedJstack() {
        return this.needJstack;
    }

}
